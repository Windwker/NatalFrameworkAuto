package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Listas {
    public static Target RESULTADOS_BUSQUEDA_SIMPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("/html/body/span/span/span[2]/ul/li"));
    public static Target RESULTADOS_BUSQUEDA_MULTIPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("//*[@class=\"select2-results__options\"]/li"));
    public static Target RESULTADO_CHECKBOX_SELECCIONADOS = Target.the("Listado de checkbox seleccionados").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/ul/li"));
    public static Target SELECTORES_GRUPO_ANO = Target.the("Listado de selectores Grupo Ano").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[4]/table/tbody/tr/td/span[@data-action=\"selectDecade\"]"));
    public static Target SELECTORES_ANO = Target.the("Listado de selectores Ano").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[3]/table/tbody/tr/td/span"));
    public static Target SELECTORES_MES = Target.the("Listado de selectores Mes").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[2]/table/tbody/tr/td/span"));
    public static Target SELECTORES_DIA = Target.the("Listado de selectores Dia").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[1]/table/tbody/tr//td[@class!=\"day old\"][@class!=\"day new\"][@class!=\"day new weekend\"]"));
    public static Target ARCHIVOS_DESCARGA = Target.the("Listado de archivos para descargar").located(By.xpath("//i[@class=\"fa fa-download\"]"));
    public static Target BOTONES_NOTIFICACION = Target.the("Listado de botones para notificaciones").located(By.xpath("//*[@class=\"btn btn-primary\"]"));

}
