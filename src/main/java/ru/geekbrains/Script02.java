package ru.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='weather']")).click();

        String temp = driver.findElement(By.xpath("//div[@class='temp fact__temp fact__temp_size_s']/span[@class='temp__value']")).getText();

        Thread.sleep(5000);
        driver.quit();
        System.out.println("Сейчас в Петербурге температура " + temp);

    }
}
