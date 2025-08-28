package com.sofka.tasks;

import com.sofka.models.DataPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static com.sofka.Iterations.CartDemoBlazeInterations.*;
import static com.sofka.Iterations.CartDemoBlazeInterations.clickBtnPlaceOrder;

public class CompletePurchaseTask implements Task {

    private final List<DataPerson> dataPeople;

    public CompletePurchaseTask(List<DataPerson> dataPeople) {
        this.dataPeople = dataPeople;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        for (DataPerson dataPerson : dataPeople)
        {

            actor.attemptsTo(clickBtnPlaceOrder());
            actor.attemptsTo(
                    ingresarNombre(dataPerson.getName()),
                    ingresarPais(dataPerson.getCountry()),
                    ingresarCiudad(dataPerson.getCity()),
                    ingresarTC(dataPerson.getCreditCard()),
                    ingresarMes(dataPerson.getMonth()),
                    ingresaraño(dataPerson.getYear()),
                    ClikPurchase()

            );
        }

    }
}
