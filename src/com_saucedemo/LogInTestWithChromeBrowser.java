package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class LogInTestWithChromeBrowser {

    public static void main(String[] args) {

        //Set base URL
        String baseUrl = "https://www.saucedemo.com/";

        //Set up Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL in browser
        driver.get(baseUrl);

        //Maximise browser
        driver.manage().window().maximize();

        //Set Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get page title
        String getTitle = driver.getTitle();
        System.out.println("Title of page is: " + getTitle);

        //Get current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentURL);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);

        //Find username element
        WebElement username = driver.findElement(By.id("user-name"));
        //Type username in username field
        username.sendKeys("mukz123@gmail.com");

        //Find password element
        WebElement password = driver.findElement(By.id("password"));
        //Type password in password field
        password.sendKeys("Mogambo123");

        //close driver
        driver.close();

    }

}
