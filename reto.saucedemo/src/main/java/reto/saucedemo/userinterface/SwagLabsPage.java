package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SwagLabsPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Cuadro de texto para escribir el usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Cuadro de texto para escribir la clave")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("boton para ingresar")
            .located(By.xpath("//input[contains(@class,'submit-button btn_action')]"));
}
