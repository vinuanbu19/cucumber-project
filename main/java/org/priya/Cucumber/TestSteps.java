package org.priya.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestSteps {
	static WebDriver driver;

	@Given("^The user is in demoqa home page$")
	public void the_user_is_in_demoqa_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\raji\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		// throw new PendingException();
	}

	@When("^The user enter firstname and lastname$")
	public void the_user_enter_firstname_and_lastname() throws Throwable {
		driver.findElement(By.id("name_3_firstname")).sendKeys("Raji");
		driver.findElement(By.id("name_3_lastname")).sendKeys("raji");

		// throw new PendingException();
	}

	@Then("^The user verifies the entered text$")
	public void the_user_verifies_the_entered_text() throws Throwable {
		Assert.assertEquals(driver.findElement(By.id("name_3_firstname")).getAttribute("value"), "Raji");
		Assert.assertEquals(driver.findElement(By.id("name_3_lastname")).getAttribute("value"), "raji");
		// throw new PendingException();
	}
	@When("^The user enter the country as india$")
	public void the_user_enter_the_country_as_india() throws Throwable {
	    WebElement element = driver.findElement(By.id("dropdown_7"));
	    Select s=new Select(element);
		s.selectByVisibleText("India");
	    //throw new PendingException();
	}

@Then("^The user verifies the  text$")
public void the_user_verifies_the_text() throws Throwable {
	Assert.assertEquals(driver.findElement(By.id("dropdown_7")).getAttribute("value"), "India");
    //throw new PendingException();
}

	

}
