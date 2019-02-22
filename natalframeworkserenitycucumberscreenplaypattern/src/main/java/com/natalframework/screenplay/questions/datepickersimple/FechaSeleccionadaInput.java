package com.natalframework.screenplay.questions.datepickersimple;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FechaSeleccionadaInput implements Question<String> {
    public static Question<String> es() {
        return new FechaSeleccionadaInput();}

    @Override
    public String answeredBy(Actor theActor) {
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
       return js.executeScript("return vm.stringDate").toString();

    }

}
