package com;

import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.Assert;

public class test extends BaseTest{
    @Tag("notion upload test and assertion")
    @Test
    public void loginTest(){
        click(profilePage.notionBtm);
        sendText(profilePage.notionField,ConfProperties.getProperty("notion") );
        click(profilePage.pushBtm);
        String notion = getText(profilePage.notionText);
        //System.out.println(notion);
        Assert.assertEquals(ConfProperties.getProperty("notion"), notion);
        profilePage.deleteNotion();
    }


   //@AfterAll
    //public static void tearDown() {
       //}
       //driver.quit(); }



}
