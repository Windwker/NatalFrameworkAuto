package com.natalframework.screenplay.tasks.inputfilter;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarFiltro implements Task {
    public static GenerarFiltro ahora() {
        return instrumented(GenerarFiltro.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Boton.GENERAR_FILTRO));

    }
}
