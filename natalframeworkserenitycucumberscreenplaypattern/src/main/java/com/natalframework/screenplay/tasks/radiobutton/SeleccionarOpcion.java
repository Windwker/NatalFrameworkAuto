package com.natalframework.screenplay.tasks.radiobutton;

import com.natalframework.screenplay.user_interface.RadioButton;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {

    private final String numero;

    public SeleccionarOpcion(String numero) {
        this.numero = numero;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        List<WebElementFacade> listadoRadioButton = RadioButton.LISTADO.resolveAllFor(theActor);
        for (int i = 0; i< listadoRadioButton.size(); i++){
            if (i==(Integer.parseInt(numero)-1)){
                listadoRadioButton.get(i).click();
            }
        }
    }


    public static SeleccionarOpcion numero(String numero){
        return instrumented(SeleccionarOpcion.class,numero);
    }

}
