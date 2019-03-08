package com.natalframework.cucumber.steps.tablas;

import com.natalframework.screenplay.actions.ClickEn;
import com.natalframework.screenplay.questions.tablas.ArchivoDescargado;
import com.natalframework.screenplay.questions.tablas.BotonesDeColumna;
import com.natalframework.screenplay.questions.tablas.OpcionesDeColumnas;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.tabla.DescargarArchivo;
import com.natalframework.screenplay.tasks.tabla.SeleccionarOpcionesVisualizacionColumnas;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;

public class TablasUserStepdefs {

    private Actor robertDeNiro;
    private String loQueJaviRecuerda;

    @Before
    public void setTheStage() {
        robertDeNiro = theActorCalled("Robert De Niro");

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website de tablas$")
    public void queMeEncuentroEnElWebsiteDeTablas() {
        robertDeNiro.wasAbleTo(NavegarHacia.laPaginadeTabla());
    }

    @Cuando("^presiono el boton Columnas$")
    public void presionoElBotonColumnas() {
        robertDeNiro.attemptsTo(ClickEn.elBotonColumnas());
    }

    @Entonces("^se despliega la seccion columnas mostrando las opciones$")
    public void seDespliegaLaSeccionColumnasMostrandoLasOpciones(List<String> arg0) {
        robertDeNiro.should(seeThat(OpcionesDeColumnas.visibles(), equalTo(arg0)));
    }

    @Y("^se muestran los botones$")
    public void seMuestranLosBotones(List<String> arg0) {
        robertDeNiro.should(seeThat(BotonesDeColumna.desplegados(), equalTo(arg0)));
    }

    @Y("^selecciono las opciones \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\"$")
    public void seleccionoLasOpcionesYY(String arg0, String arg1, String arg2) {
        robertDeNiro.attemptsTo(SeleccionarOpcionesVisualizacionColumnas.conLosValores(arg0, arg1, arg2));
    }

    @Entonces("^la tabla es visualizada  unicamente con las columnas$")
    public void laTablaEsVisualizadaUnicamenteConLasColumnas(List<String> arg0) {
        robertDeNiro.should(seeThat(OpcionesDeColumnas.seleccionadas(), equalTo(arg0)));
    }

    @Y("^selecciono las opcion \"([^\"]*)\"$")
    public void seleccionoLasOpcion(String arg0) {
        robertDeNiro.attemptsTo(ClickEn.elBotonTodos());

    }


    @Entonces("^la tabla es visualizada con todas las columnas$")
    public void laTablaEsVisualizadaConTodasLasColumnas() {
        robertDeNiro.should(seeThat((OpcionesDeColumnas.visibles()), equalTo(OpcionesDeColumnas.seleccionadas().answeredBy(robertDeNiro))));
    }

    @Cuando("^presiono el boton Descargar$")
    public void presionoElBotonDescargar() {
        robertDeNiro.attemptsTo(ClickEn.elBotonExportar());

    }

    @Y("^selecciono la opcion Descargar Excel$")
    public void seleccionoLaOpcion() {
        robertDeNiro.attemptsTo(DescargarArchivo.ahoraMismo());
    }

    @Entonces("^la tabla es descargada como excel correctamente$")
    public void laTablaEsDescargadaComoExcelCorrectamente() {
        robertDeNiro.should(seeThat(ArchivoDescargado.es(), equalTo(true)));
    }
}
