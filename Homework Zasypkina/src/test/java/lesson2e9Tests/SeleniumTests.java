package lesson2e9Tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTests {
    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void GoHomePage() {
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @BeforeEach
    public void GoPage() {
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка названия")
    public void titleEquals() {
        WebElement title1 = driver.findElement(By.xpath("//section/div/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", title1.getText());
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипов платежных систем")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    public void payIcon(String iconName) {
        WebElement icon = driver.findElement(By.xpath("//img[@alt='" + iconName + "']"));
        assertTrue(icon.isDisplayed());
    }

    //Проверить работу ссылки «Подробнее о сервисе»;
    @Test
    @DisplayName("Проверка ссылки 'Подробнее о сервисе'")
    public void clickLink() {
        WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        link.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUri = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUri, driver.getCurrentUrl());
    }

    //Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)
    @Test
    @DisplayName("Проверка кнопки 'Продолжить'")
    public void buttonNext() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("100");
        WebElement emailPerson = driver.findElement(By.id("connection-email"));
        emailPerson.click();
        emailPerson.sendKeys("person@mail.ru");
        WebElement buttonSubmit = driver.findElement(By.xpath("//form[@id='pay-connection']/button[text()='Продолжить']"));
        buttonSubmit.click();
        WebElement actualFrame = driver.findElement(By.xpath("//section[@class='payment-page payment-page_mobile payment-page_pays']"));
        assertTrue(actualFrame.isDisplayed());
    }
}
