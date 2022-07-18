package interfaces.exo_interfaces;

import java.util.Scanner;




    //1. Ecrire le code
// Avoir une méthode appelée processPayment
// Si le mode de paiement est VISA, afficher "Paiement par carte visa en cours"
// Si le mode de paiement est MASTERCARD, afficher "Paiement par master card en cours"
// Si le mode de paiement est PAYPAL, afficher "Paiement par paypal en cours"

// 2. Faire resortir les problème avec cette implémentation
/*
     - single responsablilty non respecté: gerer le paiement et les modes de paiement au même temps
     - le principe OpenClose non respecté:
        si evolution: un autre mode de paiement on doit modifier le code du payment process
 */

// 3. Proposer une meilleure solution en reduisant le couplage
/*
     - utiliser une interfaces Payable avec une methode abstract Payer
 */


    /********************************************************************
     * Question 3: Meilleure solution en utilisant une interface
     * ******************************************************************
     */
public class PaymentService {
    public static final String VISA="visa";
    public static final String MASTER="master";
    public static final String PAYPAL="paypal";
    private String paymentMethod;//"visa", "master-card","paypal"

    public PaymentService(String paymentMethod){
        this.paymentMethod =paymentMethod;
    }
    public void processPayment(){
        if(paymentMethod.equals(VISA)){
            System.out.println("Paiement par carte visa en cours");
        } else if (paymentMethod.equals(MASTER)) {
            System.out.println("Paiement par master card en cours");
        } else if (paymentMethod.equals(PAYPAL)) {
            System.out.println("Paiement par paypal en cours");
        }
        else {
            System.out.println("mode de paiement non accepté");
        }
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

 class main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.printf(" mode de paiement (visa, master or paypal):");

        String modePaiement = input.next();

        /*  question 1: */
        PaymentService paiement = new PaymentService(modePaiement);
        paiement.processPayment();
    }
}

/********************************************************************
 * Question 3: Meilleure solution en utilisant une interface Payable
 * ******************************************************************
 */

class main2{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.printf(" mode de paiement (visa, master or paypal):");

        String modePaiement = input.next();

        /* Solution en utilisant une interface Payable*/
        switch (modePaiement)
        {
            case "visa":
                VisaCard vCard = new VisaCard();
                vCard.payer();
                break;
            case "master":
                MasterCard mCard = new MasterCard();
                mCard.payer();
                break;
            case "paypal":
                Paypal pPal = new Paypal();
                pPal.payer();
                break;
            default:
                System.out.println("ce moyen de paiement est non accepté");
                break;
        }

    }
}

interface Payable{
    public abstract void payer();
}


class MasterCard implements Payable{
    @Override
    public void payer() {
        System.out.println("Paiement par master card en cours");
    }
}

class VisaCard implements Payable{

    @Override
    public void payer() {
        System.out.println("Paiement par carte visa en cours");
    }
}

class Paypal implements Payable{

    @Override
    public void payer() {
        System.out.println("Paiement par PayPal en cours");
    }
}


