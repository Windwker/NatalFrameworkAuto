package com.natalframework.screenplay.tasks.tabla;

import com.natalframework.screenplay.user_interface.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCriterioBusqueda implements Task {


    private final String valor;

    public IngresarCriterioBusqueda(String valor) {
        this.valor = valor;
    }

    public static IngresarCriterioBusqueda conElValor(String valor) {
        return instrumented(IngresarCriterioBusqueda.class, valor);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(valor).into(Input.CRITERIO_BUSQUEDA));
    }

}
