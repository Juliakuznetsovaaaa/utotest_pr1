package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notion {
    public WebDriver driver;
    public notion(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@href, '/post')]")
    private WebElement notionBtm;

    public void clickNotionBtm(){
        notionBtm.click();
    }

    //@FindBy(xpath = "//*[@id=\"hook_Block_pfnull\"]/div[2]/div[1]/div/div/div[2]")
    @FindBy(xpath = "//*[contains(@class, 'posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler')]")
    private WebElement zametkaField;

    @FindBy (xpath = "//*[contains(@data-l, 't,button.submit')]")
    WebElement pushBtm;

    @FindBy(xpath = "//*[contains(@class, 'media-text_cnt_tx emoji-tx textWrap')]")
    WebElement notionText;

    public void inputZametka(String passwd) {
        zametkaField.sendKeys(passwd); }

    public String getNotionText() {
        String notion = notionText.getText();
        return notion;
    }


    public void setPushBtm() {
        pushBtm.click();
    }




}
