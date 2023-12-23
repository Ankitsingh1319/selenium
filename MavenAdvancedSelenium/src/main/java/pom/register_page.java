package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.utility_methods;



public class register_page extends Base_page {
	
	 public register_page(WebDriver driver) {
		super(driver);
	}
	 
	@FindBy(id = "gender-male")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}

	@FindBy(id = "FirstName")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id = "LastName")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(id = "Password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	@FindBy(id = "register-button")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}
}
