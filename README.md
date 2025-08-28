# Automatización de Pruebas - Demoblaze con Serenity BDD

![Serenity BDD](https://img.shields.io/badge/Serenity-BDD-blue.svg)
![Cucumber](https://img.shields.io/badge/Cucumber-v7.0-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-11-orange.svg)

Proyecto de automatización de pruebas E2E para validar el flujo de compra en la aplicación web [Demoblaze](https://www.demoblaze.com/) utilizando **Serenity BDD** con Cucumber.

---

## 📋 Característica de Prueba

### Descripción General
Validación completa del proceso de compra de múltiples productos en la plataforma Demoblaze, incluyendo:
- Navegación y selección de productos
- Gestión del carrito de compras
- Proceso de checkout con datos de pago
- Confirmación de compra exitosa

### Escenario Automatizado
```gherkin
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
