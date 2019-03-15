package com.natalframework.screenplay.tasks.wizard;

import com.natalframework.screenplay.user_interface.CheckBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarSexo implements Task {
    public static SeleccionarSexo masculino() {
        return instrumented(SeleccionarSexo.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(CheckBox.SEXO_MASCULINO));
    }

}


