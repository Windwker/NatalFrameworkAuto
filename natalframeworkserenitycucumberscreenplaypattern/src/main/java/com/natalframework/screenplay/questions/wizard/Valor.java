package com.natalframework.screenplay.questions.wizard;

import com.natalframework.screenplay.user_interface.pages.Wizard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Valor implements Question<String> {

    Wizard wizard;

    @Override
    public String answeredBy(Actor actor) {
        String texto = wizard.getAlert().getText();
        return texto;

    }
}
