package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TrianglePage {
    public static Target NOMBRE_TEXT = Target.the("Nombre").located(By.id("username"));
    public static Target LADO_A_TEXT = Target.the("Lado A").located(By.id("SideA"));
    public static Target LADO_B_TEXT = Target.the("Lado B").located(By.id("SideB"));
    public static Target LADO_C_TEXT = Target.the("Lado C").located(By.id("SideC"));
    public static Target CHECK_BUTTON = Target.the("Calcular").located(By.xpath("//button"));
    //public static Target TIPO_TRIANGULO = Target.the("Tipo del triángulo").located(By.id("output"));

}
