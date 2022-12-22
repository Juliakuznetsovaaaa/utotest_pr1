package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolbarPage {
    public WebDriver driver;

    public ToolbarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@aria-label, 'Музыка')]")
    WebElement musicToolbar;

    public void clickMusicToolbar() {
        musicToolbar.click();
    }
}
