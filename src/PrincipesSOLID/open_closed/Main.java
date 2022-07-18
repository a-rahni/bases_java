package PrincipesSOLID.open_closed;

public class Main {
    public static void main(String[] args) {
        IPaiymentMethod paypal = new PaypalPayment();
        PaymentService paymentService = new PaymentService(paypal);
        paymentService.payer();
    }
}
