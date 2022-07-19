package PrincipesSOLID.exos_solid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Case1Solution {
    public static void main(String[] args) {

        Compte c1 = new Compte(100001L,15000);
        Communication email = new EmailComm();
        BankService1 bService = new BankService1(c1,email);

        bService.sendOTP();
        Communication mobile = new MobileComm();
        bService.setMedium(mobile);
        bService.sendOTP();

        Compte c2 = new Compte(200002L,22222);
        bService.setMedium(mobile);
        bService.setCompte(c2);
        bService.sendTransactionReport();

    }
}




class Compte{
    private Long accountNo;
    private double solde;

    private List<OperationCompte> listOperation = new ArrayList<>();

    public Compte(Long accountNo, double solde) {
        this.accountNo = accountNo;
        this.solde = solde;
    }
    public Compte(Long accountNo) {
        this(accountNo,0);
    }

    public double getSolde() {
        return solde;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public boolean deposit(double amount){
        solde += amount;
        return true;
    }

    //    Retirer de l'argent // withdraw amount
    public boolean withdraw(double amount){
        if(solde>= amount){
            solde -= amount;
            return true;
        }
        return false;
    }
}

class OperationCompte{
    private Date date;
    private int type; //0 retrait, 1 depot
    private double montant;

    public OperationCompte(Date date, int type, double montant) {
        this.date = date;
        this.type = type;
        this.montant = montant;
    }
}

class BankService1{
    private Compte compte;
    Communication medium;

    public BankService1(Compte compte, Communication medium) {
        this.compte = compte;
        this.medium = medium;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public void setMedium(Communication medium) {
        this.medium = medium;
    }

    //    Imprimer le relevé de compte Bancaire
    public void bankStatement(){
        //imprimer compte.getReleve()
    }

    //    Envoyer une notification de OTP pour chaque type d'opération bancaire
//    Par email ou mobile ou whatsapp
    public void sendOTP(){
        medium.send(String.format("OTP compte %d\n",compte.getAccountNo()));
    }

    //    Envoyer une notification en guise de rapport pour chaque
//    Par email ou mobile ou whatsapp
    public void sendTransactionReport(){
        medium.send(String.format("Notification compte %d\n",compte.getAccountNo()));
    }

}

interface Communication{
    void send(String s);
}

class EmailComm implements Communication{
    @Override
    public void send(String s) {
        System.out.printf("email: %s",s);
    }
}

class MobileComm implements Communication{

    @Override
    public void send(String s) {
        System.out.printf("Mobile: %s",s);
    }
}

class WhatsappComm implements Communication{

    @Override
    public void send(String s) {
        System.out.printf("Whatsapp: %s",s);
    }
}