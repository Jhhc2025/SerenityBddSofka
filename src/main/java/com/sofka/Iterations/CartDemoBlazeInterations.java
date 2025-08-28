package com.sofka.Iterations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofka.interfaces.CartDemoBlazeInterfaces.*;

public class CartDemoBlazeInterations {


    public static Performable clickBtnPlaceOrder() {
        return Click.on(BTN_PLACE_ORDER);
    }

    public static Performable ingresarNombre(String name) {
        return Enter.theValue(name).into(INPUT_NAME);
    }


    public static Performable ingresarPais(String pais) {
        return Enter.theValue(pais).into(INPUT_COUNTRY);
    }

    public static Performable ingresarCiudad(String ciudad) {
        return Enter.theValue(ciudad).into(INPUT_CITY);
    }

    public static Performable ingresarTC(String tc) {
        return Enter.theValue(tc).into(INPUT_CART);
    }

    public static Performable ingresarMes(String mes) {
        return Enter.theValue(mes).into(INPUT_MONTH);
    }

    public static Performable ingresaraño(String año) {
        return Enter.theValue(año).into(INPUT_YEAR);
    }

    public static Performable ClikPurchase() {
        return Click.on(BTN_PURCHASE);
    }
}
