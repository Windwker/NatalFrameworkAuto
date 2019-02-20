package com.natalframework.screenplay.questions.seleccionmultiple;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class CantidadPosibleSeleccionMultiple implements Question<String> {
    @Override
    public String answeredBy(Actor theActor) {
        ArrayList<String> listado =  ValoresPosiblesSeleccionMultiple.deLaListaDeResultados().answeredBy(theActor);
        return Integer.toString(listado.size());

    }


    public static Question<String> es() {
        return new CantidadPosibleSeleccionMultiple();
    }
}
