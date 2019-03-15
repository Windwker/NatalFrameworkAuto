package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Slider {
    public static Target CONFIGURACION_SIMPLE = Target.the("Slider de configuracion simple").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div[5]"));
    public static Target CONFIGURACION_SIMPLE_WIDTH = Target.the("Slider de configuracion simple").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div"));
}
