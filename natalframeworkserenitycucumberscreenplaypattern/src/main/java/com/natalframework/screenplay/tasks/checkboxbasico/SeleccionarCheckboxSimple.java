package com.natalframework.screenplay.tasks.checkboxbasico;

import com.natalframework.screenplay.user_interface.CheckBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SeleccionarCheckboxSimple implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(CheckBox.CHECKBOX_BASICO));

    }


    public static SeleccionarCheckboxSimple ahora() {
        return instrumented(SeleccionarCheckboxSimple.class);
    }
}
