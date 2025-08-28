package com.sofka.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDemoblazeInterfaces {

    public static Target BTN_ADD_CART = Target.the("Boton Agregar a carro ")
            .located(By.cssSelector(".btn.btn-success.btn-lg"));
}
