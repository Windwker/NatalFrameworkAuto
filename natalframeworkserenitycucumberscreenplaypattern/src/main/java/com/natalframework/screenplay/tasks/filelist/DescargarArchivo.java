package com.natalframework.screenplay.tasks.filelist;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarArchivo implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {

        List<WebElementFacade> listado = Listas.ARCHIVOS_DESCARGA.resolveAllFor(theActor);


        theActor.attemptsTo(Click.on(listado.get(0)));
    }

    public static DescargarArchivo ahora(){
        return instrumented(DescargarArchivo.class);
    }

}
