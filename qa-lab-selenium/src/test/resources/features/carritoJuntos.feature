Feature: Carrito de compras Juntoz

  @carrito
  Scenario Outline: Iniciar sesión para agregar un producto al carrito
    Given que ingreso a la pagina de inicio "https://juntoz.com/"
    When hago clic en el icono cuenta
    And elijo el boton iniciar session
    And ingreso usuario "<email>"
    And ingreso contraseña "<contraseña>"
    And doy clic en ingresar
    And espero que salga el pop up
    And doy clic en cerrar pop up
    And doy clic en envio gratis
    And doy clic en el primer producto que aparece
    And doy clic en añadir al carrito
    Then valido que salga el pop up de que se añadido el producto
    And doy clic en ir al carrito
    Examples:
      | email                  | contraseña |
      | deyaniradoza@gmail.com | deyanira98 |