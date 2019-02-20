package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Boton {
    public static Target ELIMINAR_OPCION = Target.the("Boton Eliminar Opcion").located(By.className("select2-selection__choice__remove"));
}
