package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class itemsSwagPage extends PageObject {
    public static final Target expItem = Target.the("Add to card al articulo mas costoso")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target cheapItem = Target.the("Add to card al articulo mas economico")
            .located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final  Target iconocarrito = Target.the("botton de carrito de compras")
            .located(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
    public static final Target REMOVEP = Target.the("botton para retirar un producto")
            .located(By.id("remove-sauce-labs-fleece-jacket"));
    public static final Target bottonMenu = Target.the("botton menu")
            .located(By.id("react-burger-menu-btn"));
    public static final Target bottonAbout = Target.the("Opcion About del botton menu")
            .located(By.id("about_sidebar_link"));
    public static final Target bottonLogout = Target.the("Opcion logout del botton menu")
            .located(By.id("logout_sidebar_link"));
    public static final Target bottonResetAppState= Target.the("Opcion logout del botton menu")
            .located(By.id("reset_sidebar_link"));
}
