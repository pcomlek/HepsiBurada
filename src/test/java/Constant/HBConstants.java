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
    public static final By PRDCTDETAILPAGE = By.cssSelector("ul.breadcrumbs"); // ürün detay sayfadaki breadcrumb
    public static final By SEPETEEKLE = By.xpath("//*[@id='addToCart']");// Sepete ekle butonu
    public static final By CLOSETAB = By.cssSelector("a.checkoutui-Modal-2iZXl"); // ürün sepete eklendikten sonra cıkan pop up ekranındaki X
    public static  final By DGRSATICIDANEKLE = By.cssSelector("button.add-to-basket button small"); // ürün detay sayfadaki diğer satıcıdan ekle butonu
    public static final By SEPETEGIT = By.cssSelector("buton[text='Sepete git']"); // ürünler eklendikten sonraki sepete git butonu.
    public static final By IKIURUN = By.cssSelector("span.basket_itemCount_54lDX[text='2']");

    public static final By KATEGORI = By.cssSelector("span.sf-MenuItems-5_2RN[text='Kitap, Müzik, Film, Hobi']");
    public static final By UKA = By.cssSelector("a.sf-ChildMenuItems-3R6bj item-2124[text='Uzaktan Kumandalı Araçlar']");
    public static final By SEPETDETAY = By.cssSelector("div.select_all_uruq9");
    public static final By SS = By.cssSelector("buton.buybox");
}
