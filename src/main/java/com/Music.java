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
    @FindBy (xpath = "//*[@id=\"music_toolbar_button\"]")
    WebElement musicBut;
     public void clickMusicBut() {
         musicBut.click();
     }
    @FindBy (xpath = "//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input")
    WebElement musicSearch;
     @FindBy(xpath = "//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input/input")
     WebElement inputMusicSearch;
    public void clickMusicSearch() {
        musicSearch.click();
    }
    public void inputAuthor(String author) {
        inputMusicSearch.sendKeys(author);
    }
    @FindBy (xpath = "//*[@id=\"music_layer\"]/main/div/div[2]/div/search-page/search-best-match/wm-page-header/slot/div/span/a")
    WebElement foundAuthor;

    public String foundAuthorText() {
        String author=foundAuthor.getText();
        return author;
    }



}
