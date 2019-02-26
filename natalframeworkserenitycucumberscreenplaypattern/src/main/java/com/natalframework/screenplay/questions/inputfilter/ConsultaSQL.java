package com.natalframework.screenplay.questions.inputfilter;

import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConsultaSQL implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Text.of(Label.CONSULTA_SQL).viewedBy(theActor).asString();
    }


    public static Question<String> es(){
        return new ConsultaSQL();
    }
}
