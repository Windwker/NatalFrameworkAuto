package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Tabla {
    public static Target TABLA_USUARIOS = Target.the("Tabla de usuarios").located(By.xpath("//tbody/tr"));
}
