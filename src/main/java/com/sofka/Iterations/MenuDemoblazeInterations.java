package com.sofka.Iterations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.interfaces.MenuDemoblazeInterfaces.LINKCART;
import static com.sofka.interfaces.MenuDemoblazeInterfaces.LINKHOME;
import static com.sofka.interfaces.ProductDemoblazeInterfaces.BTN_ADD_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MenuDemoblazeInterations {


    public static Performable LinkHome() {
        return Task.where("", WaitUntil.the(LINKHOME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINKHOME));

    }


    public static Performable LinkCart() {
        return Task.where("", WaitUntil.the(LINKCART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINKCART));

    }

}
