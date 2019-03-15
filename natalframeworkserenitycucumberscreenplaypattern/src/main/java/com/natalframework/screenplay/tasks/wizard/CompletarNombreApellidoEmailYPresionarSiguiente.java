package com.natalframework.screenplay.tasks.wizard;

import com.natalframework.screenplay.user_interface.Boton;
import com.natalframework.screenplay.user_interface.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarNombreApellidoEmailYPresionarSiguiente implements Task {

    private final String nombre, apellido, email;

    public CompletarNombreApellidoEmailYPresionarSiguiente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public static CompletarNombreApellidoEmailYPresionarSiguiente conLosValores(String nombre, String apellido, String email) {
        return instrumented(CompletarNombreApellidoEmailYPresionarSiguiente.class, nombre, apellido, email);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(Enter.theValue(nombre).into(Input.NOMBRE));
        theActor.attemptsTo(Enter.theValue(apellido).into(Input.APELLIDO));
        theActor.attemptsTo(Enter.theValue(email).into(Input.EMAIL));
        theActor.attemptsTo(Click.on(Boton.SIGUIENTE));


    }

}
