package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MusicPage {
    public WebDriver driver;

    public MusicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@data-tsid,'search_input')]")
    WebElement musicSearch;

    @FindBy(xpath = "//*[contains(@data-tsid,'best_match_artist_name')]")
    WebElement foundAuthor;

    @FindBy(xpath = "//*[contains(@data-tsid,'inner_input')]")
    WebElement searchInput;

    public void clickMusicSearchBtn() {
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(musicSearch));
        musicSearch.click();
    }

    public void setSearchAuthor(String author) {
        searchInput.sendKeys(author);
    }

    public String getAuthorName() {
        Actions action = new Actions(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(foundAuthor));
        String name = foundAuthor.getText();
        return name;
    }
}
