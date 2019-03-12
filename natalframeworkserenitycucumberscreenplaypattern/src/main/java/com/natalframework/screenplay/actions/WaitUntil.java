package com.natalframework.screenplay.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class WaitUntil extends net.serenitybdd.screenplay.waits.WaitUntil implements Interaction {


    public static Interaction AlertIsDisplayed() {


        return instrumented(WaitUntil.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        Alert wait = new WebDriverWait(getDriver(), 10).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
        wait.getText();
    }
}
