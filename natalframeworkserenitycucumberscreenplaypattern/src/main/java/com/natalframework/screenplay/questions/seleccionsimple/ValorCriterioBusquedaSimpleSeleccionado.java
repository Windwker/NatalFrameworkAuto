package com.natalframework.screenplay.questions.seleccionsimple;

import com.natalframework.screenplay.user_interface.Selector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValorCriterioBusquedaSimpleSeleccionado implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        return Text.of(Selector.SIMPLE).viewedBy(theActor).asString();
    }


    public static Question<String> es(){
        return new ValorCriterioBusquedaSimpleSeleccionado();
    }
}
