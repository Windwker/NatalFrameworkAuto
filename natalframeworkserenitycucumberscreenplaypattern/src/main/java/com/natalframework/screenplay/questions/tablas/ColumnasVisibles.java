package com.natalframework.screenplay.questions.tablas;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ColumnasVisibles implements Question<List<String>> {


    @Override
    public List<String> answeredBy(Actor theActor) {
        List<WebElementFacade> listadoElementos = Listas.OPCIONES_DE_COLUMNA.resolveAllFor(theActor);
        List<String> listadoValores = new ArrayList<>();
        for (WebElementFacade elemento : listadoElementos
        ) {
            listadoValores.add(elemento.getText());
        }
        return listadoValores;
    }

}


