package com.intern.example;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException{
//chrome drive location
        System.setProperty("webdriver.chromedriver","src//main//resources//chromedriver.exe");
        //new chrome
        ChromeOptions options=new ChromeOptions();
        //to close the block notificatio
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        //to maximize the window
        driver.manage().window().maximize();
        //the website link
        driver.get("https://wwwuatb.gdn-app.com/");

        //close the x button
        driver.findElement(By.xpath("//button[@class='ticker__close b-order-right']")).click();
        Thread.sleep(2000);
        //scroll down and up
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3790)");
        Thread.sleep(8000);
        jse.executeScript("window.scrollBy(0,-100)");
        driver.findElement(By.xpath("//img[@data-src='https://static-uatb.gdn-app.com/siva/asset/02_2023/ofstrore3.png']")).click();
        Thread.sleep(5000);
        driver.navigate().to("https://wwwuatb.gdn-app.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='ticker__close b-order-right']")).click();
        Thread.sleep(6000);
        driver.navigate().to("https://wwwuatb.gdn-app.com/cari/baju");
        driver.findElement(By.xpath("//button[@class='ticker__close b-order-right']")).click();
        //driver.findElement(By.xpath("//label[@for='quick-filter-price-recommendations-items-0']")).click();
        //driver.navigate().to("https://seller.blibli.com/mulai-berjualan");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"QUICK_blibli\"]/span"));
        jse.executeScript("window.scroll(0,1500)");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[@title='Comme des Garcons White & Red Camo Hearts T-Shirt Wanita']")).click();
        driver.navigate().to("https://wwwuatb.gdn-app.com/p/comme-des-garcons-white-red-camo-hearts-t-shirt-wanita/ps--TRO-60030-03400?ds=TRO-60030-03400-00001&source=SEARCH&sid=4ce108152865defe&metaData=Sa0jw%20XIAzQDKlCuUgCF1uxy0R6u3E0q00PoslzqIZEq0eVi2%20XGGsfh%2Fb0cSKPZtRIEKTkr11TWevS5TI%2FonkBqEG1QeWUxw3k5hxYyMhHP3NA3JdbpN50B5Cphr5ZDzPRGXyV9z0KcmqMwzHiUWvZN4RO6ZyRq12QsHZsYnus%3D&cnc=false&pickupPointCode=PP-3318699&pid1=TRO-60030-03400");
        Thread.sleep(6000);
        driver.close();
       /* WebElement element = driver.findElement(By.xpath("//div[@class='trending__title']"));

        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("argument[0].scrollTo()",element);*/

        }
    }
