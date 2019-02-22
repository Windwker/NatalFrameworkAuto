package com.natalframework.screenplay.tasks.checkboxmultiple;

import com.natalframework.screenplay.pages.DatePickerSimple;
import com.natalframework.screenplay.user_interface.CheckBox;
import net.serenitybdd.core.environment.WebDriverConfiguredEnvironment;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.core.webdriver.WebdriverContext;
import net.thucydides.core.webdriver.WebdriverInstances;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriverInfo;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCheckboxMultiple implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {



        List<WebElementFacade> listadoCheckBox = CheckBox.LISTA_CHECKBOX_MULTIPLE.resolveAllFor(theActor);
        for (WebElementFacade checkBox: listadoCheckBox
             ) {
            theActor.attemptsTo(Click.on(checkBox));
        }
    }




    public static SeleccionarCheckboxMultiple ahora(){
        return instrumented(SeleccionarCheckboxMultiple.class);
    }
}
