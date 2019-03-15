package com.natalframework.screenplay.tasks.radiobutton;

import com.natalframework.screenplay.user_interface.Boton;
import com.natalframework.screenplay.user_interface.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarOpcion implements Task {

    private final String valor;

    public AgregarOpcion(String valor){
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(valor).into(Input.OPCION_RADIO_BUTTON));
        theActor.attemptsTo(Click.on(Boton.ANADIR_OPCION_RADIOBUTTON));
    }



    public static AgregarOpcion conValor(String valor){
        return instrumented(AgregarOpcion.class,valor);
    }
}
