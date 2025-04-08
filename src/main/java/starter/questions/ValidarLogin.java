package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Text;
import starter.userinterface.PaginaInicialUserInterface;

import java.beans.Visibility;

public class ValidarLogin implements Question<String> {
    public static ValidarLogin exitoso() {
        return new ValidarLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        //boolean esVisible = actor.asksFor(CurrentVisibility.of(PaginaInicialUserInterface.LABEL_SWAG_LABS));
        return actor.asksFor(Text.of(PaginaInicialUserInterface.LABEL_SWAG_LABS));
    }
}
