package com.natalframework.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/autocomplete", tags = "@current", glue = "src/test/java/com.natalframework.cucumber/steps/autocomplete/AutoCompleteUserStepdefs.java" )
public class AutoCompleteRunner {
}
