package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;
import starter.models.DatosCredenciales;
import starter.questions.ValidarLogin;
import starter.tasks.Login;
import starter.userinterface.PaginaInicialUserInterface;

import java.util.List;

import static starter.utils.Constantes.URL_SAUCE_DEMO;

public class LoginStepDefinitions {
    @Dado("que {actor} requiere ingresar a la pagina de sauce demo")
    public void queJesusRequiereIngresarALaPaginaDeSauceDemo(Actor actor) {
        OnStage.theActorCalled(String.valueOf(actor)).wasAbleTo(Open.url(URL_SAUCE_DEMO));
    }
    @Cuando("se autentica con sus credenciales")
    public void seAutenticaConSusCredenciales(List<DatosCredenciales> credenciales) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.conMisCredenciales(credenciales.get(0)));
    }
    @Entonces("visualiza en la pagina el mensaje {string}")
    public void visualizaEnLaPaginaElMensajeSwagLabs(String mensajeEsperado) {
        //String mensajeEsperado = "Swag Labs";
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Text.of(PaginaInicialUserInterface.LABEL_SWAG_LABS), Matchers.equalTo(mensajeEsperado)));
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLogin.exitoso(), Matchers.equalTo(true)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLogin.exitoso(), Matchers.equalTo(mensajeEsperado)));
        Serenity.recordReportData().withTitle("Prueba").andContents(mensajeEsperado);
    }
}
