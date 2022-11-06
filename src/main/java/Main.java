import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedrivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://market.yandex.ru/");
        driver.manage().window().maximize();

        WebElement e1 = driver.findElement(By.xpath("//div[@data-zone-name='catalog']"));
        e1.click();

        Actions actions =new Actions(driver);

        WebElement e2 = driver.findElement(By.xpath("//*[@id='catalogPopup']/div/div/div/div/div/div/div[1]/div/ul/li[4]"));
        actions.moveToElement(e2).click().build().perform();

        WebElement e3 = driver.findElement(By.xpath("//a[@href='https://market.yandex.ru/catalog--smartfony-i-gadzhety/26893630']"));
        e3.click();

        WebElement e4 = driver.findElement(By.xpath(
                "//a[@href='https://market.yandex.ru/catalog--knopochnye-telefony/26893790/list?hid=91491&local-offers-first=0']"));
        e4.click();

        WebElement e5 = driver.findElement(By.xpath("//button[@class='_2AMPZ _1N_0H _1ghok']"));
        e5.click();

        WebElement e6 = driver.findElement(By.xpath("//h4[text()='Диагональ экрана']"));
        e6.click();

        WebElement e7 = driver.findElement(By.xpath("//label[@id='17547372']"));
        e7.click();

        WebElement e8 = driver.findElement(By.xpath("//input[@placeholder='2 644']"));
        e8.sendKeys("20000");

        WebElement e9 = driver.findElement(By.xpath("//label[@id='17496570']"));
        e9.click();
        WebElement e10 = driver.findElement(By.xpath("//label[@id='15884616']"));
        e10.click();
        WebElement e11 = driver.findElement(By.xpath("//label[@id='10706215']"));
        e11.click();
        WebElement e12 = driver.findElement(By.xpath("//label[@id='14311850']"));
        e12.click();
        WebElement e13 = driver.findElement(By.xpath("//label[@id='529167']"));
        e13.click();

        WebElement e14 = driver.findElement(By.xpath("//a[@class='_2qvOO _3qN-v _1Rc6L']"));
        e14.click();

        WebElement e15 = driver.findElement(By.xpath("//h3[@class='_2UHry _2vVOc']"));
        String name1 = e15.getAttribute("innerText");

        WebElement e16 = driver.findElement(By.xpath("//button[@class='_23p69 _3D8AA cia-cs']"));
        e16.click();

        WebElement e17 = driver.findElement(By.linkText(name1));
        e17.click();

        WebElement e18 = driver.findElement(By.xpath("//span[@data-auto='rating-badge-value'][1]"));
        String rating = e18.getAttribute("innerText");
        System.out.println(rating);

        driver.quit();


    }
}

