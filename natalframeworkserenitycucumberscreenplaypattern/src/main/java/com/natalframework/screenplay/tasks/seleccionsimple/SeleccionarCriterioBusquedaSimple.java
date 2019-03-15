package com.natalframework.screenplay.tasks.seleccionsimple;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCriterioBusquedaSimple implements Task {

    private final String valor;

    public SeleccionarCriterioBusquedaSimple(String valor) {
        this.valor = valor;
    }

    @Override

    public <T extends Actor> void performAs(T theActor) {
        List<WebElementFacade> listado = Listas.RESULTADOS_BUSQUEDA_SIMPLE.resolveAllFor(theActor);
        for (int i = 0; i< listado.size(); i++){
            if (listado.get(i).getText().contains(valor))
            {
                listado.get(i).click();
                return;
            }
        }
    }

    public static SeleccionarCriterioBusquedaSimple conElValor(String valor){
        return instrumented(SeleccionarCriterioBusquedaSimple.class, valor);
    }

}
