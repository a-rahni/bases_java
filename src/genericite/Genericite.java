package genericite;

public class Genericite {
}


interface Notificationservice<T> {

    public void sendOTP(T t);

    public void sendTransactionReport(T t);

}

class WhatsAppNotificationService implements Notificationservice<String> {

    public void sendOTP(String medium) {
        //logic to integrate whatsapp api
    }

    public void sendTransactionReport(String medium) {
//logic to integrate whatsapp api
    }
}

class EmailNotificationService implements Notificationservice<String> {
    public void sendOTP(String medium) {
        //write logic to integrate with email api

    }

    public void sendTransactionReport(String medium) {
        //write logic to integrate with email api
    }
}