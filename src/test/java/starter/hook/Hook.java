package starter.hook;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Managed
    WebDriver driver;
    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        Actor actor = Actor.named("jesus");
        OnStage.theActorCalled(String.valueOf(actor)).can(BrowseTheWeb.with(driver));
    }
}
