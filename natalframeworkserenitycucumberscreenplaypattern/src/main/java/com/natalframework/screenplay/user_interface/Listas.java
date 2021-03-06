package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Listas {
    public static Target RESULTADOS_BUSQUEDA_SIMPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("/html/body/span/span/span[2]/ul/li"));
    public static Target RESULTADOS_BUSQUEDA_MULTIPLE = Target.the("Listado de resultado de búsquedas").located(By.xpath("//*[@class=\"select2-results__options\"]/li"));
    public static Target RESULTADO_CHECKBOX_SELECCIONADOS = Target.the("Listado de checkbox seleccionados").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/ul/li"));
    public static Target SELECTORES_GRUPO_ANO = Target.the("Listado de selectores Grupo Ano").located(By.xpath("//span[@data-action=\"selectDecade\"]"));
    public static Target SELECTORES_ANO = Target.the("Listado de selectores Ano").located(By.xpath("//span[@data-action=\"selectYear\"]"));
    public static Target SELECTORES_MES = Target.the("Listado de selectores Mes").located(By.xpath("//span[@data-action=\"selectMonth\"]"));
    public static Target SELECTORES_DIA = Target.the("Listado de selectores Dia").located(By.xpath("//td[@data-action=\"selectDay\"][@class!=\"day old\"][@class!=\"day new\"][@class!=\"day new weekend\"][@class!=\"day old weekend\"]"));
    public static Target ARCHIVOS_DESCARGA = Target.the("Listado de archivos para descargar").located(By.xpath("//i[@class=\"fa fa-download\"]"));
    public static Target BOTONES_NOTIFICACION = Target.the("Listado de botones para notificaciones").located(By.xpath("//*[@class=\"btn btn-primary\"]"));
    public static Target OPCIONES_DE_COLUMNA = Target.the("Listado de opciones de columna").located(By.xpath("//*[contains(@class,\"dt-button buttons-columnVisibility\")]"));
    public static Target BOTONES_DE_COLUMNA = Target.the("Listado de opciones de columna").located(By.xpath("//*[contains(@class,\"dt-button buttons-colvis\")]"));
    public static Target COLUMNAS_DE_TABLA = Target.the("Lista de columnas de tabla").located(By.xpath("//*[@id=\"DataTables_Table_1\"]/thead/tr/th[@class!=\"select-col text-center sorting_disabled\"]"));
    public static Target ELEMENTOS_TREE_VIEW = Target.the("Lista de elementos del treeview").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/ul/li"));
    public static Target CHECKBOX_TREE_VIEW = Target.the("Lista de checkbox del treeview").located(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/ul/li/span[@class=\"treeview-item__check\"or@class=\"treeview-item__opener\"]"));
    public static Target test = Target.the("test").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/ul"));
}
