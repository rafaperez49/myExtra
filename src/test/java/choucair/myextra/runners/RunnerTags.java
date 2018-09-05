package choucair.myextra.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/my_extra.feature",
		tags= "@CasoExitoso",
		glue="choucair.myextra.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class RunnerTags {

}