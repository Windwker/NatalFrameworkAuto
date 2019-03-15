package com.natalframework.screenplay.questions.wizard;

import com.natalframework.screenplay.user_interface.pages.Wizard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Visible implements Question<Boolean> {


    public Wizard wizard;

    public WebDriver driver = wizard.getDriver();

    @Override
    public Boolean answeredBy(Actor theActor) {
        try {
            Alert wait = new WebDriverWait(driver, 50).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
            wait.getText();
        } catch (Exception e) {
            return false;
        }

        return true;
    }


}
