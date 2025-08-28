package com.sofka.tasks;

import com.sofka.Iterations.HomeDemoblazeIterations;
import com.sofka.Iterations.MenuDemoblazeInterations;
import com.sofka.Iterations.ProductDemoblazeIterations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

public class AddProductsToCartTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(HomeDemoblazeIterations.CliKMenuPhones(),
                HomeDemoblazeIterations.CliKPrimerElemto());
        actor.attemptsTo(ProductDemoblazeIterations.AddCart());
        actor.attemptsTo(Switch.toAlert().andAccept());
        actor.attemptsTo(MenuDemoblazeInterations.LinkHome());


        actor.attemptsTo(HomeDemoblazeIterations.CliKMenuLaptops(),
                HomeDemoblazeIterations.CliKPrimerElemto());
        actor.attemptsTo(ProductDemoblazeIterations.AddCart());
        actor.attemptsTo(Switch.toAlert().andAccept());
        actor.attemptsTo(MenuDemoblazeInterations.LinkHome());



        actor.attemptsTo(HomeDemoblazeIterations.CliKMonitors(),
                HomeDemoblazeIterations.CliKPrimerElemto());
        actor.attemptsTo(ProductDemoblazeIterations.AddCart());
        actor.attemptsTo(Switch.toAlert().andAccept());
        actor.attemptsTo(MenuDemoblazeInterations.LinkHome());
    }
}
