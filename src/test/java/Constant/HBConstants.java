package Constant;

import org.openqa.selenium.By;

public class HBConstants {
    public static final By HOME_GIRISYAP = By.id("myAccount"); // HB anasayfa giriş yap alanı.
    public static final By GIRISYAP = By.id("login"); // comboboxta gelen giriş yap butonu
    public static final By EPOSTA = By.id("txtUserName"); // email ve ya cep tel no alanı
    public static final By GIRIS = By.id("btnLogin"); // email- giriş yap butonu
    public static final By SIFRE = By.id("txtPassword"); // şifre alanı
    public static final By GIRISBTN = By.id("btnEmailSelect"); // passwd - giriş yap butonu
    public static final By SEPETIM = By.id("shoppingCart"); // sepetim butonu
    public static final By URUNARA = By.cssSelector("input.desktopOldAutosuggestTheme-input[placeholder='Ürün, kategori veya marka ara']"); // search bar
    public static final By ARABTN = By.cssSelector("div.SearchBoxOld-buttonContainer"); // arabutonu
    public static final By SONUCTXT = By.className("searchResultSummaryBar-summary"); // arama sonucu text alanı
    public static final By FIRSTPRDCT = By.cssSelector("li.productListContent-item[id ='i0']");//listedeki ilk ürün
    public static final By PRDCTDETAILPAGE = By.cssSelector("ul.breadcrumbs");// ürün detay sayfadaki breadcrumb
    public static final By PRDCTNAME = By.id("product-name");
    public static final By SEPETEEKLE = By.id("addToCart");// Sepete ekle butonu
    public static final By CLOSETAB = By.cssSelector("a.checkoutui-Modal-2iZXl"); // ürün sepete eklendikten sonra cıkan pop up ekranındaki X
    public static  final By DGRSATICIDANEKLE = By.xpath("//*[@class='add-to-basket button small'][1]"); // ürün detay sayfadaki diğer satıcıdan ekle butonu
    public static final By SEPETEGIT1 = By.xpath("//button[text()='Sepete git']"); // ürünler eklendikten sonraki sepete git butonu.
    public static final By IKIURUN = By.xpath("//*[@id='basket-item-count'][text()='2']");// sepete detay sayfadaki 'x ürün' metni

    //case 2
    public static final By KATEGORI = By.xpath("//span[text()='Kitap, Müzik, Film, Hobi']"); //kitap kategori
    public static final By UKA = By.xpath("//a[@href='https://www.hepsiburada.com/uzaktan-kumandali-arabalar-c-14001244']"); //uzaktan kumandalı araçlar
    public static final By SEPETDETAY = By.xpath("//*[@id='basket-item-count'][text()='1']"); // sepete detay sayfadaki 'x ürün' metni
    public static final By SEPETEGIT2 = By.xpath("//a[@href = 'https://checkout.hepsiburada.com/']"); //ürün eklendikten sonra sağ üstte cıkan pop up

}
