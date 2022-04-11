package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumenPage extends PageObject {
    public static final Target FINALIZAR = Target.the("botton para finalizar la compra")
            .located(By.id("finish"));
}
