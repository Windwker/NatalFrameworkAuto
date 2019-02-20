package com.natalframework.screenplay.questions.checkboxmultiple;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ListadoCheckBoxSeleccionados implements Question<List<String>> {

    public List<String> listadoCheckBoxSeleccionados = new ArrayList<>();

    @Override
    public List<String> answeredBy(Actor theActor) {
        List<WebElementFacade> auxListadoCheckBoxSeleccionados = Listas.RESULTADO_CHECKBOX_SELECCIONADOS.resolveAllFor(theActor);
       for (int i = 0; i<auxListadoCheckBoxSeleccionados.size(); i++){
           listadoCheckBoxSeleccionados.add((auxListadoCheckBoxSeleccionados.get(i).getText()));
       }
        return listadoCheckBoxSeleccionados;
    }


    public static Question<List<String>> es() {
        return new ListadoCheckBoxSeleccionados();
    }
}
