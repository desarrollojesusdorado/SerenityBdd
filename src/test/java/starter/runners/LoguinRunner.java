package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = {"starter.stepdefinitions","starter.hook", "starter/models"},
        tags = "@Login",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoguinRunner {
}
