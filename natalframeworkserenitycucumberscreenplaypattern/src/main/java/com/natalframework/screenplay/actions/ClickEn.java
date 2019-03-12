package com.natalframework.screenplay.actions;

import com.natalframework.screenplay.user_interface.Boton;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ClickEn {


    public static Interaction elBotonColumnas() {
        return Click.on(Boton.COLUMNAS);
    }

    public static Interaction elBotonTodos() {
        return Click.on(Boton.TODOS_OPCION_COLUMNAS);
    }

    public static Interaction elBotonExportar() {
        return Click.on(Boton.EXPORTAR_TABLA);
    }


    public static Interaction elBotonSiguiente() {
        return Click.on(Boton.SIGUIENTE);
    }

    public static Interaction elBotonFinalizar() {
        return Click.on(Boton.FINALIZAR);
    }


}
