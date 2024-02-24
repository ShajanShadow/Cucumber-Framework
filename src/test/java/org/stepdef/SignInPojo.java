package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class SignInPojo extends BaseClass {
	public SignInPojo() {
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstNameTxtBox;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTxtBox;
	
	@FindBy(name = "reg_email__")
	private WebElement regMailorPh;
	
	@FindBy(name = "reg_passwd__")
	private WebElement regPass;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getLastNameTxtBox() {
		return lastNameTxtBox;
	}

	public WebElement getRegMailorPh() {
		return regMailorPh;
	}

	public WebElement getRegPass() {
		return regPass;
	}

}
