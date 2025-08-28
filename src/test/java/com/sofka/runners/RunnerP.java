package com.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import com.sofka.utils.BeforeSuite;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/ScenariosWeb.feature",
        glue = {"com/sofka/stepDefinitios", "com/sofka/hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        },
        stepNotifications = true,
        monochrome = true,
        tags = "@ui"
)


public class RunnerP {
    @BeforeSuite
    public static void test() {
    }
}
