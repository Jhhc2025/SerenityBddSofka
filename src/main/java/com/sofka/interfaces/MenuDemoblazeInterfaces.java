package com.sofka.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuDemoblazeInterfaces {

    public static Target LINKHOME = Target.the("LINK MENU PHONE").
            located(By.cssSelector("li[class='nav-item active'] a[class='nav-link']"));


    public static Target LINKCART = Target.the("LINK MENU PHONE").
            located(By.cssSelector("#cartur"));


}
