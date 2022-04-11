package reto.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class VerificarURL implements Question<Boolean> {

    private String URLver;
    public VerificarURL(String URLver){
        this.URLver = URLver;
    }
    public static VerificarURL toThe(String URLver) {
        return new VerificarURL(URLver);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        WebDriver driver = getDriver();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        if (currentUrl.equals(URLver)){
            result = true;
            System.out.println("Enlace Exitoso");
        }else {result = false;System.out.println("Enlace incorrecto");}
        return result;
    }
}
