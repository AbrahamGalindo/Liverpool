Feature: miCuenta

  @miCuenta
  Scenario Outline: Validate the user name on mi cuenta module
    Given Admin open application
    And Allow Liverpool to register activity
    And Skip information about the app
    And Enter mi cuenta module
    When Select Iniciar Sesion option
    And Insert the user name "<userName>"
    And Insert the password "<password>"
    Then Click on Iniciar sesion button
    Then Valdate the name of the user "<name>"

    Examples:
      | userName                          | password      | name        |
      | icd.autom.pocket.test@yopmail.com | Liverpool2019 | Juan Picazo |
