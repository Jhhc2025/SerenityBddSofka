package com.sofka.stepDefinitios;

import com.sofka.actor.Actor_name;
import com.sofka.models.DataPerson;
import com.sofka.questions.ValidateItemsInTheCart;
import com.sofka.questions.ValidateThePayment;
import com.sofka.tasks.AddProductsToCartTask;
import com.sofka.tasks.CompletePurchaseTask;
import com.sofka.tasks.OpenBrowser;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static com.sofka.Iterations.MenuDemoblazeInterations.LinkCart;
import static com.sofka.interfaces.CartDemoBlazeInterfaces.PRODUCTS_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class MyStepdefs {


    @Dado("que estoy en la página principal")
    public void queEstoyEnLaPáginaPrincipal() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(Actor_name.createActor().getName()).wasAbleTo(OpenBrowser.openBrowser());
    }

    @Cuando("agrego los productos al Carro de compras")
    public void agregoLosProductosAlCarroDeCompras() {
        theActorInTheSpotlight().attemptsTo(new AddProductsToCartTask());
    }

    @Entonces("confirmo que los productos seleccionados esten en el")
    public void confirmoQueLosProductosSeleccionadosEstenEnEl() {
        theActorInTheSpotlight().attemptsTo(LinkCart());
        theActorInTheSpotlight().should(
                seeThat(ValidateItemsInTheCart.de(PRODUCTS_CART),
                        equalTo(3))
        );
    }


    @Y("Confirmo la orden  de compra con los siguietes datos")
    public void confirmoLaOrdenDeCompraConLosSiguietesDatos(List<DataPerson> dataPeople) {
        theActorInTheSpotlight().attemptsTo(new CompletePurchaseTask(dataPeople));
    }

    @Entonces("Valido que la compra ha sido exitosa con el Mensaje {string}")
    public void validoQueLaCompraHaSidoExitosaConElMensaje(String mensaje) {

        theActorInTheSpotlight().should(seeThat(new ValidateThePayment(),equalTo(mensaje)));
    }
}
