package com.natalframework.screenplay.questions.datepickersimple;

import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FechaSeleccionadaLabel implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
    return Text.of(Label.FECHA_VENCIMIENTO_SELECCIONADA).viewedBy(theActor).asString();
    }


    public static Question<String> es(){

        return new FechaSeleccionadaLabel();
    }

}
