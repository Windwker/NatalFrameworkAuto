package com.natalframework.screenplay.questions.seleccionsimple;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValoresPosiblesSeleccionSimple implements Question<List<String>> {

    ArrayList<String> listado = new ArrayList<>();

    @Override


    public List<String> answeredBy(Actor theActor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElementFacade> list = Listas.RESULTADOS_BUSQUEDA_SIMPLE.resolveAllFor(theActor);

        for (int i = 0; i < list.size(); i++) {
            listado.add(list.get(i).getText());
        }

        return listado;
    }


    public static Question<List<String>> deLaListaDeResultados() {
        return new ValoresPosiblesSeleccionSimple();
    }
}
