package PrincipesSOLID.open_closed;

public class VisaCardPayment implements IPaiymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Visa card en cours ...");
    }
}
