package com.natalframework.screenplay.questions.treeview;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class OpcionesVisiblesDelTreeView implements Question<String> {


    public static Question<String> valores() {
        return new OpcionesVisiblesDelTreeView();
    }

    @Override
    public String answeredBy(Actor theActor) {

        return Text.of(Listas.test).viewedBy(theActor).asString();


    }
}
