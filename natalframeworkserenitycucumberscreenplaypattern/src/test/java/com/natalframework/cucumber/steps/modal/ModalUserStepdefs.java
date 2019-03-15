package com.natalframework.cucumber.steps.modal;

import com.natalframework.screenplay.questions.modal.ElementosDelModal;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.modal.AbrirElModal;
import com.natalframework.screenplay.tasks.modal.CerrarElModal;
import com.natalframework.screenplay.user_interface.Modal;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;

public class ModalUserStepdefs {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^que me encuentro en el website del modal$")
    public void queMeEncuentroEnElWebsiteDelModal() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeModal());

    }

    @Cuando("^presiono Abrir modal$")
    public void presionoAbrirModal() {
        theActorInTheSpotlight().attemptsTo(AbrirElModal.ahora());
    }

    @Entonces("^el modal se abre con las siguientes secciones$")
    public void elModalSeAbreConLasSiguientesSecciones(List<String> arg0) {
        theActorInTheSpotlight().should(eventually(seeThat(the(Modal.CONTENEDOR), isVisible())));
        theActorInTheSpotlight().should(seeThat(ElementosDelModal.valores(), equalTo(arg0)));
    }

    @Y("^presiono cerrar$")
    public void presionoCerrar() {

        theActorInTheSpotlight().attemptsTo(CerrarElModal.ahora());
    }

    @Entonces("^el modal se cierra$")
    public void elModalSeCierra() {
        theActorInTheSpotlight().should(eventually(seeThat(the(Modal.CONTENEDOR), isNotVisible())));
    }


}
