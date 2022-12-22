package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@href, '/post')]")
    WebElement notionBtn;

    @FindBy(xpath = "//*[contains(@data-l,'t,userPage')]")
    WebElement userName;

    @FindBy(xpath = "//*[contains(@class, 'posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler')]")
    WebElement notionField;

    @FindBy(xpath = "//*[contains(@data-l, 't,button.submit')]")
    WebElement pushBtm;

    @FindBy(xpath = "//*[contains(@link-class, 'media-text_lnk')]")
    WebElement notionText;

    public String getUserName() {
        String name = userName.getText();
        return name;
    }

    @FindBy(xpath = ".//*[@class='feed_menu']")
    WebElement deleteIcon;

    @FindBy(xpath = "/html/body/div[40]/div/ul")
    WebElement menu;

    void clickNotionBtn() {
        notionBtn.click();
    }

    void sentNotionText(String text) {
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(notionField));
        notionField.sendKeys(text);
    }

    void clickPushBtm() {
        pushBtm.click();
    }

    public String getNotionText() {
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(notionText));
        String text = notionText.getText();
        return text;
    }

    public void deleteNotion() {
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(deleteIcon));
        action.moveToElement(deleteIcon).pause(1000).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(menu));
        driver.findElement(By.xpath("/html/body/div[40]/div/ul/li[1]/a")).click();
    }

}