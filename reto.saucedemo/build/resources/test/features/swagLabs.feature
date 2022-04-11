@stories
Feature: Compras en swagLabs
  como usuario, queiro agregar y eliminar elementos del carrito productos para crear un pedido de compra
  @scenario1
  Scenario Outline: compra de dos productos en swagLabs
    Given  el acceso con credenciales validas <user> y <pasword>
    When agregue al carrito de compras
    And ir al carrito de compras
    And finalizo la compra
    Then el usuario espera el mensaje THANK YOU FOR YOUR ORDER
    Examples:
      | user        | pasword     |
      |standard_user|secret_sauce |

  @scenario2
  Scenario Outline: Agregar (2) y eliminar (1) productos desde el carrito del compras
    Given  el acceso con credenciales validas <user> y <pasword>
    When agregue al carrito de compras
    And ir al carrito de compras
    And eliminar un elemento del carrito de compras
    Then Verifico los elementos del carrito <Elemento>
    And finalizo la compra
    Then el usuario espera el mensaje THANK YOU FOR YOUR ORDER
    Examples:
      | user        | pasword     | Elemento                      |
      |standard_user|secret_sauce |remove-sauce-labs-fleece-jacket|

  @scenario3
  Scenario Outline: Agregar (2) y eliminar (1) productos desde la pagina principal
    Given  el acceso con credenciales validas <user> y <pasword>
    When agregue al carrito de compras
    And eliminar un elemento de la pagina principal
    And ir al carrito de compras
    Then Verifico los elementos del carrito <Elemento>
    And finalizo la compra
    Then el usuario espera el mensaje THANK YOU FOR YOUR ORDER
    Examples:
      | user        | pasword     | Elemento                       |
      |standard_user|secret_sauce |remove-sauce-labs-fleece-jacket|

  @scenario4
  Scenario Outline: compra con el carrito vacio
    Given  el acceso con credenciales validas <user> y <pasword>
    When ir al carrito de compras
    And finalizo la compra
    Then el usuario espera el mensaje COMPRA NO EXITOSA
    Examples:
      | user        | pasword     |
      |standard_user|secret_sauce |

  @scenario5
  Scenario Outline: revison de la pagina de Swaglabs
    Given  el acceso con credenciales validas <user> y <pasword>
    When Accedo al boton de menu
    And Accedo a opcion about
    Then el usuario puede ver a la pagina indicada https://saucelabs.com/
    Examples:
      | user        | pasword     |
      |standard_user|secret_sauce |

  @scenario6
  Scenario Outline: cerrar Sesion
    Given  el acceso con credenciales validas <user> y <pasword>
    When Accedo al boton de menu
    And Accedo a opcion logout
    Then el usuario puede ver a la pagina indicada https://www.saucedemo.com/
    Examples:
      | user        | pasword     |
      |standard_user|secret_sauce |
  @scenario7
  Scenario Outline: resetear el carrito de compras
    Given  el acceso con credenciales validas <user> y <pasword>
    And agregue al carrito de compras
    When Accedo al boton de menu
    And Accedes a opcion reset app state
    And ir al carrito de compras
    Then Verifico los elementos del carrito remove-sauce-labs-fleece-jacket
    Then Verifico los elementos del carrito remove-sauce-labs-onesie
Examples:
      | user        | pasword     |
      |standard_user|secret_sauce |
