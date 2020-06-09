package com.capgemini.hotelmanagement.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeStepDefination {

	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	}
	WebDriver driver;

	@Given("^the employee has load the application in the browser$")
	public void the_employee_has_load_the_application_in_the_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
	}


@When("^the employee clicks on the login Button navbar$")
public void the_employee_clicks_on_the_login_Button_navbar() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Login']")).click();
}

	@When("^the employee enters email in textbox$")
	public void the_employee_enters_email_in_textbox() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("sayali@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee enters the password in the textbox$")
	public void the_employee_enters_the_password_in_the_textbox() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("Sayali@123");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee clicks on the login button$")
	public void the_employee_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/button")).click();
	}

	@When("^the employee clicks on Rooms$")
	public void the_employee_clicks_on_Rooms() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[2]/a")).click();
	}

	@Then("^the employee clicks on  View Rooms$")
	public void the_employee_clicks_on_View_Rooms() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavId\"]/ul[1]/li[2]/div/a[1]")).click();
	}
	@When("^the employee click on Rooms$")
	public void the_employee_click_on_Rooms() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[2]/a")).click();
	}

	@When("^the employee click on View Rooms$")
	public void the_employee_click_on_View_Rooms() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[2]/a")).click();
	}

	@When("^the employee click on Delete button$")
	public void the_employee_click_on_Delete_button() throws Throwable {
		
	driver.findElement(By.xpath("/html/body/app-root/app-room-details/div/div/button[1]")).click();
	driver.close();
	}
	@When("^the employee click on Room$")
	public void the_employee_click_on_Room() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[2]/a")).click();
	}

	@When("^the employee click on add Rooms$")
	public void the_employee_click_on_add_Rooms() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavId\"]/ul[1]/li[2]/div/a[2]")).click();
	}

	@When("^the employee enters room capacity$")
	public void the_employee_enters_room_capacity() throws Throwable {
		driver.findElement(By.name("roomCapacity")).sendKeys("2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee enters room rent$")
	public void the_employee_enters_room_rent() throws Throwable {
		driver.findElement(By.name("roomRent")).sendKeys("2000");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee enters Hotel Name$")
	public void the_employee_enters_Hotel_Name() throws Throwable {
		driver.findElement(By.name("hotelName")).sendKeys("Manikandn");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee enters room No$")
	public void the_employee_enters_room_No() throws Throwable {
		driver.findElement(By.name("roomNo")).sendKeys("987");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the employee click on Submit$")
	public void the_employee_click_on_Submit() throws Throwable {
	   driver.findElement(By.xpath("/html/body/app-root/app-add-room/div/form/div[6]/button[2]"));
	}


}
