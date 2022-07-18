package PrincipesSOLID.open_closed;

public class PaypalPayment implements IPaiymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Paypal en cours ...");
    }
}
