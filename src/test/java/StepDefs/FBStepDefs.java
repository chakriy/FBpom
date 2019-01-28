package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.sql.SQLOutput;
import static StepDefs.FBLoginPage.accessFB;
import static StepDefs.Hooks.driver;

public class FBStepDefs
{
    FBLoginPage fbl;
    @Given("^Opening Facebook Homepage$")
    public void facebookGiven()
    {
        System.out.println("Hello");
        System.out.println(" I am in FB GIVEN");
        fbl = new FBLoginPage(driver);
    }

    @When("^Capture the WebElements$")
    public void facebookWhen()
    {
        System.out.println(" I am in FB WHEN" + "\n");
        fbl.isSeen();
    }

    @Then("^login into facebook$")
    public void facebookThen()
    {
        System.out.println("I am in FB THEN" + "\n");
        System.out.println(driver.getTitle() + "\n");
        Assert.assertEquals(true, driver.getTitle().contains("Facebook"));
        fbl.click1();
    }
}
