package com.natalframework.cucumber.steps.radiobutton;

import com.natalframework.screenplay.questions.radiobutton.OpciondeRadioButtonSeleccionada;
import com.natalframework.screenplay.questions.radiobutton.OpcionesDisponibleRadioButton;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.radiobutton.AgregarOpcion;
import com.natalframework.screenplay.tasks.radiobutton.SeleccionarOpcion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

public class RadioButtonUserStepdefs {

    private Actor javi;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        javi = theActorCalled("Javi");
    }

    @Dado("^que me encuentro en el website de radiobutton$")
    public void queMeEncuentroEnElWebsiteDeRadiobutton() {
        javi.wasAbleTo(NavegarHacia.laPaginadeRadioButton());
    }

    @Cuando("^selecciono la opcion \"([^\"]*)\" del radiobutton$")
    public void seleccionoLaOpcionDelRadiobutton(String arg0) {
        javi.attemptsTo(SeleccionarOpcion.numero(arg0));

    }

    @Entonces("^se muestra la opcion seleccionada$")
    public void seMuestraLaOpcionSeleccionada() {
        javi.should(seeThat(OpciondeRadioButtonSeleccionada.es(), equalTo("Opción seleccionada: autobus")));
    }

    @Cuando("^agrego \"([^\"]*)\" en el campo de ingreso y presiono anadir$")
    public void agregoEnElCampoDeIngresoYPresionoAnadir(String arg0) {
        javi.attemptsTo(AgregarOpcion.conValor(arg0));

    }

    @Entonces("^\"([^\"]*)\" se visualiza ingresada en la lista de radiobutton$")
    public void seVisualizaIngresadaEnLaListaDeRadiobutton(String arg0) {
        javi.should(seeThat(OpcionesDisponibleRadioButton.valores(), hasItem(arg0)));

    }


}
