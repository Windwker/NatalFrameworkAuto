package com.natalframework.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Input {
    public static Target CAMPO_BUSQUEDA_SIMPLE = Target.the("Campo Busqueda").located(By.className("select2-search__field"));
    public static Target CAMPO_BUSQUEDA_MULTIPLE = Target.the("Campo Busqueda").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/form/div/div/span/span/span[1]/span/ul/li/input"));
    public static Target FECHA_DE_VENCIMIENTO = Target.the("Picker de fecha de vencimiento").located(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/span/div/input"));
    public static Target FILTRO = Target.the("Campo Filtro").located(By.className("form-control"));
    public static Target OPCION_RADIO_BUTTON = Target.the("Input para agregar radio button").located(By.xpath("//*[@id=\"newVehicle\"]"));
    public static Target CRITERIO_BUSQUEDA = Target.the("Input de Criterio de Busqueda para la tabla").located(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input"));
    public static Target NOMBRE = Target.the("Campo nombre").located(By.id("nombre"));
    public static Target APELLIDO = Target.the("Campo nombre").located(By.id("apellido"));
    public static Target EMAIL = Target.the("Campo email").located(By.id("email"));
    public static Target FECHA_DE_NACIMIENTO = Target.the("Picker de fecha de nacimiento").located(By.id("date"));

}


