package com.natalframework.cucumber.filelist;

import com.natalframework.screenplay.tasks.NavigateTo;
import com.natalframework.screenplay.tasks.filelist.DescargarArchivo;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FileListUserStepdefs {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website del file-list$")
    public void queMeEncuentroEnElWebsiteDelFileList() {
    theActorCalled("Javi").wasAbleTo(NavigateTo.theFileListWebsite());
    }

    @Cuando("^presiono descargar algun elemento del listado$")
    public void presionoDescargarAlgunElementoDelListado() {
    theActorInTheSpotlight().attemptsTo(DescargarArchivo.ahora());
    }



    @Entonces("^el elemento se descarga correctamente$")
    public void elElementoSeDescargaCorrectamente() {
    }

    @Cuando("^presiono eliminar algun elemento del listado$")
    public void presionoEliminarAlgunElementoDelListado() {
        
    }

    @Entonces("^el elemento se elimina correctamente$")
    public void elElementoSeEliminaCorrectamente() {
    }
}
