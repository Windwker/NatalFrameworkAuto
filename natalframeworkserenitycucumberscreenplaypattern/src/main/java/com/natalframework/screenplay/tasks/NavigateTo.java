package com.natalframework.screenplay.tasks;

import com.natalframework.screenplay.pages.CheckBoxBasico;
import com.natalframework.screenplay.pages.CheckBoxMultiple;
import com.natalframework.screenplay.pages.SeleccionMultiple;
import com.natalframework.screenplay.pages.SeleccionSimple;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {


    private static Class website = null;

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn().the(website));
    }


    public static NavigateTo theSeleccionSimpleWebsite(){
        website = SeleccionSimple.class;
        return  instrumented(NavigateTo.class);

    }

    public static NavigateTo theSeleccionMultipleWebsite() {
        website = SeleccionMultiple.class;
        return instrumented(NavigateTo.class);

    }

    public static NavigateTo theCheckBoxBasicoWebsite(){
        website = CheckBoxBasico.class;
        return instrumented(NavigateTo.class);
    }

    public static NavigateTo theCheckBoxMultipleWebsite(){
        website = CheckBoxMultiple.class;
        return instrumented(NavigateTo.class);
    }



}
