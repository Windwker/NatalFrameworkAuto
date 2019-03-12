package com.natalframework.cucumber.steps.wizard;

import com.natalframework.screenplay.actions.ClickEn;
import com.natalframework.screenplay.actions.WaitUntil;
import com.natalframework.screenplay.questions.wizard.Popup;
import com.natalframework.screenplay.questions.wizard.TextoUsuarioCreado;
import com.natalframework.screenplay.tasks.NavegarHacia;
import com.natalframework.screenplay.tasks.wizard.CompletarNombreApellidoEmailYPresionarSiguiente;
import com.natalframework.screenplay.tasks.wizard.SeleccionarFechaNacimiento;
import com.natalframework.screenplay.tasks.wizard.SeleccionarSexo;
import com.natalframework.screenplay.user_interface.CheckBox;
import com.natalframework.screenplay.user_interface.Input;
import com.natalframework.screenplay.user_interface.Label;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;


public class WizardUserStepdefs {

    Actor javi;


    @Before
    public void setTheStage() {
        javi = theActorCalled("Javi");
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en el website del wizard$")
    public void queMeEncuentroEnElWebsiteDelWizard() {
        javi.wasAbleTo(NavegarHacia.laPaginadelWizard());
    }

    @Cuando("^completo nombre apellido e email y presiono siguiente$")
    public void completoNombreApellidoEEmailYPresionoSiguiente() {
        javi.attemptsTo(CompletarNombreApellidoEmailYPresionarSiguiente.conLosValores("Javi", "Alvarez", "Javi@mail.com"));
    }

    @Entonces("^el sistema me posiciona en la pestana datos adicionales$")
    public void elSistemaMePosicionaEnLaPestanaDatosAdicionales() {
        javi.should(seeThat(the(Input.FECHA_DE_NACIMIENTO), isVisible()));
        javi.should(seeThat(the(CheckBox.SEXO_MASCULINO), isVisible()));
    }


    @Y("^cuando ingreso \"([^\"]*)\" como fecha  y selecciono sexo y presiono siguiente$")
    public void cuandoIngresoComoFechaYSeleccionoSexoYPresionoSiguiente(String arg0) {
        javi.attemptsTo(SeleccionarFechaNacimiento.ahora(arg0));
        javi.attemptsTo(SeleccionarSexo.masculino());
        javi.attemptsTo(ClickEn.elBotonSiguiente());
    }


    @Entonces("^el sistema me informa que se creo la cuenta correctamente$")
    public void elSistemaMeInformaQueSeCreoLaCuentaCorrectamente() {
        javi.should(seeThat(the(Label.USUARIO_CREADO), isVisible()));
        javi.should(seeThat(TextoUsuarioCreado.valor(), equalTo("Bárbaro Javi Alvarez!!\nYa podés crear tu cuenta, hace clic en finalizar !!")));
    }


    @Y("^al presionar Finalizar$")
    public void alPresionarFinalizar() {
        javi.attemptsTo(ClickEn.elBotonFinalizar());
    }

    @Entonces("^el sistema despliega un popup indicando de la creacion exitosa de la cuenta$")
    public void elSistemaDespliegaUnPopupIndicandoDeLaCreacionExitosaDeLaCuenta() {


        javi.attemptsTo(WaitUntil.AlertIsDisplayed());

        javi.should(seeThat(Popup.valor(), equalTo("Se ha creado la cuenta !!")));
    }
}
