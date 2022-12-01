package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

@RunWith(Parameterized.class)
public class AssertAuthorsTest extends BaseTest{
    private String authorName;
    private String authorSurname;

    private MusicTest musicTest;
    //Value Object
    public AssertAuthorsTest(String authorName,String authorSurname){
        this.authorName = authorName;
        this.authorSurname=authorSurname;
    }
    @Before
    public void init(){
        musicTest = new MusicTest(driver);
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {{"Thomas", "Mraz"},{"Taylor", "Swift"},{"Selena","Gomez"}});

    }
    @Tag("Authors test assertion")
    @Test
    public void testAssertion(){
        musicTest.assertAuthors(authorName, authorSurname);
    }

}