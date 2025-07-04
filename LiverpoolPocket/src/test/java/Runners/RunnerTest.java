package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@miCuenta",
        features = {"./src/test/resources/Features"},
        glue = "StepDefinitions",
        plugin = {"summary", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerTest {
}

