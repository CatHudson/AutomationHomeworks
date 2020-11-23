package ru.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script01 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@class='input__control input__input mini-suggest__input']")).sendKeys("Какое сегодня число");
        driver.findElement(By.xpath("//button[@class='button mini-suggest__button button_theme_websearch button_size_ws-head i-bem button_js_inited']")).click();
        new WebDriverWait(driver, 5, 500).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
                "//div[@class='fact-answer fact-answer_size_l typo typo_type_bold fact__answer']"))));
        String date = driver.findElement(By.xpath("//div[@class='fact-answer fact-answer_size_l typo typo_type_bold fact__answer']")).getText();

        System.out.println("Сегодня у нас " + date + ". Прекрасный день, не правда ли?");
        Thread.sleep(2500);
        driver.quit();
    }
}
