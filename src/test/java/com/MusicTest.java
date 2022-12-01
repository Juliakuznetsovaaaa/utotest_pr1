package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MusicTest extends BaseTest{
    WebDriver driver;
    public MusicTest(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @Tag("Assertion author test")
    @Test
    public void assertAuthors(String authorName, String authorSurname){
        click(toolbarPage.musicToolbar);
        click(music.musicSearch);
        String author = authorName+" "+authorSurname;
        sendText(music.searchInput, author);
        click(music.searchAuthor);
        String foundAuthor = getText(music.foundAuthor);
        Assert.assertEquals(author,foundAuthor);
    }

}
