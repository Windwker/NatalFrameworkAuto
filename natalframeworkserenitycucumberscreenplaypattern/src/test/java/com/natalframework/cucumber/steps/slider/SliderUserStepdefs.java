package com.natalframework.cucumber.steps.slider;

import com.natalframework.screenplay.questions.slider.ValorEnElLabel;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.slider.ComprobarComportamientoSlider;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;

public class SliderUserStepdefs {

    private Actor javi;
    private String whatJaviRemembers;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        javi = theActorCalled("Javi");
    }


    @Dado("^que me encuentro en el website de slider$")
    public void queMeEncuentroEnElWebsiteDeSlider() {
        javi.wasAbleTo(NavegarHacia.laPaginadeSlider());
    }


    @Cuando("^deslizo el slider a la posicion \"([^\"]*)\"$")
    public void deslizoElSliderALaPosicion(String arg0) {
        javi.remember(whatJaviRemembers, arg0);
        javi.attemptsTo(ComprobarComportamientoSlider.conLosValores(arg0));
    }


    @Entonces("^se visualiza el valor previamente seleccionado$")
    public void seVisualizaElValorSeleccionado() {

        javi.should(seeThat(ValorEnElLabel.mostrado(), equalTo(javi.recall(whatJaviRemembers))));

    }


    @Y("^deslizo el slider en la posicion \"([^\"]*)\"$")
    public void deslizoElSliderEnLaPosicion(String arg0) {
        javi.remember(whatJaviRemembers, arg0);
        javi.attemptsTo(ComprobarComportamientoSlider.conLosValores(arg0));
    }
}
