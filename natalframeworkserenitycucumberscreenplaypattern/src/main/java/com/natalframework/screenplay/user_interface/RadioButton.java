package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButton {
    public static Target LISTADO = Target.the("Listado de Radio Buttons").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/form/div[1]/div/span/label"));
}
