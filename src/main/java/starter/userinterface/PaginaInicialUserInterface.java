package starter.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialUserInterface {
    public static final Target LABEL_SWAG_LABS = Target.the("").located(By.xpath("//div[contains(text(), 'Swag Labs')]"));
}
