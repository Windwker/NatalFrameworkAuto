package com.natalframework.screenplay.tasks.notificacion;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAlgunaNotificacion implements Task {
    public static SeleccionarAlgunaNotificacion ahora() {
        return instrumented(SeleccionarAlgunaNotificacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        List<WebElementFacade> listadoDeBotones = Listas.BOTONES_NOTIFICACION.resolveAllFor(theActor);
        listadoDeBotones.remove(listadoDeBotones.size() - 1);
        listadoDeBotones.get((int) (Math.random() * 12)).click();

    }

}
