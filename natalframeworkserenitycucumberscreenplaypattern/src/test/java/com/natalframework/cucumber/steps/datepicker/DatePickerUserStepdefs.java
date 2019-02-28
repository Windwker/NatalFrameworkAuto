package com.natalframework.cucumber.steps.datepicker;

import com.natalframework.screenplay.questions.datepickersimple.FechaSeleccionadaInput;
import com.natalframework.screenplay.questions.datepickersimple.FechaSeleccionadaLabel;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.datepickersimple.SeleccionarFechaVencimiento;
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
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

public class DatePickerUserStepdefs {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website del datepicker simple$")
    public void queMeEncuentroEnElWebsiteDelDatepickerSimple() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeDatePickerSimple());
    }

    @Cuando("^selecciono \"([^\"]*)\" como fecha del picker$")
    public void seleccionoComoFechaDelPicker(String arg0){
        theActorInTheSpotlight().attemptsTo(SeleccionarFechaVencimiento.ahora(arg0));
    }

    @Entonces("^deberia poder visualizar la fecha seleccionada en el campo de seleccion de fecha$")
    public void deberiaPoderVisualizarLaFechaSeleccionadaEnElCampoDeSeleccionDeFecha() {
        theActorInTheSpotlight().should(seeThat(FechaSeleccionadaInput.es(), equalTo("11/12/2492")));
    }



    @Y("^deberia poder visualizar el label \"([^\"]*)\"$")
    public void deberiaPoderVisualizarElLabel(String arg0){
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(FechaSeleccionadaLabel.es(), equalTo(arg0)));
    }
}
