package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Selector {
    public static Target SIMPLE = Target.the("Selector Simple").located(By.className("select2-selection__rendered"));
    public static Target MULTIPLE = Target.the("Selector Multiple").located(By.xpath("//li[@class=\"select2-selection__choice\"]"));

}
