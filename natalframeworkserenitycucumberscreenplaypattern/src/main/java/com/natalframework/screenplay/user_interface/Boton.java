package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Boton {


    public static Target ELIMINAR_OPCION = Target.the("Boton Eliminar Opcion").located(By.className("select2-selection__choice__remove"));
    public static Target RANGO_ANTERIOR = Target.the("Boton para ir al rango anterior").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[4]/table/thead/tr/th[1]/span"));
    public static Target RANGO_SIGUIENTE = Target.the("Boton para ir al siguiente rango").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/div/ul/li[1]/div/div[4]/table/thead/tr/th[3]/span"));
    public static Target GENERAR_FILTRO = Target.the("Boton para generar filtro").located(By.xpath("//div/*[@class=\"btn btn-primary\"]"));
    public static Target ABRIR_MODAL = Target.the("Boton para abrir el modal").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/button"));
    public static Target CERRAR_MODAL = Target.the("Boton para cerrar el modal").located(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/button/span"));
    public static Target ANADIR_OPCION_RADIOBUTTON = Target.the("Boton para anadir radio button").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/form/div[2]/div/button"));
    public static Target COLUMNAS = Target.the("Botón de Columnas").located(By.xpath("//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/div[2]/div[1]/button[2]"));
    public static Target NINGUNO_OPCION_COLUMNAS = Target.the("Botón Ninguno").located(By.xpath("//*[contains(@class,\"dt-button buttons-colvisGroup\")][2]"));
    public static Target TODOS_OPCION_COLUMNAS = Target.the("Botón Todas las Opciones").located(By.xpath("//*[contains(@class,\"dt-button buttons-colvisGroup\")][1]"));
    public static Target EXPORTAR_TABLA = Target.the("Botón Exportar Tabla").located(By.xpath("//*[@class=\"dt-buttons DTTT_container\"]/button[@title=\"Exportar\"]"));
    public static Target DESCARGAR_EXCEL = Target.the("Botón Descargar Excel").located(By.xpath("//*[@class=\"dt-buttons DTTT_container\"]/ul/li[2]"));
}
