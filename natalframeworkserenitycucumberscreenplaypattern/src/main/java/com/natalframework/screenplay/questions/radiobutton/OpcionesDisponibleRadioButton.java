package com.natalframework.screenplay.questions.radiobutton;

import com.natalframework.screenplay.user_interface.RadioButton;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class OpcionesDisponibleRadioButton implements Question<List<String>>{
    public static Question<List<String>> valores(){
       return new OpcionesDisponibleRadioButton();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        List<WebElementFacade> listadoRadioButton =  RadioButton.LISTADO.resolveAllFor(actor);
        List<String>listadoTextoRadioButton = new ArrayList<>();
        for (WebElementFacade radioButton:listadoRadioButton
        ) {
            //Implementacion para eliminar los espacios adicionales en edge
            String text = radioButton.getText();
            char espacio = text.charAt(text.length() - 1);

            if (espacio == ' ') {

                text = text.substring(0, text.length() - 1);
            }


            listadoTextoRadioButton.add(text);
        }

        return listadoTextoRadioButton;
    }
}
