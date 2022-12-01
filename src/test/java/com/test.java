package com;
import org.junit.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


//import static com.sun.tools.javac.parser.Tokens.TokenKind.ARROW;

public class test extends BaseTest{
    //profilePage profilePage=new profilePage(driver);
   // private static final Object OPEN_MENU = profilePage.menu;
   // public static LoginPage loginPage;

    //public static profilePage profilePage;
    //public static notion notionMunipulation;
   // public static WebDriver driver;


    //public static Music music;


    /*@Before
    public  void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/DRIVERS/chromedriver.exe");
        driver=new ChromeDriver();
        //loginPage=new LoginPage(driver);
        //music=new Music(driver);
        profilePage = new profilePage(driver);
        //notionMunipulation=new notion(driver);


        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.get("https://ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
        //driver.manage().window().maximize();
    }*/
    @Test
    public void loginTest(){


        profilePage.clickNotionBtm();
        profilePage.inputZametka("hochy denyak");
        profilePage.setPushBtm();
        String notion = profilePage.getNotionText();
        System.out.println(notion);
        //Assert.assertEquals(ConfProperties.getProperty("notion"), notion);
        profilePage.deleteNotion();

    }


   //@AfterAll
    //public static void tearDown() {
       //}
       //driver.quit(); }



}
