package PrincipesSOLID.open_closed;

public class MasterCardPayment implements IPaiymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Master card en cours ...");
    }
}
