package com.natalframework.screenplay.questions.tablas;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ColumnasSeleccionadas implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor theActor) {
        List<WebElementFacade> listadoElementos = Listas.OPCIONES_DE_COLUMNA.resolveAllFor(theActor);
        List<String> listadoValores = new ArrayList<>();

        for (WebElementFacade elemento : listadoElementos
        ) {
            if (elemento.getAttribute("class").equals("dt-button buttons-columnVisibility active")) {
                listadoValores.add(elemento.getText());
            }
        }
        return listadoValores;
    }
}
