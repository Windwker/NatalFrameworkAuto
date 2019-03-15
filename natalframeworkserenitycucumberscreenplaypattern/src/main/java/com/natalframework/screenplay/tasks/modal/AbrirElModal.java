package com.natalframework.screenplay.tasks.modal;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElModal implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Boton.ABRIR_MODAL));

    }

    public static AbrirElModal ahora(){
        return instrumented(AbrirElModal.class);
    }

}


