package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Modal {

    public static Target CONTENEDOR = Target.the("Contenedor Modal").located(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div"));
    public static Target MENSAJE_DESCARGA = Target.the("Modal descarga").located(By.xpath("/html/body/div[2]/div"));

}
