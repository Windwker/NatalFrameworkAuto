package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Icono {
    public static Target EXITO = Target.the("Ícono de éxito").located(By.xpath("//*[@class=\"fa fa-check-circle text-success\"]"));

}
