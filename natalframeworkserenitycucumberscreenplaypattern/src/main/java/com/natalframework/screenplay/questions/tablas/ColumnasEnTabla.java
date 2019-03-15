package com.natalframework.screenplay.questions.tablas;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ColumnasEnTabla implements Question<List<String>> {
    public static Question desplegadas() {
        return new ColumnasEnTabla();
    }

    @Override
    public List<String> answeredBy(Actor theActor) {
        List<WebElementFacade> listadoElementos = Listas.COLUMNAS_DE_TABLA.resolveAllFor(theActor);
        List<String> listadoValores = new ArrayList<>();

        for (WebElementFacade elemento : listadoElementos
        ) {
            listadoValores.add(elemento.getText());
        }
        return listadoValores;
    }
}
