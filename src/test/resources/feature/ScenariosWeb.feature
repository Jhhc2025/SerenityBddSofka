# language: es

@ui
Característica: Pruebas de compra en la pagina Demoblaze

  @Compra @smoke
  Esquema del escenario:  Validar la compra de Varios articulos en la pagina de Demoblaze
    Dado que estoy en la página principal
    Cuando agrego los productos al Carro de compras
    Entonces confirmo que los productos seleccionados esten en el
    Y Confirmo la orden  de compra con los siguietes datos
      | Name   | Country   | City   | CreditCard   | Month   | Year   |
      | <Name> | <Country> | <City> | <CreditCard> | <Month> | <Year> |
    Entonces Valido que la compra ha sido exitosa con el Mensaje "Thank you for your purchase!"
    Ejemplos:
      | Name                   | Country  | City   | CreditCard          | Month  | Year |
      | Jorge Humberto Huertas | Colombia | Bogota | 7546 9863 9521 7896 | Agosto | 2025 |

