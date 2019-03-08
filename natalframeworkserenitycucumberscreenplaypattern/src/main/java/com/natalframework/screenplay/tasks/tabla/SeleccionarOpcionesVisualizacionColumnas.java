package com.natalframework.screenplay.tasks.tabla;

import com.natalframework.screenplay.user_interface.Boton;
import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionesVisualizacionColumnas implements Task {

    private final String opcion1, opcion2, opcion3;

    public SeleccionarOpcionesVisualizacionColumnas(String opcion1, String opcion2, String opcion3) {
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
    }

    public static SeleccionarOpcionesVisualizacionColumnas conLosValores(String opcion1, String opcion2, String opcion3) {
        return instrumented(SeleccionarOpcionesVisualizacionColumnas.class, opcion1, opcion2, opcion3);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(Click.on(Boton.NINGUNO_OPCION_COLUMNAS));
        List<WebElementFacade> listadoElementos = Listas.OPCIONES_DE_COLUMNA.resolveAllFor(theActor);
        for (WebElementFacade elemento : listadoElementos
        ) {
            if (elemento.getText().contains(opcion1) || elemento.getText().contains(opcion2) || elemento.getText().contains(opcion3)) {
                elemento.click();
            }
        }
    }
}
