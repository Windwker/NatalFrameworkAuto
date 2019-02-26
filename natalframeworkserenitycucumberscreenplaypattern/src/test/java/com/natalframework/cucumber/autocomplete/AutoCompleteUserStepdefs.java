package com.natalframework.cucumber.autocomplete;

import com.natalframework.screenplay.questions.seleccionmultiple.CantidadPosibleSeleccionMultiple;
import com.natalframework.screenplay.questions.seleccionmultiple.ValorCriterioBusquedaMultipleSeleccionado;
import com.natalframework.screenplay.questions.seleccionmultiple.ValoresPosiblesSeleccionMultiple;
import com.natalframework.screenplay.questions.seleccionsimple.ValorCriterioBusquedaSimpleSeleccionado;
import com.natalframework.screenplay.questions.seleccionsimple.ValoresPosiblesSeleccionSimple;
import com.natalframework.screenplay.tasks.seleccionmultiple.EliminarOpcion;
import com.natalframework.screenplay.tasks.seleccionmultiple.EstablecerCriterioBusquedaMultiple;
import com.natalframework.screenplay.tasks.seleccionmultiple.SeleccionarCriterioBusquedaMultiple;
import com.natalframework.screenplay.tasks.seleccionsimple.EstablecerCriterioBusquedaSimple;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.seleccionsimple.SeleccionarCriterioBusquedaSimple;
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

public class AutoCompleteUserStepdefs {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^me encuentro en la website de autocomplete seleccion simple$")
    public void meEncuentroEnLaWebsiteDeAutocompleteSeleccionSimple() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeSeleccionSimple());

    }

    @Cuando("^comienzo a ingresar \"([^\"]*)\" en el input$")
    public void comienzoAIngresarEnElInput(String arg0) {
        theActorInTheSpotlight().attemptsTo(EstablecerCriterioBusquedaSimple.ConElValor(arg0));

    }

    @Entonces("^deberia poder visualizar cada opcion disponible por criterio de busqueda$")
    public void deberiaPoderVisualizarCadaOpcionDisponiblePorCriterioDeBusqueda() {
        theActorInTheSpotlight().should(seeThat(ValoresPosiblesSeleccionSimple.deLaListaDeResultados(), hasItem("26 - NEOFARMA")));
    }

    @Y("^al seleccionar alguna opcion$")
    public void alSeleccionarAlgunaOpcion() {

        theActorInTheSpotlight().attemptsTo(SeleccionarCriterioBusquedaSimple.conElValor("59 - FARMAR I"));
    }

    @Entonces("^deberia visualizar la opcion seleccionada$")
    public void deberiaVisualizarLaOpcionSeleccionada() {
        theActorInTheSpotlight().should(seeThat(ValorCriterioBusquedaSimpleSeleccionado.es() , equalTo("59 - FARMAR I")));
    }



    @Dado("^me encuentro en la website de autocomplete seleccion multiple$")
    public void meEncuentroEnLaWebsiteDeAutocompleteSeleccionMultiple() {
        theActorCalled("Javi").wasAbleTo(NavegarHacia.laPaginadeSeleccionMultiple());
    }

    @Cuando("^ingreso el valor \"([^\"]*)\" en el input$")
    public void ingresoElValorEnElInput(String arg0){
        theActorInTheSpotlight().attemptsTo(EstablecerCriterioBusquedaMultiple.conElValor(arg0));
    }

    @Entonces("^deberia poder visualizar cada opcion disponible que contiene el criterio de busqueda$")
    public void deberiaPoderVisualizarCadaOpcionDisponibleQueContieneElCriterioDeBusqueda() {
        theActorInTheSpotlight().should(seeThat(CantidadPosibleSeleccionMultiple.es(), equalTo("2")));
        theActorInTheSpotlight().should(seeThat(ValoresPosiblesSeleccionMultiple.deLaListaDeResultados(), hasItem("74 - MITRE 16")));
    }
    @Y("^al seleccionar alguna opcion del selector$")
    public void alSeleccionarAlgunaOpcionDelSelector() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCriterioBusquedaMultiple.conElValor("78 - DEL CENTRO 14"));

    }

    @Entonces("^deberia poder visualizar la opcion seleccionada$")
    public void deberiaPoderVisualizarLaOpcionSeleccionada() {
        theActorInTheSpotlight().should(seeThat(ValorCriterioBusquedaMultipleSeleccionado.es(), hasItem("×78 - DEL CENTRO 14")));
    }

    @Y("^deberia poder ingresar el valor \"([^\"]*)\" en el input$")
    public void deberiaPoderIngresarElValorEnElInput(String arg0) {

        theActorInTheSpotlight().attemptsTo(EstablecerCriterioBusquedaMultiple.conElValor(arg0));
    }


    @Y("^deberia poder seleccionar un segundo valor de la lista$")
    public void deberiaPoderSeleccionarUnSegundoValorDeLaLista() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCriterioBusquedaMultiple.conElValor("1 - RIVADAVIA 2463"));
    }


    @Y("^deberia poder visualizar los valores previamente seleccionados$")
    public void deberiaPoderVisualizarLosValoresPreviamenteSeleccionados() {
        theActorInTheSpotlight().should(seeThat(ValorCriterioBusquedaMultipleSeleccionado.es(), hasItem("×78 - DEL CENTRO 14")));
        theActorInTheSpotlight().should(seeThat(ValorCriterioBusquedaMultipleSeleccionado.es(), hasItem("×1 - RIVADAVIA 2463")));
    }


    @Y("^al presionar la cruz para eliminar la opcion$")
    public void alPresionarLaCruzParaEliminarLaOpcion() {
        theActorInTheSpotlight().attemptsTo(EliminarOpcion.conValor("78 - DEL CENTRO 14"));
    }

    @Entonces("^la opcion se elimina del selector$")
    public void laOpcionSeEliminaDelSelector() {
        theActorInTheSpotlight().should(seeThat(ValorCriterioBusquedaMultipleSeleccionado.es(), not(hasItem("×78 - DEL CENTRO 14"))));
    }
}
