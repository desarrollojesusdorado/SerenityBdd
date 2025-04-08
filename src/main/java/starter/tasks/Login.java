package starter.tasks;

import io.cucumber.messages.types.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.models.DatosCredenciales;

import static starter.userinterface.LoginUserInterface.*;

public class Login implements Task {

    DatosCredenciales datosCredenciales;

    public Login(DatosCredenciales datosCredenciales) {
        this.datosCredenciales = datosCredenciales;
    }

    public static Login conMisCredenciales(DatosCredenciales datosCredenciales) {
        return Tasks.instrumented(Login.class, datosCredenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosCredenciales.getUsuario()).into(INPUT_USUARIO),
                Enter.theValue(datosCredenciales.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN));
    }
}
