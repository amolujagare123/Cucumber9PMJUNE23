package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SampleSD {
    WebDriver driver;
    @Given("login page is opened")
    public void login_page_is_opened() {
        System.out.println("login page is opened");

        /*driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");*/
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");

    /*    driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");*/
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

     //   driver.findElement(By.name("submit")).click();
    }
    @Then("I should reach to the home page")
    public void i_should_reach_to_the_home_page() {
        System.out.println("I should reach to the home page");

       /* String expected = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("this is not a dashboard",
                expected,actual);*/
    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        System.out.println("I enter incorrect username and password");
    }

    @Then ("I should get an error")
    public void iShouldGetAnError()
    {
        System.out.println("I should get an error");
    }

    @When("I enter blank username and password")
    public void enterBlankCredentials() {
        System.out.println("I enter blank username and password");
    }

    @Then("I should get another error")
    public void verifyErrorMessage() {
        System.out.println("I should get another error");
        Assert.assertEquals("this is not a dashboard",
                true,false);
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Given("I am on user registration page")
    public void iAmOnUserRegistrationPage() {
        System.out.println("I am on user registration page");
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        System.out.println("I click on submit button");
    }

    @Then("the user should be added")
    public void theUserShouldBeAdded() {
        System.out.println("the user should be added");
    }

    @When("I enter below data")
    public void iEnterBelowData(DataTable dataTable) {
        //System.out.println("I am on user registration page");
        List<List<String>> data = dataTable.asLists();

        System.out.println("First name="+data.get(0).get(0));
        System.out.println("Last name="+data.get(0).get(1));
        System.out.println("phone="+data.get(0).get(2));
        System.out.println("Email="+data.get(0).get(3));

    }


    @Given("Open the browser")
    public void openTheBrowser() {

        System.out.println("======== >>>> Open the browser");
    }

    @And("maximize it")
    public void maximizeIt() {
        System.out.println("======== >>>> maximize it");
    }
}
