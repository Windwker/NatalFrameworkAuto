package com.natalframework.cucumber.checkbox;

import com.natalframework.screenplay.questions.checkboxbasico.EstadoCheckBoxSimple;
import com.natalframework.screenplay.questions.checkboxmultiple.EstadoCheckBoxMultiple;
import com.natalframework.screenplay.questions.checkboxmultiple.ListadoCheckBoxDisponibles;
import com.natalframework.screenplay.questions.checkboxmultiple.ListadoCheckBoxSeleccionados;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.checkboxbasico.SeleccionarCheckboxSimple;
import com.natalframework.screenplay.tasks.checkboxmultiple.SeleccionarCheckboxMultiple;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;

public class CheckboxUserStepdefs {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^me encuentro en la website de checkbox basico$")
    public void meEncuentroEnLaWebsiteDeCheckboxBasico() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeCheckBoxBasico());
    }

    @Cuando("^hago click en el checkbox$")
    public void hagoClickEnElCheckbox() {

        theActorInTheSpotlight().attemptsTo(SeleccionarCheckboxSimple.ahora());

    }


    @Entonces("^el checkbox se deselecciona$")
    public void elCheckboxSeDeselecciona() {
        theActorInTheSpotlight().should(seeThat(EstadoCheckBoxSimple.es(), equalTo("Sin Checkear")));
    }


    @Entonces("^el checkbox se selecciona$")
    public void elCheckboxSeSelecciona() {
        theActorInTheSpotlight().should(seeThat(EstadoCheckBoxSimple.es(), equalTo("Checkeado")));

    }

    @Dado("^me encuentro en la website de checkbox multiple$")
    public void meEncuentroEnLaWebsiteDeCheckboxMultiple() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeCheckBoxMultiple());
    }

    @Cuando("^hago click en todos los checkbox$")
    public void hagoClickEnTodosLosCheckbox() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCheckboxMultiple.ahora());
    }

    @Entonces("^los checkbox se seleccionan$")
    public void losCheckboxSeSeleccionan() {
        theActorInTheSpotlight().should(seeThat(EstadoCheckBoxMultiple.elementosSeleccionados(), equalTo(ListadoCheckBoxDisponibles.es().answeredBy(theActorInTheSpotlight()))));

    }

    @Y("^se muestra la seleccion en la seccion Los que te gustan son$")
    public void seMuestraLaSeleccionEnLaSeccionLosQueTeGustanSon() {
        theActorInTheSpotlight().should(seeThat(ListadoCheckBoxSeleccionados.es() , equalTo(EstadoCheckBoxMultiple.elementosSeleccionados().answeredBy(theActorInTheSpotlight()))));
    }
}
