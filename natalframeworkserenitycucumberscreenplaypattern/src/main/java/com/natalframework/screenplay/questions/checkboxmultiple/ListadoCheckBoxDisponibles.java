package com.natalframework.screenplay.questions.checkboxmultiple;

import com.natalframework.screenplay.user_interface.CheckBox;
import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class ListadoCheckBoxDisponibles implements Question<List<String>> {


    List<String> listado = new ArrayList<>();

    @Override
    public List<String> answeredBy(Actor theActor) {


        List<WebElementFacade> listadoCheckBoxDisponibles = Label.MULTIPLE_CHECKBOX.resolveAllFor(theActor);
        for (int i = 0; i < listadoCheckBoxDisponibles.size(); i++) {

            listado.add(listadoCheckBoxDisponibles.get(i).getText());


        }

        return listado;
    }


    public static Question<List<String>> es() {
        return new ListadoCheckBoxDisponibles();
    }
}
