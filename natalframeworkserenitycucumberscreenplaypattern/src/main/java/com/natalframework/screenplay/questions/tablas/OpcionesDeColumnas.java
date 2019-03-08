package com.natalframework.screenplay.questions.tablas;

import net.serenitybdd.screenplay.Question;

import java.util.List;

public class OpcionesDeColumnas {


    public static Question<List<String>> visibles() {
        return new ColumnasVisibles();
    }


    public static Question<List<String>> seleccionadas() {
        return new ColumnasSeleccionadas();
    }

}
