package com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Music{
    public WebDriver driver;



    public Music(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input")
    WebElement musicSearch;

    @FindBy (xpath = "//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input/slot/wm-icon")
    WebElement searchAuthor;

    @FindBy (xpath = "//*[@id=\"music_layer\"]/main/div/div[2]/div/search-page/search-best-match/wm-page-header/slot/div/span/a")
    WebElement foundAuthor;

    @FindBy(xpath = "//*[contains(@data-tsid,'inner_input')]")
    WebElement searchInput;



}
