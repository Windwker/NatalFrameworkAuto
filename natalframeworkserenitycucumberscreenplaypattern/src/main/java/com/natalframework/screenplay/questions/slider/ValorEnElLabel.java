package com.natalframework.screenplay.questions.slider;

import com.natalframework.screenplay.user_interface.Label;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValorEnElLabel {

    public static Question<String> mostrado() {
        return actor -> Text.of(Label.VALOR_SELECCIONADO_SLIDER).viewedBy(actor).asString();
    }


}
