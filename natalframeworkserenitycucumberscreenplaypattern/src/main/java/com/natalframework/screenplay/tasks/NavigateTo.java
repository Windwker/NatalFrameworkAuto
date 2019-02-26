package com.natalframework.screenplay.tasks;

import com.natalframework.screenplay.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {


    private static Class website = null;

    public static NavigateTo theSeleccionSimpleWebsite() {
        website = SeleccionSimple.class;
        return instrumented(NavigateTo.class);

    }

    public static NavigateTo theSeleccionMultipleWebsite() {
        website = SeleccionMultiple.class;
        return instrumented(NavigateTo.class);

    }

    public static NavigateTo theCheckBoxBasicoWebsite() {
        website = CheckBoxBasico.class;
        return instrumented(NavigateTo.class);
    }

    public static NavigateTo theCheckBoxMultipleWebsite() {
        website = CheckBoxMultiple.class;
        return instrumented(NavigateTo.class);
    }

    public static NavigateTo theDatePickerSimpleWebsite() {
        website = DatePickerSimple.class;

        return instrumented(NavigateTo.class);
    }

    public static NavigateTo theFileListWebsite() {
        website = FileList.class;

        return instrumented(NavigateTo.class);
    }


    public static NavigateTo theInputFilterWebSite() {
        website = InputFilter.class;

        return instrumented(NavigateTo.class);
    }


    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn().the(website));
    }


}
