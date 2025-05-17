package task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.devtools.v114.domsnapshot.model.StringIndex;
import ui.TrianglePage;

public class Calcular implements Interaction {

    private String lado_a;
    private String lado_b;
    private String lado_c;

    public Calcular(String lado_a, String lado_b, String lado_c){

        this.lado_a = lado_a;
        this.lado_b = lado_b;
        this.lado_c = lado_c;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(lado_a).into(TrianglePage.LADO_A_TEXT),
                Enter.theValue(lado_b).into(TrianglePage.LADO_B_TEXT),
                Enter.theValue(lado_c).into(TrianglePage.LADO_C_TEXT),
                Click.on(TrianglePage.CHECK_BUTTON)
        );
    }

    public static Performable triangulo(String a, String b, String c) {
        return Instrumented.instanceOf(Calcular.class).withProperties(a, b, c);
    }


}
