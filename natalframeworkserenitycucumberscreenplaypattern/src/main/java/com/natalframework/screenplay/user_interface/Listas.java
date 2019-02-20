package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Listas {
    public static Target RESULTADOS_BUSQUEDA_SIMPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("/html/body/span/span/span[2]/ul/li"));
    public static Target RESULTADOS_BUSQUEDA_MULTIPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("//*[@class=\"select2-results__options\"]/li"));
    public static Target RESULTADO_CHECKBOX_SELECCIONADOS = Target.the("Listado de checkbox seleccionados").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/ul/li"));


}
