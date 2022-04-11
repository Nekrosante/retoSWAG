package reto.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import reto.saucedemo.userinterface.CarritoPage;

public class ElementosRestantes implements Question<Boolean> {
    private String texto;
    public ElementosRestantes(String texto){this.texto = texto;}
    public static ElementosRestantes toThe(String texto) {return new ElementosRestantes(texto);};

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        boolean comparacion = true;
        actor.should();

        if(texto.equals("remove-sauce-labs-fleece-jacket")){
            comparacion = CarritoPage.REMOVE.isVisibleFor(actor);
        }
        else if(texto.equals("remove-sauce-labs-onesie")) {
            comparacion = CarritoPage.REMOVE2.isVisibleFor(actor);
        }
        if (comparacion){
            result = false;
            System.out.println("Elemento NO eliminado");
        }else {
            result = true;
            System.out.println("Elemento eliminado adecuadamente");
        }
        return result;
    }
}
