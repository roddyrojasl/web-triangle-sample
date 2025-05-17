package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import questions.ValidarTriangulo;
import task.Calcular;
import ui.HomePage;
import ui.TrianglePage;

import java.util.Calendar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;


public class TriangleSteps {


    @Managed
    WebDriver driver;
    private Actor actor;
    int ladoA;
    int ladoB;
    int ladoC;


    @Given("el usuario {string} abre la pagina  The Famous Triangle")
    public void usuarioAbrePagina(String nombre){

        actor =  OnStage.theActorCalled(nombre);
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(Open.browserOn().the(HomePage.class));
        actor.attemptsTo(
                Enter.theValue(nombre).into(TrianglePage.NOMBRE_TEXT)
        );
    }

    @When("ingresa los lados {string}, {string} y {string}")
    public void ingresLados(String a, String b, String c){
        ladoA = Integer.parseInt(a);
        ladoB = Integer.parseInt(b);
        ladoC = Integer.parseInt(c);
        actor.attemptsTo(
                Calcular.triangulo(a, b, c)
        );

    }

    @Then("valida que el triángulo es equilátero")
    public void validaEquilatero(){

        theActorInTheSpotlight().should(
                seeThat("Tipo de triángulo equilateral", ValidarTriangulo.tipo(ladoA,ladoB,ladoC), equalTo("equilateral"))
        );
    }

    @Then("valida que el triángulo es isósceles")
    public void validaIsósceles(){

        theActorInTheSpotlight().should(
                seeThat("Tipo de triángulo isosceles", ValidarTriangulo.tipo(ladoA,ladoB,ladoC), equalTo("isosceles"))
        );

    }

    @Then("valida que el triángulo es escaleno")
    public void validaEscaleno(){
        theActorInTheSpotlight().should(
                seeThat("Tipo de triángulo scalene", ValidarTriangulo.tipo(ladoA,ladoB,ladoC), equalTo("scalene"))
        );

    }

    @Then("valida que no es un triangulo")
    public void validaNoEsTrinagulo(){
        theActorInTheSpotlight().should(
                seeThat("Resultado a validar", ValidarTriangulo.tipo(ladoA,ladoB,ladoC), equalTo("Not a triangle"))

        );

    }


}

