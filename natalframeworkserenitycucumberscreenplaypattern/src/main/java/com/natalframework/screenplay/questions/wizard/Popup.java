package com.natalframework.screenplay.questions.wizard;

import net.serenitybdd.screenplay.Question;

// Factory Class
public class Popup {


    public static Question valor() {
        return new Valor();
    }

    public static Question visible() {
        return new Visible();

    }


}
