package com.natalframework.cucumber.steps.treeview;

import com.natalframework.screenplay.questions.treeview.OpcionesVisiblesDelTreeView;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.treeview.SeleccionarOpcionTreeView;
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
import static org.hamcrest.CoreMatchers.containsString;

public class TreeviewUserStepdefs {

    Actor javi;

    @Before
    public void setTheStage() {
        javi = theActorCalled("Javi");
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website del treeview$")
    public void queMeEncuentroEnElWebsiteDelTreeview() {
        javi.wasAbleTo(NavegarHacia.laPaginadelTreeview());
    }

    @Cuando("^selecciono la opcion \"([^\"]*)\"$")
    public void seleccionoLaOpcion(String arg0) {
        javi.attemptsTo(SeleccionarOpcionTreeView.conElValor(arg0));
    }

    @Y("^luego selecciono la opcion \"([^\"]*)\"$")
    public void luegoSeleccionoLaOpcion(String arg0) {
        javi.attemptsTo(SeleccionarOpcionTreeView.conElValor(arg0));
    }

    @Entonces("^el sistema me muestra las opciones \"([^\"]*)\" y \"([^\"]*)\"$")
    public void elSistemaMeMuestraLasOpcionesY(String arg0, String arg1) {

        javi.should(seeThat(OpcionesVisiblesDelTreeView.valores(), containsString(arg0)));
        javi.should(seeThat(OpcionesVisiblesDelTreeView.valores(), containsString(arg1)));
    }
}
