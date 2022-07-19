package PrincipesSOLID.exos_solid;

public class Case1 {
    public static void main(String[] args) {

    }
}


// 1. Commencer par critiquer le code écrit en mettant en avant les problèmes
// 2. Proposer une solution(dire ce que vous avez changé et les raisons du changement)

// response:
// 1.   encapsulation, abstraction: manque l'isolation de données d'un compte
//      single responsability: la classe fait plusieurs choses à la fois
//          - gere tous les comptes possibles, operation sur un compte et rapport
//      segregation d'interface: ?
//      openClosed: toute modification de requiement (ajout support rapport) necessite un modification

//2. single responsabilité: cerer une classe Compte ou stock et gerer que les donnée du compte.
//    - classe CompteService qui gere les differents services proposés pour un compte


class BankService{
    //    Effectuer un dépôt
    public double deposit(double amount,String accountNo){
        return 0;
    }

    //    Retirer de l'argent
    public double withdraw(double amount,String accountNo){
//        withdraw amount
        return 0;
    }

    //    Imprimer le relevé de compte Bancaire
    public void bankStatement(){

    }

    //    Envoyer une notification de OTP pour chaque type d'opération bancaire
//    Par email ou mobile ou whatsapp
    public void sendOTP(String medium){
        if(medium.equals("email")){
            // write email related logic
        }else if(medium.equals("mobile")){
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

    //    Envoyer une notification en guise de rapport pour chaque
//    Par email ou mobile ou whatsapp
    public void sendTransactionReport(String medium){
        if(medium.equals("email")){
            // write email related logic
        }else if(medium.equals("mobile")){
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

}