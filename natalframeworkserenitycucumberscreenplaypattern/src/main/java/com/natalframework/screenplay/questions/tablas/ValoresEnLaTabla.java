package com.natalframework.screenplay.questions.tablas;

import com.natalframework.screenplay.user_interface.Tabla;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValoresEnLaTabla implements Question<Boolean> {


    private final String valor;

    public ValoresEnLaTabla(String valor) {
        this.valor = valor;
    }

    public static Question<Boolean> mostrados(String valor) {
        return new ValoresEnLaTabla(valor);
    }

    @Override
    public Boolean answeredBy(Actor theActor) {
        List<WebElementFacade> listadoElementos = Tabla.TABLA_USUARIOS.resolveAllFor(theActor);
        List<String> listadoValores = new ArrayList<>();
        for (WebElementFacade elemento : listadoElementos
        ) {

            if (elemento.getText().contains(valor))
                listadoValores.add(elemento.getText());
        }

        if (listadoElementos.size() == listadoValores.size()) {
            return true;
        } else {
            return false;
        }


    }

}
