package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zadanie1StepsDefinition {
    WebDriver driver;

    @Given("an open browser with CodersGuru site")
    public void openCodersGuru() {
        System.setProperty("webdriver.geckodriver.exe",
                "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("https://men-men-s-01.codersguru.pl/");
    }

    @When("entering correct email (.*)")
    public  void  completeInformation(String email){
        WebElement element = driver.findElement(By.name("email"));
        element.clear();
        element.sendKeys(email);
        element.submit();
    }

    @Then("^login correctly using (.*)$")
    public void loginCorrectly(String email){
        System.out.println(email);
    }
}
