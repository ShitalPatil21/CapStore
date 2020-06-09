package com.capgemini.hotelmanagement.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefination {

	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	}
	WebDriver driver;

	@Given("^the admin has loaded the application in the browser$")
	public void the_admin_has_loaded_the_application_in_the_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
	}

	@When("^the admin clicks  on the login Button navbar$")
	public void the_admin_clicks_on_the_login_Button_navbar() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("^the admin enters email in textbox$")
	public void the_admin_enters_email_in_textbox() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("shital@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the admin enters the password in the textbox$")
	public void the_admin_enters_the_password_in_the_textbox() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("Shital@123");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^the admin clicks on the login button$")
	public void the_admin_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/form/div/button")).click();
	}
	@When("^the admin clicks on Hotels$")
	public void the_admin_clicks_on_Hotels() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
	}

	@When("^the Admin Clicks on Any Of The Hotel$")
	public void the_Admin_Clicks_on_Any_Of_The_Hotel() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/app-root/app-viewhotels/div/div[1]/img")).click();
	}

	@Then("^the Admin Clicks on Delete Button$")
	public void the_Admin_Clicks_on_Delete_Button() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/app-root/app-viewhotels/app-hotel-details/div/div/div/button[2]")).click();
	}
	
	@When("^the Admin clicks on Add Hotel$")
	public void the_Admin_clicks_on_Add_Hotel() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Add Hotel']")).click();
	}

	@When("^the Admin enters Hotel Name$")
	public void the_Admin_enters_Hotel_Name() throws Throwable {
		driver.findElement(By.name("hotelName")).sendKeys("Skylink");
	}

	@When("^the Admin enters Hotel Location$")
	public void the_Admin_enters_Hotel_Location() throws Throwable {
		driver.findElement(By.name("hotelLocation")).sendKeys("Delhi");
	}

	@When("^the Admin enters Contact Number$")
	public void the_Admin_enters_Contact_Number() throws Throwable {
		driver.findElement(By.name("contactNo")).sendKeys("9172029365");
	}
	@When("^the Admin enters Image$")
	public void the_Admin_enters_Image() throws Throwable {
		driver.findElement(By.name("imgURL")).sendKeys("https://media-public.canva.com/MADA0Pu-hQA/1/thumbnail_large-1.jpg");
	}


	@Then("^the Admin clicks on submit$")
	public void the_Admin_clicks_on_submit() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-add-hotel/div/form/div[5]/button[2]")).click();
	}

	@When("^the Admin clicks on Users Dropdown$")
	public void the_Admin_clicks_on_Users_Dropdown() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[4]/a")).click();
	}

	@When("^the Admin clicks On users list$")
	public void the_Admin_clicks_On_users_list() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[4]/div/a[1]")).click();
	}
	@When("^the Admin clicks on Employee Dropdown$")
	public void the_Admin_clicks_on_Employee_Dropdown() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[4]/a")).click();
	}

	@When("^the Admin clicks On Employee list$")
	public void the_Admin_clicks_On_Employee_list() throws Throwable {
		
	   driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[1]/li[4]/div/a[2]")).click();	
	}
	@When("^the Admin clicks on Change Password$")
	public void the_Admin_clicks_on_Change_Password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavId\"]/ul[1]/li[5]/a")).click();
	}

	@When("^the Admin enters old password$")
	public void the_Admin_enters_old_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-change-password/div/form/div[1]/input")).sendKeys("Shitu@123");
	}

	@When("^the Admin enters new Password$")
	public void the_Admin_enters_new_Password() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-change-password/div/form/div[2]/input")).sendKeys("Shital@123");
	}

	@Then("^the Admin clicks on submit button$")
	public void the_Admin_clicks_on_submit_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/app-root/app-change-password/div/form/button")).click();
	}
	
	@When("^the Admin clicks on Logout button on navbar$")
	public void the_Admin_clicks_on_Logout_button_on_navbar() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/ul[2]/li[2]/button"));
	}

	@Then("^the admin close the driver$")
	public void the_admin_close_the_driver() throws Throwable {
	    driver.close();
	}


}