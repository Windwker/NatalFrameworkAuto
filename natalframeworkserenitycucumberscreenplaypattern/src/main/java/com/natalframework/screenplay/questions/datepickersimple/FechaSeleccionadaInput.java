package com.natalframework.screenplay.questions.datepickersimple;

import com.natalframework.screenplay.user_interface.pages.DatePickerSimple;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import net.thucydides.core.annotations.Steps;

import static com.natalframework.screenplay.user_interface.Input.FECHA_DE_VENCIMIENTO;

public class FechaSeleccionadaInput implements Question<String> {

    @Steps
    private DatePickerSimple page;

    public static Question<String> es() {

        return new FechaSeleccionadaInput();
    }

    @Override
    public String answeredBy(Actor theActor) {


        return Value.of(FECHA_DE_VENCIMIENTO).viewedBy(theActor).asString();
        //return page.evaluateJavascript("return vm.stringDate").toString();


    }

}
