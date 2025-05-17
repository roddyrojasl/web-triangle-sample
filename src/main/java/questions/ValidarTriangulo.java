package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.TrianglePage;


public class ValidarTriangulo implements Question<String>{

    private final int ladoA;
    private final int ladoB;
    private final int ladoC;

    public ValidarTriangulo(int a, int b, int c) {
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }

    public static ValidarTriangulo tipo(int a, int b, int c) {
        return new ValidarTriangulo(a, b, c);
    }

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        return (String) js.executeScript(
                "let t = new Triangle(arguments[0], arguments[1], arguments[2]);" +
                        "determine_type(t);" +
                        "return t.desc;",
                ladoA, ladoB, ladoC
        );
    }
}