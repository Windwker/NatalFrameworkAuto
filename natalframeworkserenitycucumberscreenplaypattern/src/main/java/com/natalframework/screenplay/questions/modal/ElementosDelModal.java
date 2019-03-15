package com.natalframework.screenplay.questions.modal;

import com.natalframework.screenplay.user_interface.Modal;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ElementosDelModal implements Question<List<String>> {

    private List<String> listadoElementosDelModalString = new ArrayList<>();

    public static Question valores() {
        return new ElementosDelModal();
    }

    @Override
    public List<String> answeredBy(Actor theActor) {


        List<WebElementFacade> listadoElementosDelModal = Modal.CONTENEDOR.resolveAllFor(theActor);
        for (WebElementFacade elemento : listadoElementosDelModal
        ) {
            listadoElementosDelModalString.add((elemento.getAttribute("Class").substring(6)));
        }

        return listadoElementosDelModalString;

    }
}
