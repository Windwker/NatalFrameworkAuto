package com.natalframework.screenplay.questions.checkboxmultiple;

import com.natalframework.screenplay.user_interface.CheckBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import java.util.ArrayList;
import java.util.List;


public class EstadoCheckBoxMultiple implements Question<List<String>> {


    ArrayList<String> listadoString = new ArrayList<>();
    @Override
    public ArrayList<String> answeredBy(Actor theActor) {


        String listadoAux = Attribute.of(CheckBox.CHECKBOX_MULTIPLE_ATRIBUTOS).named("check").viewedBy(theActor).asString();
        String[] parts = listadoAux.split(",");
        for (int i = 0; i< parts.length; i++){
            listadoString.add(parts[i]);
        }

        return listadoString;
    }


    public static Question<List<String>> elementosSeleccionados(){
        return new EstadoCheckBoxMultiple();
    }
}
