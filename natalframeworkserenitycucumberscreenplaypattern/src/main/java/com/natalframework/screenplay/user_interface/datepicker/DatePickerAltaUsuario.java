package com.natalframework.screenplay.user_interface.datepicker;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatePickerAltaUsuario {

    public static Target SELECTOR_ANO = Target.the("Datepicker Ano").located(By.xpath("//*[@id=\"form2\"]/div[1]/div/span/div/div/ul/li[1]/div/div[2]/table/thead/tr/th[2]"));
    public static Target SELECTOR_DECADA = Target.the("Datepicker Decada").located(By.xpath("//*[@id=\"form2\"]/div[1]/div/span/div/div/ul/li[1]/div/div[3]/table/thead/tr/th[2]"));
    public static Target SELECTOR_MES = Target.the("Selector Mes").located(By.xpath("//*[@id=\"form2\"]/div[1]/div/span/div/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]"));
}
