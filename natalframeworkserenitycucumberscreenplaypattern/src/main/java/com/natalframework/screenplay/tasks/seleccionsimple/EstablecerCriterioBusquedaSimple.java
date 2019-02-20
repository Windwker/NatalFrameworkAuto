package com.natalframework.screenplay.tasks.seleccionsimple;

import com.natalframework.screenplay.user_interface.Input;
import com.natalframework.screenplay.user_interface.Selector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EstablecerCriterioBusquedaSimple implements Task {

    private final String valordebusqueda;

    public EstablecerCriterioBusquedaSimple(String valordebusqueda) {
        this.valordebusqueda = valordebusqueda;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Selector.SIMPLE));
        theActor.attemptsTo(Enter.theValue(valordebusqueda).into(Input.CAMPO_BUSQUEDA_SIMPLE));
    }


    public static EstablecerCriterioBusquedaSimple ConElValor(String valordebusqueda){
        return instrumented(EstablecerCriterioBusquedaSimple.class, valordebusqueda);
    }

}
