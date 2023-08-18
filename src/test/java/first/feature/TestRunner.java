package first.feature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features/Login.feature"}
     //   glue = {"first.feature.StepDefinitions.loginSteps"}
//        tags = "@google"
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
