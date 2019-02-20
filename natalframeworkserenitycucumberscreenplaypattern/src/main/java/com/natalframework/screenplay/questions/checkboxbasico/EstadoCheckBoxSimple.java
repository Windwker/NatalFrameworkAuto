package com.natalframework.screenplay.questions.checkboxbasico;

import com.natalframework.screenplay.user_interface.CheckBox;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EstadoCheckBoxSimple implements Question<String> {


    @Override

    public String answeredBy(Actor theActor) {
        WebElementFacade elemento = CheckBox.CONTENEDOR_CHECKBOX_BASICO.resolveFor(theActor);
        String atributoCheck = elemento.getAttribute("check");
        if (atributoCheck==null){
            return "Sin Checkear";
        }
        return "Checkeado";
    }

    public static Question<String> es(){
        return new EstadoCheckBoxSimple();
    }
}
