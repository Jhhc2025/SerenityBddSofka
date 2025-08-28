package com.sofka.Iterations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.interfaces.ProductDemoblazeInterfaces.BTN_ADD_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductDemoblazeIterations {


    public static Performable AddCart() {
        return Task.where("", WaitUntil.the(BTN_ADD_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_ADD_CART));

    }

}
