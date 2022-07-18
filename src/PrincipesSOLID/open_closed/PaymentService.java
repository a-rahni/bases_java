package PrincipesSOLID.open_closed;

public class PaymentService {
    private  IPaiymentMethod paymentMethod;
    public PaymentService(IPaiymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void payer(){
        paymentMethod.processPayment();
    }

    //SOLID
// S : Single responsability
// O : Open closed
// L : Liscov substitution
// I : Interface Segration
// D : Dependency inversion(implémenté par le pattern Dependency Injection)

}
