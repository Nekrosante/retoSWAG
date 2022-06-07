package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificacionPage extends PageObject {
    public static final Target TEXTO = Target.the("Mensaje de verificacion de compra")
            .located(By.xpath("//h2[(@class='complete-header')]"));
}
