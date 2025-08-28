package com.sofka.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import com.sofka.actor.Actor_name;

import static com.sofka.utils.ConfigProperties.*;
import static com.sofka.utils.Environment.*;


public class PreparedStage {

    @Before(order = 1)
    public void setEnviroment()
    {

        ENVIROMENT = getEnviroment();
        USUARIO = getUser();
        PASSWORD = getPassword();
        URL_WEB = getUrl();
        ENDPOINT = getEndpoint();
        APIKEY = getApiKey();
        System.out.println(ENVIROMENT+ USUARIO +PASSWORD +URL_WEB); //ecuador
    }

    @Before(order = 2)
    public void settheActorAbility()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(Actor_name.createActor().getName());
    }


}
