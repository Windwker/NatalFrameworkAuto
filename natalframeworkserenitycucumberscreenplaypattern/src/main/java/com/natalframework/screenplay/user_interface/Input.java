package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Input {
    public static Target CAMPO_BUSQUEDA_SIMPLE = Target.the("Campo Busqueda").located(By.className("select2-search__field"));
    public static Target CAMPO_BUSQUEDA_MULTIPLE = Target.the("Campo Busqueda").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/form/div/div/span/span/span[1]/span/ul/li/input"));
    public static Target FECHA_DE_VENCIMIENTO = Target.the("Picker de fecha de vencimiento").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/input"));
}
