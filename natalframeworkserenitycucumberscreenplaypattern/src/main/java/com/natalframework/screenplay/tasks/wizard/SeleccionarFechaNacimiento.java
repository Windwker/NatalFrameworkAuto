package com.natalframework.screenplay.tasks.wizard;

import com.natalframework.screenplay.user_interface.Boton;
import com.natalframework.screenplay.user_interface.Input;
import com.natalframework.screenplay.user_interface.Label;
import com.natalframework.screenplay.user_interface.Listas;
import com.natalframework.screenplay.user_interface.datepicker.DatePickerAltaUsuario;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechaNacimiento implements Task {


    private final String fecha_nacimiento_param;
    private String fecha_nacimiento;
    private String diaNacimientoUsuario;
    private String mesNacimientoUsuario;
    private String anoNacimientoUsuario;
    private int anoNacimientoUsuarioComoInt;
    private int mesNacimientoUsuarioComoInt;
    private int diaNacimientoUsuarioComoInt;
    private String[] fechaNacimientoDesgloce;

    public SeleccionarFechaNacimiento(String fecha_nacimiento_param) {
        this.fecha_nacimiento_param = fecha_nacimiento_param;
        fecha_nacimiento = fecha_nacimiento_param;
        fechaNacimientoDesgloce = fecha_nacimiento.split("/");
        diaNacimientoUsuario = fechaNacimientoDesgloce[0];
        mesNacimientoUsuario = fechaNacimientoDesgloce[1];
        anoNacimientoUsuario = fechaNacimientoDesgloce[2];
    }

    public static SeleccionarFechaNacimiento ahora(String fecha_vencimiento_param) {

        return instrumented(SeleccionarFechaNacimiento.class, fecha_vencimiento_param);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        String rangoDecadaVisible;
        String grupoAnoVisible;
        int limiteInferiorRango;
        int limiteSuperiorRango;
        int limiteInferiorGrupoAnos;
        int limiteSuperiorGrupoAnos;
        int ano;
        String[] rangoDecada;
        String[] grupoAnos;

        theActor.attemptsTo(Click.on(Input.FECHA_DE_NACIMIENTO));
        theActor.attemptsTo(Click.on(DatePickerAltaUsuario.SELECTOR_MES));
        theActor.attemptsTo(Click.on(DatePickerAltaUsuario.SELECTOR_ANO));
        theActor.attemptsTo(Click.on(DatePickerAltaUsuario.SELECTOR_DECADA));

        rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA_FECHA_NACIMIENTO).viewedBy(theActor).asString();
        rangoDecada = rangoDecadaVisible.split("-");
        limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
        limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);
        anoNacimientoUsuarioComoInt = Integer.parseInt(anoNacimientoUsuario);
        mesNacimientoUsuarioComoInt = Integer.parseInt(mesNacimientoUsuario);
        diaNacimientoUsuarioComoInt = Integer.parseInt(diaNacimientoUsuario);


        // POSICIONARSE EN EL RANGO DE DECADA
        boolean decada_visible_correcta = false;
        if (anoNacimientoUsuarioComoInt < limiteInferiorRango) {
            while (!decada_visible_correcta) {

                if (anoNacimientoUsuarioComoInt >= limiteInferiorRango & anoNacimientoUsuarioComoInt <= limiteSuperiorRango) {
                    decada_visible_correcta = true;
                } else {
                    theActor.attemptsTo(Click.on(Boton.RANGO_ANTERIOR));
                    rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA_FECHA_NACIMIENTO).viewedBy(theActor).asString();
                    rangoDecada = rangoDecadaVisible.split("-");
                    limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
                    limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);
                }

            }
        } else if (anoNacimientoUsuarioComoInt > limiteSuperiorRango) {
            while (!decada_visible_correcta) {

                if (anoNacimientoUsuarioComoInt >= limiteInferiorRango && anoNacimientoUsuarioComoInt <= limiteSuperiorRango) {
                    decada_visible_correcta = true;
                } else {
                    theActor.attemptsTo(Click.on(Boton.RANGO_SIGUIENTE));
                    rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA_FECHA_NACIMIENTO).viewedBy(theActor).asString();
                    rangoDecada = rangoDecadaVisible.split("-");
                    limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
                    limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);

                }
            }
        }

        // SELECCIONAR GRUPO DE ANOS

        List<WebElementFacade> listadoSelectoresGrupoAnos = Listas.SELECTORES_GRUPO_ANO.resolveAllFor(theActor);

        for (WebElementFacade selectorGrupoAnos : listadoSelectoresGrupoAnos
        ) {
            grupoAnoVisible = selectorGrupoAnos.getText();
            grupoAnos = grupoAnoVisible.split(" - ");
            limiteInferiorGrupoAnos = Integer.parseInt(grupoAnos[0]);
            limiteSuperiorGrupoAnos = Integer.parseInt(grupoAnos[1]);
            if (anoNacimientoUsuarioComoInt >= limiteInferiorGrupoAnos && anoNacimientoUsuarioComoInt <= limiteSuperiorGrupoAnos) {
                theActor.attemptsTo(Click.on(selectorGrupoAnos));

                break;
            }

        }
        // SELECCIONAR ANO

        List<WebElementFacade> listadoSelectoresAno = Listas.SELECTORES_ANO.resolveAllFor(theActor);
        for (WebElementFacade selectorAno : listadoSelectoresAno
        ) {
            ano = Integer.parseInt(selectorAno.getText());
            if (anoNacimientoUsuarioComoInt == ano) {
                selectorAno.click();
                break;
            }
        }

        // SELECCIONAR MES
        List<WebElementFacade> listadoSelectoresMes = Listas.SELECTORES_MES.resolveAllFor(theActor);

        for (int i = 0; i < listadoSelectoresMes.size(); i++) {
            if (i == (mesNacimientoUsuarioComoInt - 1)) {
                listadoSelectoresMes.get(i).click();

                break;
            }
        }

        // SELECCIONAR DIA
        List<WebElementFacade> listadoSelectoresDia = Listas.SELECTORES_DIA.resolveAllFor(theActor);
        for (int i = 1; i < listadoSelectoresDia.size(); i++) {
            if (i == (diaNacimientoUsuarioComoInt - 1)) {
                listadoSelectoresDia.get(i).click();


                break;


            }
        }

    }


}
