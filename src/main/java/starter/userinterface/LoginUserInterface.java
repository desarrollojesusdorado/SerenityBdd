package starter.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterface {
    public static final Target INPUT_USUARIO = Target.the("Input para ingresar usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar usuario")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Input para ingresar usuario")
            .located(By.id("login-button"));

}
