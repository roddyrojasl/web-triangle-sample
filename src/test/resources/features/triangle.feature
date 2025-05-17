Feature: Tipos de triángulos
  Como usuario web
  Quiero usar la pagina The Famous Triangle
  Para validar los tipos de trinagulos

  Background:
    Given el usuario "Roddy" abre la pagina  The Famous Triangle

  Scenario: Validar triángulo equilátero
    When ingresa los lados "20", "20" y "20"
    Then valida que el triángulo es equilátero

  Scenario: Validar triángulo isósceles
    When ingresa los lados "30", "3" y "30"
    Then valida que el triángulo es isósceles

  Scenario: Validar triángulo escaleno
    When ingresa los lados "18", "15" y "17"
    Then valida que el triángulo es escaleno

  Scenario: Validar que no es un triángulo
    When ingresa los lados "40", "10" y "40"
    Then valida que no es un triangulo
