package com.natalframework.screenplay.actions;

import com.natalframework.screenplay.user_interface.Slider;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Attribute;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MoverElSlider implements Interaction {

    private final String value;

    public MoverElSlider(String value) {
        this.value = value;
    }

    public static MoverElSlider aLaPosicion(String value) {
        return instrumented(MoverElSlider.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {


        int valorEnInt = Integer.parseInt(value);


        WebElement handle = Slider.CONFIGURACION_SIMPLE.resolveFor(theActor);
        WebElement slider = Slider.CONFIGURACION_SIMPLE_WIDTH.resolveFor(theActor);


        float width = (slider.getSize().getWidth());
        float offset = width / 100;


        float actualHandleValue = (Attribute.of(Slider.CONFIGURACION_SIMPLE).named("aria-valuenow").viewedBy(theActor).asFloat());
        float actualHandleOffset = (Attribute.of(Slider.CONFIGURACION_SIMPLE).named("aria-valuenow").viewedBy(theActor).asFloat()) * offset;


        Actions move = new Actions(getDriver());

        if (actualHandleValue < valorEnInt) {
            int handlePosition = (int) ((offset * valorEnInt) - actualHandleOffset);
            Action dragAndDrop = move.dragAndDropBy(handle, handlePosition, 0).build();
            dragAndDrop.perform();
        } else {
            int handlePosition = (int) actualHandleOffset - ((int) ((offset * valorEnInt)));
            Action dragAndDrop = move.dragAndDropBy(handle, -handlePosition, 0).build();
            dragAndDrop.perform();
        }

        //String location =Slider.CONFIGURACION_SIMPLE_VALUE.resolveFor(theActor).getValue();


        //dragAndDrop = builder.clickAndHold(slider).moveByOffset(-(width / 2), 0).moveByOffset(((width/100)), 0).release().build();


        //dragAndDrop.perform();


    }
}

