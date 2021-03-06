package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target MULTIPLE_CHECKBOX = Target.the("Labels de los elementos disponibles").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/label"));
    public static Target SELECTOR_DECADA_FECHA_VENCIMIENTO = Target.the("Label de decada seleccionada").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[4]/table/thead/tr/th[2]"));
    public static Target FECHA_VENCIMIENTO_SELECCIONADA = Target.the("Label de fecha de vencimiento seleccionada").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/p"));
    public static Target CONSULTA_SQL = Target.the("Consulta Sql").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/pre/code"));
    public static Target OPCION_SELECCIONADA_RADIOBUTTON = Target.the("Opcion seleccionada radio button").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/p"));
    public static Target VALOR_SELECCIONADO_SLIDER = Target.the("Valor seleccionado del slider").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/span/strong"));
    public static Target SELECTOR_DECADA_FECHA_NACIMIENTO = Target.the("Label de decada seleccionada").located(By.xpath("//*[@id=\"form2\"]/div[1]/div/span/div/div/ul/li[1]/div/div[4]/table/thead/tr/th[2]"));
    public static Target USUARIO_CREADO = Target.the("Cuadro de usuario creado").located(By.xpath("//*[@id=\"wizard\"]/div[1]/div[3]"));
}
