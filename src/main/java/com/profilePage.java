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



public class profilePage{
   public WebDriver driver;

    public profilePage(WebDriver driver)  {
       PageFactory.initElements(driver, this);
        this.driver = driver;
   }

    @FindBy(xpath = "//*[contains(@href, '/post')]")
    WebElement notionBtm;

    @FindBy(xpath = "//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a")
    private WebElement userName;

    @FindBy(xpath = "//*[contains(@class, 'posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler')]")
     WebElement notionField;

    @FindBy (xpath = "//*[contains(@data-l, 't,button.submit')]")
    WebElement pushBtm;

    @FindBy(xpath = "/html/body/div[10]/div[5]/div[5]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div/div[3]/div/div/div/div[3]/div/div[4]/div[1]/div[1]/div[1]/div/div[3]/div[1]/div/div/div")
    WebElement notionText;

    public String getUserName() {
        String name = userName.getText();
        return name;
    }

    @FindBy(xpath = ".//*[@class='feed_menu']")
    WebElement deleteIcon;

    @FindBy (xpath = "/html/body/div[40]/div/ul")
    WebElement menu;

    public void deleteNotion(){
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(deleteIcon));
        action.moveToElement(deleteIcon).pause(1000).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(menu));
        driver.findElement(By.xpath("/html/body/div[40]/div/ul/li[1]/a")).click();
    }

}