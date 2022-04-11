package reto.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.saucedemo.userinterface.VerificacionPage;

public class MensajeDeCompra implements Question<Boolean> {
    private String mensaje;

    public MensajeDeCompra(String mensaje){
        this.mensaje = mensaje;
    }
    public static MensajeDeCompra toThe(String mensaje) {
        return new MensajeDeCompra(mensaje);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TEXTOVER= actor.asksFor(Text.of(VerificacionPage.TEXTO).asString());

        if (mensaje.equals(TEXTOVER)){
            result = true;
            System.out.println("Mensaje de compra exitoso");
        }else {result = false;System.out.println("Mensaje de compra fallido");}
        return result;
    }
}
