package com.natalframework.screenplay.tasks.inputfilter;

import com.natalframework.screenplay.user_interface.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarFiltro implements Task {

    private final String valor;

    public IngresarFiltro(String valor) {
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(valor).into(Input.FILTRO));
    }



    public static IngresarFiltro conValor(String valor){
        return instrumented(IngresarFiltro.class, valor);
    }


}
