package TestCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static Constant.HBConstants.*;
import static java.lang.Thread.sleep;

public class StepDefinition1 {

    WebDriver driver ;


    public WebElement findElement(By by){
        return driver.findElement(by);
    }


        @Given("go to Hepsiburada.com login page")
        public void go_to_hepsiburada_com_login_page () throws InterruptedException {
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

        @When("click on login button1")
        public void click_on_login_button1 () {

            // Actions action = new Actions(driver);

            WebElement Giris_yap = findElement(HOME_GIRISYAP);
            Giris_yap.click();

            System.out.println("Anasayfadaki giriş yap butonu tıklandı.");

        }
        @When("click on login button2")
        public void click_on_login_button2 () {

            WebElement Giris = findElement(GIRISYAP);
            Giris.click();
            System.out.println("combodan giriş yap butonu tılandı.");

        }
        @When("user enters username")
        public void user_enters_username () {
            WebElement Email = findElement(EPOSTA);
            if (Email != null) {
                Email.clear();
                Email.sendKeys("pbozkir07@gmail.com");
                System.out.println("Eposta girildi");
            } else
                Assert.isTrue(Email == null, "login ekranı açılamadı");

        }
        @When("click on login button3")
        public void click_on_login_button3 () {

            WebElement Giris_email = findElement(GIRIS);
            Giris_email.click();
            System.out.println("Giriş yap butonuna basıldı.");

        }
        @When("user enters password")
        public void user_enters_password () throws InterruptedException {

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
        @When("click on login button4")
        public void click_on_login_button4 () throws InterruptedException {

            WebElement Giris_HB = findElement(GIRISBTN);
            Giris_HB.click();
            System.out.println("HB Ansayfası için giriş yap butonuna basıldı");
            Thread.sleep(6000);


        }
        @When("enter a product name on search bar")
        public void enter_a_product_name_on_search_bar () {
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

        @When("click on search buton")
        public void click_on_search_buton () throws InterruptedException {
            WebElement Ara = findElement(ARABTN);
            Ara.click();
            Assert.isTrue(SONUCTXT != null, "ürünler listelendi");
            System.out.println("Ürünler listelendi.");
            Thread.sleep(5000);


        }
        @When("select first product")
        public void select_first_product () throws InterruptedException {
            WebElement ilkürün = driver.findElement(FIRSTPRDCT);
            ilkürün.click();
            Thread.sleep(1000);
            System.out.println("ilk ürün seçildi.");

        }
        @And("open a new tab")
        public void openANewTab() throws InterruptedException {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            Thread.sleep(5000);
            System.out.println("yeni sekmeye geçti.");
        }

        @Then("add to cart")
        public void add_to_cart () throws InterruptedException {


            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)");
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


    @Then("close the order page")
        public void close_the_order_page () throws InterruptedException {
            WebElement ekranıkapat = findElement(CLOSETAB);
            ekranıkapat.click();
            System.out.println("ekran kapatıldı.");
            Thread.sleep(5000);

        }
        @Then("add to cart the product from different seller")
        public void add_to_cart_the_product_from_different_seller () throws InterruptedException {
            WebElement digersaticidanekle = findElement(DGRSATICIDANEKLE);
            digersaticidanekle.click();
            System.out.println("ürün diğer satıcıdan eklendi.");
            Thread.sleep(5000);
        }
        @Then("go to cart")
        public void go_to_cart () throws InterruptedException {
            WebElement SepeteGit = findElement(SEPETEGIT1);
            SepeteGit.click();
            Thread.sleep(3000);
            WebElement IkiUrun = findElement(IKIURUN);
            Assert.isTrue(IkiUrun != null, "iki farklı satıcıdan ürünler sepete eklendi.");
            System.out.println("Sepete 2 farklı satıcıdan ürünler eklendi.");
            Thread.sleep(5000);



        }



}
