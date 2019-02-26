package com.natalframework.cucumber.inputfilter;

import com.natalframework.screenplay.questions.inputfilter.ConsultaSQL;
import com.natalframework.screenplay.questions.inputfilter.FiltroSeleccionadoInput;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.inputfilter.GenerarFiltro;
import com.natalframework.screenplay.tasks.inputfilter.IngresarFiltro;
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

public class InputFilterUserStepdefs {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    private String valor;
    @Dado("^que me encuentro en el website input-filter$")
    public void queMeEncuentroEnElWebsiteInputFilter() {
    theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeInputFilter());

    }

    @Cuando("^ingreso el valor \"([^\"]*)\" en el filtro nombre$")
    public void ingresoElValorEnElFiltroNombre(String arg0) {
        theActorInTheSpotlight().attemptsTo(IngresarFiltro.conValor(arg0));

    }

    @Y("^presiono generar filtro$")
    public void presionoGenerarFiltro() {
        theActorInTheSpotlight().attemptsTo(GenerarFiltro.ahora());
    }

    @Entonces("^se visualiza \"([^\"]*)\" en el filtro nombre$")
    public void seVisualizaEnElFiltroNombre(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(FiltroSeleccionadoInput.es(), equalTo(arg0)));
        theActorInTheSpotlight().remember(valor,arg0);
    }

    @Y("^se visualiza la consulta SQL formada$")
    public void seVisualizaLaConsultaSQLFormada() {

        theActorInTheSpotlight().should(seeThat(ConsultaSQL.es() ,equalTo("SELECT * FROM personas WHERE name LIKE '%"+(theActorInTheSpotlight().recall(valor))+"%'")));
    }
}
