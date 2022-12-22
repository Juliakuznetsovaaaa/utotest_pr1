package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'field_email')]")
    WebElement loginField;

    @FindBy(xpath = "//*[contains(@value, 'Войти в Одноклассники')]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[contains(@id, 'field_password')]")
    WebElement passwordField;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String passwd) {

        passwordField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

}