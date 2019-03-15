package com.natalframework.screenplay.tasks.slider;

import com.natalframework.screenplay.actions.MoverElSlider;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ComprobarComportamientoSlider implements Task {

    private final String posicion;

    public ComprobarComportamientoSlider(String posicion) {
        this.posicion = posicion;

    }

    public static ComprobarComportamientoSlider conLosValores(String posicion) {
        return instrumented(ComprobarComportamientoSlider.class, posicion);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(MoverElSlider.aLaPosicion(posicion));


    }

}
