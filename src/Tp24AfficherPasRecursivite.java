/**
 * Écrivez une fonction qui accepte un nombre positif N.
 * La fonction doit afficher sur la console une forme de pas
 * avec N niveaux en utilisant le caractère #.
 * Exigences
 * Assurez-vous que l’étape possède des espaces sur le côté droit(à place des #) !
 * Exemples
 * maMethode(2)
 * ‘# ’
 * ‘##’
 * maMethode(3)
 * ‘# ’
 * ‘## ’
 * ‘###’
 * maMethode(4)
 * ‘# ’
 * ‘## ’
 * ‘### ’
 * ‘####’
 */

public class Tp24AfficherPasRecursivite {

    public static String ComputeStringPas(int nbr) {

        if (nbr <= 0) {
            return "";
        } else if (nbr == 1) {
            return "#";
        } else {
            return ("#" + ComputeStringPas(nbr - 1));
        }
    }

    public static void main(String[] args) {

//        System.out.printf("\n methode(%d): \n %s ", 1,ComputeStringPas(1));
//        System.out.printf("\n methode(%d): \n %s ", 2,ComputeStringPas(2));
//        System.out.printf("\n methode(%d): \n %s ", 3,ComputeStringPas(3));
//        System.out.printf("\n methode(%d): \n %s ", 4,ComputeStringPas(4));
        System.out.printf("\n methode(%d): \n %s ", 5,ComputeStringPas(5));

    }
}
