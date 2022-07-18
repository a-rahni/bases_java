package poo;

public enum Personnes {
    ENSEIGNANT,
    SECRETAIRE,
    ETUDIANT_REGULIER,
    ETUDIANT_ECHANGE
}

class MainEnum{
    public static void main(String[] args) {
        Personnes etudiant=Personnes.ETUDIANT_ECHANGE;
    }
}


//public enum Personnes {
//    private String value;
//    private Personnes(String Alias){
//        value = Alias;
//    };
//    ENSEIGNANT("Enseig"),
//    SECRETAIRE(),
//    ETUDIANT_REGULIER,
//    ETUDIANT_ECHANGE
//}