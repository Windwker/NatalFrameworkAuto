package com.natalframework.screenplay.tasks.modal;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarElModal implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Boton.CERRAR_MODAL));
    }

    public static CerrarElModal ahora(){
        return instrumented(CerrarElModal.class);
    }
}
