package StepDefs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="D:\\FBpom1\\src\\test\\Feature",

        // tags = {""},

        glue={"StepDefs"},
        //format = {"json:target/cucumber.json" +
        //        ""}
        //plugin = { "pretty", "html:target/cucumber-reports" }
        plugin = { "pretty", "json:target/cucumber.json" }
)
public class TestRunner {

}