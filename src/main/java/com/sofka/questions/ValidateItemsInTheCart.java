package com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateItemsInTheCart implements Question<Integer> {

    private final Target target;

    public ValidateItemsInTheCart(Target target) {
        this.target = target;
    }


    public static ValidateItemsInTheCart de(Target target) {
        return new ValidateItemsInTheCart(target);
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return target.resolveAllFor(actor).size();
    }
}