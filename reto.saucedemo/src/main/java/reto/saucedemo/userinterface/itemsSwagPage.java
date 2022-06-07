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
}
