package com.sofka.interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeDemoblazeInterfaz
{
    public static Target MENUPHONES = Target.the("LINK MENU PHONE").
            located(By.xpath("//a[@id=\"itemc\" and contains(text(),'Phones')]"));

    public static Target MENULAPTOPS = Target.the("LINK MENU PHONE").
            located(By.xpath("//a[@id=\"itemc\" and contains(text(),'Laptops')]"));

    public static Target MENUMONITORS = Target.the("LINK MENU PHONE").
            located(By.xpath("//a[@id=\"itemc\" and contains(text(),'Monitors')]"));

    public static Target PRIMERELEMENTO = Target.the("LINK MENU PHONE").
            located(By.xpath("(//img[@class=\"card-img-top img-fluid\"])[1]"));




}
