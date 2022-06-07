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
