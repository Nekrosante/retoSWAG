package reto.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/swagLabs.feature",
        tags = "@stories",
        glue = "reto.saucedemo.stepdefinitions")
        //snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}