package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {
    public static final Target CHECKOUT = Target.the("botton para proseguir con la compra")
            .located(By.xpath("//button[contains(@id,'checkout')]"));
    public static final Target REMOVE = Target.the("botton para retirar un producto")
            .located(By.id("remove-sauce-labs-fleece-jacket"));
    public static final Target REMOVE2 = Target.the("botton para retirar un producto")
            .located(By.id("remove-sauce-labs-onesie"));
}
