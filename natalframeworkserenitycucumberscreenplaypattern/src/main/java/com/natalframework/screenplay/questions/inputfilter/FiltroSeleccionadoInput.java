package com.natalframework.screenplay.questions.inputfilter;

import com.natalframework.screenplay.pages.InputFilter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Steps;

import java.util.Arrays;
import java.util.List;


public class FiltroSeleccionadoInput implements Question<String> {
    @Steps
    private InputFilter page;

    public static Question<String> es() {
        return new FiltroSeleccionadoInput();
    }

    @Override
    public String answeredBy(Actor actor) {

        return page.evaluateJavascript("return document.querySelector('[class=\"form-control\"]').value").toString();


    }
}
