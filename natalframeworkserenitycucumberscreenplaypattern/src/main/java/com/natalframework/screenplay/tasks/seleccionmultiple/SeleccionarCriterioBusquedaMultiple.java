package com.natalframework.screenplay.tasks.seleccionmultiple;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCriterioBusquedaMultiple implements Task {

    private final String valor;

    public SeleccionarCriterioBusquedaMultiple(String valor) {
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElementFacade> listado = Listas.RESULTADOS_BUSQUEDA_MULTIPLE.resolveAllFor(theActor);

        for (int i= 0; i< listado.size(); i++){
            if (listado.get(i).getText().contains(valor)){
                listado.get(i).click();
                return;
            }

        }

    }



    public static SeleccionarCriterioBusquedaMultiple conElValor(String valor){
        return instrumented(SeleccionarCriterioBusquedaMultiple.class,valor);
    }
}
