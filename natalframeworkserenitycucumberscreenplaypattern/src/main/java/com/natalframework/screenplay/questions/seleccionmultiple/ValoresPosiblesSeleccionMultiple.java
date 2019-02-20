package com.natalframework.screenplay.questions.seleccionmultiple;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValoresPosiblesSeleccionMultiple implements Question<ArrayList<String>> {

    ArrayList<String> listado = new ArrayList<>();

    @Override
    public ArrayList<String> answeredBy(Actor theActor) {
        List<WebElementFacade> list = Listas.RESULTADOS_BUSQUEDA_MULTIPLE.resolveAllFor(theActor);
        for (int i = 0; i < list.size(); i++) {
            listado.add(list.get(i).getText());
        }

        return listado;

    }


    public static Question<ArrayList<String>> deLaListaDeResultados() {
        return new ValoresPosiblesSeleccionMultiple();
    }

    public static Question cantidadElementos(){
        return new ValoresPosiblesSeleccionMultiple();
    }

}
