package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target MULTIPLE_CHECKBOX = Target.the("Labels de los elementos disponibles").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/label"));
}
