package com.natalframework.cucumber.steps.notificacion;

import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.notificacion.SeleccionarAlgunaNotificacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NotificacionUserStepdefs {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website de las notificaciones$")
    public void queMeEncuentroEnElWebsiteDeLasNotificaciones() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeNotificaciones());
    }

    @Cuando("^hago click en alguna notificacion$")
    public void hagoClickEnAlgunaNotificacion() {
        theActorInTheSpotlight().attemptsTo(SeleccionarAlgunaNotificacion.ahora());
    }

    @Entonces("^la notificacion se visualiza en pantalla$")
    public void laNotificacionSeVisualizaEnPantalla() {
    }

    @Y("^si hago click en ella$")
    public void siHagoClickEnElla() {
    }

    @Entonces("^la notificacion se cierra$")
    public void laNotificacionSeCierra() {
    }
}
