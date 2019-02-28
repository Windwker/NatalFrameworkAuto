package com.natalframework.screenplay.questions.radiobutton;

import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OpciondeRadioButtonSeleccionada {

    public static Question<String> es(){
        return actor -> Text.of(Label.OPCION_SELECCIONADA_RADIOBUTTON).viewedBy(actor).asString();
    }
}
