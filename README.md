#  WEB TRIANGLE SAMPLES by Roddy Rojas
# Pruebas automatizadas para validar tipos de triangulos

Este proyecto automatiza la pagina https://www.developsense.com/triangle/triangle.htmlesta para validar los tipos de triangulos que se pueden formar a partir del ingreso de cifras que representan los lados del triangulo.

Se ha definido cuatro casos de prueba, los cuales validaran las cuatro escenarios que soporta la pagina, estos casos son:
 - Validar triángulo equilátero
 - Validar triángulo isósceles
 - Validar triángulo escaleno
 - Validar que no es un triángulo
  
Para el desarrollo del proyecto se ha utilizado **Serenity Framework**, el patron de diseño  **Screenplay**, y entre las herramientas para automatizar, se trabajo con herramientas como **Selenium**, **Maven**, **JUnit 4** y **Cucumber**.


---

### ▶️ ¿Cómo ejecutar las pruebas?

Se ejecuta desde la clase **TestRunner**

O

Por consola con el comando **'mvn install'**, teniendo en cuenta siempre, que se debe estar en la ruta del proyecto 

---
### 🧪 Ejemplo de una prueba


<pre>Feature: Tipos de triángulos

  Background:
    Given el usuario "Roddy" abre la pagina  The Famous Triangle

  Scenario: Validar triángulo equilátero
    When ingresa los lados "20", "20" y "20"
    Then valida que el triángulo es equilátero </pre>

**Descripcion.**

En **Given** se ingresa al actor que itneractuara en la prueba

En **When** se ingresa los valores que determiaran el tipo de triangulo

En **Then** se valida el tipo de triangulo que se dibujo en funcion de los valores ingresados, para efecto de este caso, es un triangulo Equilatero.

---
### 👨‍💻 Autor

Nombre: Roddy Orlando Rojas

Correo: roddyorlandorl@gmail.com

GitHub: https://github.com/roddyrojasl

