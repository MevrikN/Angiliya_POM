package org.example;


import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils{



    public void open_Browser() {

        //Chrome Browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver(); // import chrome web-Driver dependency (In 'POM' file)

        //Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Maximize The Window
        driver.manage().window().maximize();

        //Open WebPage
        driver.get("http://automationpractice.com/index.php?");

    }


    public void close_Browser(){
        driver.quit();
    }
}
