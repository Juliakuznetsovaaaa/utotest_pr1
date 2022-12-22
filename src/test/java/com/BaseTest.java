package com;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static final String BASE_URL = "https://ok.ru/";
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static MusicPage music;
    public static ToolbarPage toolbarPage;

    @Tag("upload driver and login test")
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/DRIVERS/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        music = new MusicPage(driver);
        toolbarPage = new ToolbarPage(driver);
    }

    @Tag("Driver close")
    @After
    public void teardown() {
        driver.quit();
    }
}


