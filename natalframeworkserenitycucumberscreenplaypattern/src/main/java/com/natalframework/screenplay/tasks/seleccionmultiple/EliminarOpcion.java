package com.natalframework.screenplay.tasks.seleccionmultiple;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarOpcion implements Task {
    private final String valor;

    public EliminarOpcion(String valor) {
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        List<WebElementFacade> listadoBotonEliminar = Boton.ELIMINAR_OPCION.resolveAllFor(theActor);
        for (int i = 0; i<listadoBotonEliminar.size(); i++){
           {
                listadoBotonEliminar.get(i).click();

            }
        }
    }


    public static EliminarOpcion conValor(String valor){
        return instrumented(EliminarOpcion.class, valor);
    }
}
