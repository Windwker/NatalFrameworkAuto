package com.natalframework.screenplay.actions;

import com.natalframework.screenplay.user_interface.pages.CheckBoxBasico;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambiarTab implements Interaction {

CheckBoxBasico checkBoxBasico;

    public static CambiarTab aLaPestana() {
        return instrumented(CambiarTab.class);

    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        checkBoxBasico.evaluateJavascript("window.open(\"//www.google.com\")");
        WebDriver driver = getDriver();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
