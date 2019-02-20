package com.natalframework.screenplay.questions.seleccionmultiple;

import com.natalframework.screenplay.user_interface.Selector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import java.util.List;

public class ValorCriterioBusquedaMultipleSeleccionado implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor theActor) {
        return Text.of(Selector.MULTIPLE).viewedBy(theActor).asList();
    }



    public static Question<List<String>> es (){
        return new ValorCriterioBusquedaMultipleSeleccionado();
    }


}
