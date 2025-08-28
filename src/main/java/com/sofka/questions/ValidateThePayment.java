package com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.interfaces.CartDemoBlazeInterfaces.MENSAJEEXITOSO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateThePayment implements Question<String> {



    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJEEXITOSO, isVisible()).forNoMoreThan(10).seconds());
        return Text.of(MENSAJEEXITOSO).answeredBy(actor);

    }
}
