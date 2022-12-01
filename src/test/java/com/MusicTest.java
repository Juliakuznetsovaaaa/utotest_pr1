package com;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MusicTest extends BaseTest{
    WebDriver driver;
    public MusicTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @Test
    public void assertAuthors(String authorName, String authorSurname){
        music.clickMusicBut();
        music.clickMusicSearch();
        String author = authorName+" "+authorSurname;
        music.inputAuthor(author +"\n");
        String foundAuthor = music.foundAuthorText();
        Assert.assertEquals(author,foundAuthor);
    }
}
