package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target MULTIPLE_CHECKBOX = Target.the("Labels de los elementos disponibles").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/label"));
    public static Target SELECTOR_DECADA = Target.the("Label de decada seleccionada").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[4]/table/thead/tr/th[2]"));
    public static Target FECHA_VENCIMIENTO_SELECCIONADA = Target.the("Label de fecha de vencimiento seleccionada").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/p"));
}
