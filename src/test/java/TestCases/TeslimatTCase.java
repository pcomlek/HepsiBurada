package TestCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static Constant.HBConstants.*;
import static java.lang.Thread.sleep;

public class TeslimatTCase {

    WebDriver driver ;


    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    @Given("go to Hepsiburada.com login page_1")
    public void go_to_hepsiburada_com_login_page_1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/DOĞA/IdeaProjects/HepsiBurada/src/main/resources/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-notification");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");


        System.out.println("HepsiBurada sitesi açıldı");


    }

    @When("click on login button_1")
    public void click_on_login_button_1 () {

        // Actions action = new Actions(driver);

        WebElement Giris_yap = findElement(HOME_GIRISYAP);
        Giris_yap.click();

        System.out.println("Anasayfadaki giriş yap butonu tıklandı.");

    }
    @When("click on login button_2")
    public void click_on_login_button_2 () {

        WebElement Giris = findElement(GIRISYAP);
        Giris.click();
        System.out.println("combodan giriş yap butonu tılandı.");

    }
    @When("user enters username_1")
    public void user_enters_username_1 () {
        WebElement Email = findElement(EPOSTA);
        if (Email != null) {
            Email.clear();
            Email.sendKeys("pbozkir07@gmail.com");
            System.out.println("Eposta girildi");
        } else
            Assert.isTrue(Email == null, "login ekranı açılamadı");

    }
    @When("click on login button_3")
    public void click_on_login_button_3 () {

        WebElement Giris_email = findElement(GIRIS);
        Giris_email.click();
        System.out.println("Giriş yap butonuna basıldı.");

    }
    @When("user enters password_1")
    public void user_enters_password_1 () throws InterruptedException {

        WebElement Sifre = findElement(SIFRE);
        if (Sifre != null) {
            Sifre.click();
            Thread.sleep(1000);
            Sifre.clear();
            Sifre.sendKeys("Abc12345-");
            System.out.println("Şifre girildi.");
        } else
            Assert.isTrue(Sifre == null, "Şifre ekranı açılmadı");

    }
    @When("click on login button_4")
    public void click_on_login_button_4 () throws InterruptedException {

        WebElement Giris_HB = findElement(GIRISBTN);
        Giris_HB.click();
        System.out.println("HB Ansayfası için giriş yap butonuna basıldı");
        Thread.sleep(6000);


    }
    @When("enter a product name on search bar_1")
    public void enter_a_product_name_on_search_bar_1 () {
        WebElement UrunAra = findElement(URUNARA);
        WebElement Sepetim = findElement(SEPETIM);
        if (Sepetim != null) {
            UrunAra.click();
            UrunAra.clear();
            UrunAra.sendKeys("Madeleb Krem");
            System.out.println("Search bara tıklandı, ürün girildi.");
        } else
            Assert.isTrue(Sepetim == null, "HB ansayfası açılamadı");

    }

    @When("click on search buton_1")
    public void click_on_search_buton_1 () throws InterruptedException {
        WebElement Ara = findElement(ARABTN);
        Ara.click();
        Assert.isTrue(SONUCTXT != null, "ürünler listelendi");
        System.out.println("Ürünler listelendi.");
        Thread.sleep(5000);


    }
    @When("select first product_1")
    public void select_first_product_1 () throws InterruptedException {
        WebElement ilkürün = driver.findElement(FIRSTPRDCT);
        ilkürün.click();
        Thread.sleep(1000);
        System.out.println("ilk ürün seçildi.");

    }
    @And("open a new tab_1")
    public void openANewTab_1() throws InterruptedException {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(5000);
        System.out.println("yeni sekmeye geçti.");
    }

    @Then("add to cart_1")
    public void add_to_cart_1 () throws InterruptedException {

       //sayfa scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        // ürün isim alanı bulunur.
        WebElement urunisim = findElement(PRDCTNAME);
        if(urunisim!= null) {
            WebElement sepeteekle = findElement(SEPETEEKLE);
            sepeteekle.click();
            sleep(5000);
            System.out.println("Ürün sepete eklendi.");
        }
        else
            Assert.isTrue(urunisim ==null ,"ürün detay sayfası açılamadı.");

    }
    @Then("close the order page_1")
    public void close_the_order_page_1 () throws InterruptedException {
        WebElement ekranıkapat = findElement(CLOSETAB);
        ekranıkapat.click();
        System.out.println("ekran kapatıldı.");
        Thread.sleep(5000);
    }
    @Then("go to cart_1")
    public void go_to_cart_1 () throws InterruptedException {
        WebElement SepeteGit = findElement(SEPETIM);
        SepeteGit.click();
        Thread.sleep(4000);
        WebElement SepetDetay = findElement(IKIURUN);
        Assert.isTrue(SepetDetay != null, " ürün sepete eklendi.");
        System.out.println(" ürünler eklendi.");
        Thread.sleep(5000);
    }

    @And("click the complete shop button")
    public void clickTheCompleteShopButton() throws InterruptedException {

        WebElement AlisverisiTamamla = findElement(ALSVRSTAMAMLA);
        AlisverisiTamamla.click();
        Thread.sleep(2000);

        //sayfa scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

        WebElement teslimat = findElement(STNDRTTSLMT);
        WebElement Kargo = findElement(KARGO);
        WebElement Tutar = findElement(TUTAR);

        Assert.isTrue(teslimat != null & Kargo != null & Tutar != null ,"Kargo ücreti sepet tutarına eklendi.");




    }
}
