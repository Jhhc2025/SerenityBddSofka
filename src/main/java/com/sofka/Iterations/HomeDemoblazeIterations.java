package com.sofka.Iterations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.interfaces.HomeDemoblazeInterfaz.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeDemoblazeIterations {

    public static Performable CliKMenuPhones() {
        return Task.where("", WaitUntil.the(MENUPHONES, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MENUPHONES));

    }

    public static Performable CliKMenuLaptops() {
        return Task.where("", WaitUntil.the(MENULAPTOPS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MENULAPTOPS));

    }

    public static Performable CliKMonitors() {
        return Task.where("", WaitUntil.the(MENUMONITORS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MENUMONITORS));

    }

    public static Performable CliKPrimerElemto() {
        return Task.where("", WaitUntil.the(PRIMERELEMENTO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PRIMERELEMENTO));

    }

}
