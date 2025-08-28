package com.sofka.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartDemoBlazeInterfaces {

    public static Target PRODUCTS_CART = Target.the("PRODUCTOS QUE ESTAN EN EL CARRITO").
            locatedBy(" //tr[@class=\"success\"]");

    public static Target BTN_PLACE_ORDER = Target.the("")
            .located(By.cssSelector(".btn.btn-success"));


    public static Target INPUT_NAME = Target.the("")
            .located(By.cssSelector("#name"));

    public static Target INPUT_COUNTRY = Target.the("")
            .located(By.cssSelector("#country"));

    public static Target INPUT_CITY = Target.the("")
            .located(By.cssSelector("#city"));

    public static Target INPUT_CART = Target.the("")
            .located(By.cssSelector("#card"));

    public static Target INPUT_MONTH = Target.the("")
            .located(By.cssSelector("#month"));

    public static Target INPUT_YEAR = Target.the("")
            .located(By.cssSelector("#year"));

    public static Target BTN_PURCHASE = Target.the("")
            .located(By.cssSelector("button[onclick='purchaseOrder()']"));

    public static Target MENSAJEEXITOSO = Target.the("")
            .located(By.xpath("//h2[normalize-space()='Thank you for your purchase!']"));




}
