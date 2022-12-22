package com;

import org.junit.*;
import org.junit.jupiter.api.Tag;

public class TestNotion extends BaseTest {
    @Before
    public void login() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
    }

    @Tag("notion upload test and assertion")
    @Test
    public void testNotionAssertion() {
        profilePage.clickNotionBtn();
        profilePage.sentNotionText(ConfProperties.getProperty("notion"));
        profilePage.clickPushBtm();
        String notion = profilePage.getNotionText();
        Assert.assertEquals(ConfProperties.getProperty("notion"), notion);
    }

    @Tag("delete notion")
    @After
    public void delete() {
        profilePage.deleteNotion();
    }


}
