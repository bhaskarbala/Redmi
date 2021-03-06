package com.objectRepo.redmi.DashBord;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="user_name")
	private WebElement UserNameEideTextBox;
	
	@FindBy(name="user_password")
	private WebElement PasswordEideTextBox;
	@FindBy (id="submitButton")
	private WebElement LoginButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement LogoutButton;
	
	/**
	 * @return the logoutButton
	 */
	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	public WebElement getUserNameEideTextBox() {
		return UserNameEideTextBox;
	}

	public WebElement getPasswordEideTextBox() {
		return PasswordEideTextBox;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void getLoginToApp(String  username,String password) {
		UserNameEideTextBox.sendKeys(username);
		PasswordEideTextBox.sendKeys(password);
		LoginButton.click();
	}
	
	


}
