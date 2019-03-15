package com.natalframework.screenplay.tasks.treeview;

import com.natalframework.screenplay.user_interface.Listas;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionTreeView implements Task {

    private final String valor;

    public SeleccionarOpcionTreeView(String valor) {
        this.valor = valor;
    }

    public static SeleccionarOpcionTreeView conElValor(String valor) {
        return instrumented(SeleccionarOpcionTreeView.class, valor);
    }

    public <T extends Actor> void performAs(T theActor) {
        List<WebElementFacade> listadoElementos = Listas.ELEMENTOS_TREE_VIEW.resolveAllFor(theActor);
        List<WebElementFacade> listadoCheckbox = Listas.CHECKBOX_TREE_VIEW.resolveAllFor(theActor);

        for (int i = 0; i < listadoElementos.size(); i++) {
            if (listadoElementos.get(i).getText().contains(valor)) {
                listadoCheckbox.get(i).click();
                return;
            }
        }


    }

}
