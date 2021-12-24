package TestCases;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static Constant.HBConstants.*;

public class HBTestCase2 {

    WebDriver driver;
    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    Actions action = new Actions(driver);

    @Given("Go to Hepsiburada.com homepage")
    public void go_to_hepsiburada_com_homepage() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/DOĞA/IdeaProjects/HepsiBurada/src/main/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");

        Actions action = new Actions(driver);

        System.out.println("HepsiBurada sitesi açıldı");

    }
    @When("click to music, film category")
    public void click_to_music_film_category() throws InterruptedException {

        Thread.sleep(5000);
        WebElement MuzikKategori = findElement(KATEGORI);
        action.moveToElement(MuzikKategori).perform();
        System.out.println("kategori sayfası açıldı.");

    }
    @When("click to uzaktan kumandalı araçlar")
    public void click_to_uzaktan_kumandalı_araçlar() {
        WebElement Drone = findElement(UKA);
        Drone.click();
        System.out.println("uzaktan kumandalı araçlara tıklandı.");


    }
    @When("click first product")
    public void click_firs_product() throws InterruptedException {
        WebElement ilkürün = findElement(FIRSTPRDCT);
        ilkürün.click();
        Thread.sleep(5000);

    }
    @Then("add to cart the product")
    public void add_to_cart_the_product() throws InterruptedException {
        WebElement sepeteekle = driver.findElement(SEPETEEKLE);
        sepeteekle.click();
        Thread.sleep(5000);
        System.out.println("Ürün sepete eklendi.");

        WebElement SepeteGit = findElement(SEPETEGIT);
        SepeteGit.click();
        Assert.isTrue(SEPETDETAY == null, "Sepetim sayfası açılamadı.");



    }
}
