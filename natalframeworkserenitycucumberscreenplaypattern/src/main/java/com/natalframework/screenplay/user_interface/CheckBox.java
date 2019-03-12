package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckBox {
    public static Target CONTENEDOR_CHECKBOX_BASICO = Target.the("CheckBox Básico").located(By.xpath("//*[@id=\"checkInputId_132\"]"));
    public static Target CHECKBOX_BASICO =Target.the("CheckBox Básico").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/label"));
    public static Target LISTA_CHECKBOX_MULTIPLE = Target.the("Lista Checkbox Multiple").located(By.xpath("//*/div[@class=\"col-xs-6 form-group\"][1]/div"));
    public static Target CHECKBOX_MULTIPLE_ATRIBUTOS = Target.the("Primer elemento de la lista de checkbox").located(By.xpath("//*[@id=\"checkInputId_132\"]"));
    public static Target SEXO_MASCULINO = Target.the("Checkbox Sexo Masculino").located(By.xpath("//*[@id=\"form2\"]/div[2]/div/div[1]/label"));

}
