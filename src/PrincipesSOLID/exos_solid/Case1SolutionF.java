package PrincipesSOLID.exos_solid;

public class Case1SolutionF {



}

// garder dans Bank service que les operations sur le compte (e
class BankService2{
    //    Effectuer un dépôt
    public double deposit(double amount,String accountNo){
        return 0;
    }

    //    Retirer de l'argent
    public double withdraw(double amount,String accountNo){
//        withdraw amount
        return 0;
    }
}

 interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}

 class WhatsAppNotificationService implements Notificationservice {

    public void sendOTP(String medium) {
        //logic to integrate whatsapp api
    }

    public void sendTransactionReport(String medium) {
//logic to integrate whatsapp api
    }
}

 class EmailNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
        //write logic to integrate with email api

    }

    public void sendTransactionReport(String medium) {
        //write logic to integrate with email api
    }
}

 class MobileNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
        //write the logic to send otp to mobile
        //twillo api

    }

    public void sendTransactionReport(String medium) {
        //write the logic to send otp to mobile
        //twillo api
    }
}

 class PrinterService {

    public void printPassbook() {
        //update transaction info in passbook
    }
}