package com.natalframework.screenplay.tasks.datepickersimple;

import com.natalframework.screenplay.user_interface.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFechaVencimiento implements Task {


    private final String fecha_vencimiento_param;
    private String fecha_vencimiento;
    private String diaVencimientoUsuario;
    private String mesVencimientoUsuario;
    private String anoVencimientoUsuario;
    private int anoVencimientoUsuarioComoInt;
    private int mesVencimientoUsuarioComoInt;
    private int diaVencimientoUsuarioComoInt;
    private String[] fechaVencimientoDesgloce;

    public SeleccionarFechaVencimiento(String fecha_vencimiento_param) {
        this.fecha_vencimiento_param = fecha_vencimiento_param;
        fecha_vencimiento = fecha_vencimiento_param;
        fechaVencimientoDesgloce = fecha_vencimiento.split("/");
        diaVencimientoUsuario = fechaVencimientoDesgloce[0];
        mesVencimientoUsuario = fechaVencimientoDesgloce[1];
        anoVencimientoUsuario = fechaVencimientoDesgloce[2];
    }

    public static SeleccionarFechaVencimiento ahora(String fecha_vencimiento_param) {

        return instrumented(SeleccionarFechaVencimiento.class, fecha_vencimiento_param);
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

        theActor.attemptsTo(Click.on(Input.FECHA_DE_VENCIMIENTO));
        theActor.attemptsTo(Click.on(DatePicker.SELECTOR_MES));
        theActor.attemptsTo(Click.on(DatePicker.SELECTOR_ANO));
        theActor.attemptsTo(Click.on(DatePicker.SELECTOR_DECADA));

        rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA).viewedBy(theActor).asString();
        rangoDecada = rangoDecadaVisible.split("-");
        limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
        limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);
        anoVencimientoUsuarioComoInt = Integer.parseInt(anoVencimientoUsuario);
        mesVencimientoUsuarioComoInt = Integer.parseInt(mesVencimientoUsuario);
        diaVencimientoUsuarioComoInt = Integer.parseInt(diaVencimientoUsuario);


        // POSICIONARSE EN EL RANGO DE DECADA
        boolean decada_visible_correcta = false;
        if (anoVencimientoUsuarioComoInt < limiteInferiorRango) {
            while (!decada_visible_correcta) {

                if (anoVencimientoUsuarioComoInt >= limiteInferiorRango & anoVencimientoUsuarioComoInt <= limiteSuperiorRango) {
                    decada_visible_correcta = true;
                } else {
                    theActor.attemptsTo(Click.on(Boton.RANGO_ANTERIOR));
                    rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA).viewedBy(theActor).asString();
                    rangoDecada = rangoDecadaVisible.split("-");
                    limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
                    limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);
                }

            }
        } else if (anoVencimientoUsuarioComoInt > limiteSuperiorRango) {
            while (!decada_visible_correcta) {

                if (anoVencimientoUsuarioComoInt >= limiteInferiorRango && anoVencimientoUsuarioComoInt <= limiteSuperiorRango) {
                    decada_visible_correcta = true;
                } else {
                    theActor.attemptsTo(Click.on(Boton.RANGO_SIGUIENTE));
                    rangoDecadaVisible = Text.of(Label.SELECTOR_DECADA).viewedBy(theActor).asString();
                    rangoDecada = rangoDecadaVisible.split("-");
                    limiteInferiorRango = Integer.parseInt(rangoDecada[0]);
                    limiteSuperiorRango = Integer.parseInt(rangoDecada[1]);

                }
            }
        }

        // SELECCIONAR GRUPO DE ANOS

        List<WebElementFacade> listadoSelectoresGrupoAnos = Listas.SELECTORES_GRUPO_ANO.resolveAllFor(theActor);

        for (WebElementFacade selectorGrupoAnos: listadoSelectoresGrupoAnos
             ) {
            grupoAnoVisible = selectorGrupoAnos.getText();
            grupoAnos = grupoAnoVisible.split(" - ");
            limiteInferiorGrupoAnos = Integer.parseInt(grupoAnos[0]);
            limiteSuperiorGrupoAnos = Integer.parseInt(grupoAnos[1]);
            if (anoVencimientoUsuarioComoInt >= limiteInferiorGrupoAnos && anoVencimientoUsuarioComoInt <= limiteSuperiorGrupoAnos) {
                theActor.attemptsTo(Click.on(selectorGrupoAnos));

                break;
            }

        }
        // SELECCIONAR ANO

        List<WebElementFacade> listadoSelectoresAno = Listas.SELECTORES_ANO.resolveAllFor(theActor);
        for (WebElementFacade selectorAno : listadoSelectoresAno
        ) {
            ano = Integer.parseInt(selectorAno.getText());
            if (anoVencimientoUsuarioComoInt == ano) {
                selectorAno.click();
                break;
            }
        }

        // SELECCIONAR MES
        List<WebElementFacade> listadoSelectoresMes = Listas.SELECTORES_MES.resolveAllFor(theActor);

        for (int i = 0; i < listadoSelectoresMes.size(); i++) {
            if (i == (mesVencimientoUsuarioComoInt - 1)) {
                listadoSelectoresMes.get(i).click();

                break;
            }
        }

        // SELECCIONAR DIA
        List<WebElementFacade> listadoSelectoresDia = Listas.SELECTORES_DIA.resolveAllFor(theActor);
        for (int i = 1; i < listadoSelectoresDia.size(); i++) {
            if (i == (diaVencimientoUsuarioComoInt - 1)) {
                listadoSelectoresDia.get(i).click();


                break;


            }
        }

    }


}
