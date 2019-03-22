package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AppTest 
{

    //Variable declaration
    WebDriver driver = null;
    String appUrl = "";
    String expectedTitle="";
    String actualTitle="";

    //This function is for initial set up
    //New webdriver will be configured and initialized in this function
    @BeforeTest
    public void setUp(){
        //path to chromedriver on local system
        System.setProperty("webdriver.chrome.driver","/Users/avenger/Documents/chromedriver");

        //instantiating chromedriver
        driver = new ChromeDriver();

        //Setting AUT URL
        appUrl = "https://opensource-demo.orangehrmlive.com/";

        //expected title of the AUT
        expectedTitle="OrangeHRM";

    }

    //This is the test method
    @Test
    public void shouldAnswerWithTrue() {
        //navigate to the app
        driver.get(appUrl);

        //get the actual title of the driver
        actualTitle = driver.getTitle();

        assertEquals(expectedTitle,actualTitle);
    }

    //This function will destroy the webdriver
    @AfterTest
    public void tearDown(){
        driver.quit();

    }
}
