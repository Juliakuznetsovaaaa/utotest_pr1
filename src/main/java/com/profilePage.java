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

    //private static Object DELETE = deleteBut;
    //private static final Object FEED_MENU = deleteIcon;

    public profilePage(WebDriver driver) {
       PageFactory.initElements(driver, this);
        this.driver = driver;
   }

    @FindBy(xpath = "//*[contains(@href, '/post')]")
    private WebElement notionBtm;

    @FindBy(xpath = "//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a/div/text()")
    private WebElement userMenu;
    @FindBy(xpath = "//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a")
    private WebElement userName;

    //@FindBy(xpath = "//*[@id=\"hook_Block_pfnull\"]/div[2]/div[1]/div/div/div[2]")
    @FindBy(xpath = "//*[contains(@class, 'posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler')]")
    private WebElement zametkaField;

    @FindBy (xpath = "//*[contains(@data-l, 't,button.submit')]")
    WebElement pushBtm;

    @FindBy(xpath = "//*[contains(@class, 'media-text_cnt_tx emoji-tx textWrap')]")
    WebElement notionText;

    public void inputZametka(String passwd) {
        zametkaField.sendKeys(passwd); }

    public void clickNotionBtm(){
        notionBtm.click();
    }

    public void clickUserMenu(){
        userMenu.click();
    }

    public String getUserName() {
        String name = userName.getText();
        return name;
    }

    public String getNotionText() {
        String notion = notionText.getText();
        return notion;
    }
    public void setPushBtm() {
        pushBtm.click();
    }
    @FindBy(xpath = ".//*[@class='feed_menu']")
    WebElement deleteIcon;

    @FindBy (xpath = "/html/body/div[40]/div/ul")
    WebElement menu;

    @FindBy (xpath = ".//*[text()='Удалить заметку']")
    WebElement deleteBut;

    public void clickDeleteBut(){
        deleteBut.click();
    }

    public void deleteNotion(){
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(deleteIcon));
        action.moveToElement(deleteIcon).pause(1000).perform();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(menu));
        driver.findElement(By.xpath("/html/body/div[40]/div/ul/li[1]/a")).click();
    }

}