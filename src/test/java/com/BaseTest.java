package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
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
        public static ToolbarPage toolbarPage;

        @Tag("upload driver and login test")
        @Before
        public  void setup(){
            System.setProperty("webdriver.chrome.driver", "C:/DRIVERS/chromedriver.exe");
            driver=new ChromeDriver();
            loginPage = new LoginPage(driver);
            profilePage=new profilePage(driver);
            music=new Music(driver);
            musicTest= new MusicTest(driver);
            toolbarPage=new ToolbarPage(driver);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");
            loginPage.inputLogin(ConfProperties.getProperty("login"));
            loginPage.inputPasswd(ConfProperties.getProperty("password"));
            click(loginPage.loginBtn);
        }

        /*@Tag("Driver close")
        @After
        public void teardown(){
            driver.quit();
        }*/

        @Tag("Click method")
        public void click(WebElement locator){
            locator.click();
        }

        @Tag("Upload text method")
        public void sendText(WebElement locator, String author) {
            locator.sendKeys(author);
        }

        @Tag("Get text method")
        public String getText(WebElement locator){
            return locator.getText();
        }

}
