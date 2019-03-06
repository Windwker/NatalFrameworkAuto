package com.natalframework.screenplay.tasks.seleccionmultiple;

import com.natalframework.screenplay.user_interface.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EstablecerCriterioBusquedaMultiple implements Task {
    private final String valor;


    public EstablecerCriterioBusquedaMultiple(String valor) {
        this.valor = valor;
    }

    public static EstablecerCriterioBusquedaMultiple conElValor(String valor) {
        return instrumented(EstablecerCriterioBusquedaMultiple.class, valor);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {


        theActor.attemptsTo(Click.on(Input.CAMPO_BUSQUEDA_MULTIPLE));
        theActor.attemptsTo(Enter.theValue(valor).into(Input.CAMPO_BUSQUEDA_MULTIPLE));


    }
}
