package com.ParametrizedTest;

import com.BaseTest;
import com.ConfProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class TestMusic extends BaseTest {

    @Tag("Assertion author test")
    @Test
    public static void testAssertAuthors(String authorName, String authorSurname) {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        toolbarPage.clickMusicToolbar();
        music.clickMusicSearchBtn();
        String author = authorName + " " + authorSurname;
        music.setSearchAuthor(author);
        music.setSearchAuthor("\n");
        String foundAuthor = music.getAuthorName();
        Assert.assertEquals(author, foundAuthor);
    }

}
