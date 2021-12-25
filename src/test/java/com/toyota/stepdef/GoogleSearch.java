package com.toyota.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.toyota.common.GoogleBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBase {
	WebDriver driver;

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		//closebrowser();
		//closeAllBrowsers();
	}

	@When("I enter seach {string}")
	public void i_enter_seach(String term) {

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(term);
	}

	@When("I click on google seach button")
	public void i_click_on_google_seach_button() {

		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.submit();
	}

	@Then("I receive related search results")
	public void i_receive_related_search_results() {

		WebElement results = driver.findElement(By.id("result-stats"));
		String searchCount = results.getText();

		System.out.println("=======================================================");
		System.out.println(searchCount);
		System.out.println("=======================================================");
		driver.close();
	}
}
