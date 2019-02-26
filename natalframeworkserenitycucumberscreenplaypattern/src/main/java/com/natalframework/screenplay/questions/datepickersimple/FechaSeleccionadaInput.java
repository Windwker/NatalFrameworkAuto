package com.natalframework.screenplay.questions.datepickersimple;

import com.natalframework.screenplay.pages.DatePickerSimple;
import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FechaSeleccionadaInput implements Question<String> {
    @Steps
    private DatePickerSimple page;

    public static Question<String> es() {
        return new FechaSeleccionadaInput();
    }

    @Override
    public String answeredBy(Actor theActor) {




        return page.evaluateJavascript("return vm.stringDate").toString();




    }

}
