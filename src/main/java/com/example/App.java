package com.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       

        WebDriver Codriver = new ChromeDriver();

        AppTest driver = new AppTest(Codriver);
        System.out.println( "Hello World!" );


        driver.get("https://www.google.com/");
        driver.takeCustomScreenshot();
        Thread.sleep(2000);



        driver.quit();

    }
}
