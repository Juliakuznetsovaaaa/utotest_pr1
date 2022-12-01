package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
        public static WebDriver driver;
        public static LoginPage loginPage;
        public static profilePage profilePage;
        public static Music music;
        public static MusicTest musicTest;

        @Before
        public  void setup(){
            System.setProperty("webdriver.chrome.driver", "C:/DRIVERS/chromedriver.exe");
            driver=new ChromeDriver();
            loginPage = new LoginPage(driver);
            profilePage=new profilePage(driver);
            music=new Music(driver);
            musicTest= new MusicTest(driver);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
            loginPage.inputLogin(ConfProperties.getProperty("login"));
            loginPage.inputPasswd(ConfProperties.getProperty("password"));
            loginPage.clickLoginBtn();
        }
       @After
        public void teardown(){
            driver.quit();
        }
}
