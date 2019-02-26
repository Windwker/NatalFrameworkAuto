package com.natalframework.screenplay.tasks;

import com.natalframework.screenplay.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarHacia implements Task {


    private static Class website = null;

    public static NavegarHacia laPaginadeSeleccionSimple() {
        website = SeleccionSimple.class;
        return instrumented(NavegarHacia.class);

    }

    public static NavegarHacia laPaginadeSeleccionMultiple() {
        website = SeleccionMultiple.class;
        return instrumented(NavegarHacia.class);

    }

    public static NavegarHacia laPaginadeCheckBoxBasico() {
        website = CheckBoxBasico.class;
        return instrumented(NavegarHacia.class);
    }

    public static NavegarHacia laPaginadeCheckBoxMultiple() {
        website = CheckBoxMultiple.class;
        return instrumented(NavegarHacia.class);
    }

    public static NavegarHacia laPaginadeDatePickerSimple() {
        website = DatePickerSimple.class;

        return instrumented(NavegarHacia.class);
    }

    public static NavegarHacia laPaginadeFileList() {
        website = FileList.class;

        return instrumented(NavegarHacia.class);
    }


    public static NavegarHacia laPaginadeInputFilter() {
        website = InputFilter.class;

        return instrumented(NavegarHacia.class);
    }

    public static NavegarHacia laPaginadeModal(){
        website = Modal.class;
        return instrumented(NavegarHacia.class);
    }


    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn().the(website));
    }


}
