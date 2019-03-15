package com.natalframework.screenplay.questions.wizard;

import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextoUsuarioCreado implements Question<String> {


    public static Question<String> valor() {
        return new TextoUsuarioCreado();
    }


    @Override
    public String answeredBy(Actor theActor) {
        return Text.of(Label.USUARIO_CREADO).viewedBy(theActor).asString();
    }
}
