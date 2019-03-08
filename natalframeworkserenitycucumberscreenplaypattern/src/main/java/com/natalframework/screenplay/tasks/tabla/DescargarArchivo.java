package com.natalframework.screenplay.tasks.tabla;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.io.File;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarArchivo implements Task {
    public static DescargarArchivo ahoraMismo() {
        return instrumented(DescargarArchivo.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        File file = new File("C:/SerenityBrowserDownloads");
        File[] folder = file.listFiles();
        for (File archivo : folder
        ) {
            archivo.delete();
        }


        theActor.attemptsTo(Click.on(Boton.DESCARGAR_EXCEL));
    }

}
