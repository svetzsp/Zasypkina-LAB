package lesson2e10Tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumFrameTests {
    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void goHomePage() {
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @BeforeEach
    public void goPage() {
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    //   Проверить надписи в незаполненных полях каждого варианта оплаты услуг: услуги связи, домашний интернет, рассрочка, задолженность;
    @ParameterizedTest
    @DisplayName("Проверка надписей разделов оплаты")
    @ValueSource(strings = {"Домашний интернет", "Услуги связи", "Рассрочка", "Задолженность"})
    public void titleEqualsConnect(String s) {
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement option = driver.findElement(By.xpath("//p[text()='" + s + "']"));
        option.click();
        WebElement select = driver.findElement(By.xpath("//span[text()='" + s + "']"));
        assertEquals(s, select.getText());
    }

    @ParameterizedTest
    @DisplayName("Проверка надписей полей 'Услуги связи'")
    @CsvSource({
            "connection-phone, Номер телефона",
            "connection-sum, Сумма",
            "connection-email, E-mail для отправки чека",
    })
    public void titleConnection(String id, String placeholder) {
        WebElement title = driver.findElement(By.id(id));
        assertEquals(placeholder, title.getAttribute("placeholder"));
    }

    @ParameterizedTest
    @DisplayName("Проверка надписей полей 'Домашний интернет'")
    @CsvSource({
            "internet-phone, Номер абонента",
            "internet-sum, Сумма",
            "internet-email, E-mail для отправки чека"
    })
    public void titleHomeNet(String id, String placeholder) {
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement option = driver.findElement(By.xpath("//p[text()='Домашний интернет']"));
        option.click();
        WebElement title = driver.findElement(By.id(id));
        assertEquals(placeholder, title.getAttribute("placeholder"));
    }

    @ParameterizedTest
    @DisplayName("Проверка надписей полей 'Рассрочка'")
    @CsvSource({
            "c, Номер счета на 44",
            "instalment-sum, Сумма",
            "instalment-email, E-mail для отправки чека"
    })
    public void titlePayInstalments(String id, String placeholder) {
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement option = driver.findElement(By.xpath("//p[text()='Рассрочка']"));
        option.click();
        WebElement title = driver.findElement(By.id(id));
        assertEquals(placeholder, title.getAttribute("placeholder"));
    }

    @ParameterizedTest
    @DisplayName("Проверка надписей полей 'Задолженность'")
    @CsvSource({
            "score-arrears, Номер счета на 2073",
            "arrears-sum, Сумма",
            "arrears-email, E-mail для отправки чека"
    })
    public void titleArrears(String id, String placeholder) {
        WebElement button = driver.findElement(By.xpath("//button[@class='select__header']"));
        button.click();
        WebElement option = driver.findElement(By.xpath("//p[text()='Задолженность']"));
        option.click();
        WebElement title = driver.findElement(By.id(id));
        assertEquals(placeholder, title.getAttribute("placeholder"));
    }

//    Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы (номер для теста 297777777),
//    нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке),
//    номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты, наличие иконок платёжных систем.
    @ParameterizedTest
    @DisplayName("Проверка отображения атрибутов в 'Услугах связи'")
    @ValueSource(strings = {
            "//span[text()='100.00 BYN']",
            "//label[text()='Номер карты']",
            "//label[text()='Срок действия']",
            "//label[text()='CVC']",
            "//label[text()='Имя и фамилия на карте']",
            "//span[contains(text(), 'Оплатить  100.00 BYN')]",
            "//span[contains(text(),'Оплата: Услуги связи') and contains(text(),'Номер:375297777777')]",
            "//div[contains(@class, 'cards-brands__container')]"
    })
    public void fieldValue(String path) throws InterruptedException {
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
        WebElement field = driver.findElement(By.xpath(path));
        assertTrue(field.isDisplayed(), "Надпись << " + path + ">> не соответствует ожидаемому");
    }
}
