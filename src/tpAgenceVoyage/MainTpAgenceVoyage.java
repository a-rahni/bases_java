package tpAgenceVoyage;

public class MainTpAgenceVoyage {
    public static void main(String[] args) {

        KitVoyage kitParisLondre = new KitVoyage("Paris","Londre");

        kitParisLondre.ajouterOption(new Sejour("Hotel1",50,5,150));
        kitParisLondre.ajouterOption(new Transport("Vol2514",15,false));

        System.out.println(kitParisLondre);


    }
}

/**
 * TP  : Agence de Voyage
 * Un voyagiste souhaite que vous l’aidiez à gérer ses offres de voyage.
 * Notre voyagiste vend des kits de voyage composés de différentes options.
 * Il s’agit d’abord d’implémenter une classe OptionVoyage permettant de représenter de telles options.
 * Une option (classe OptionVoyage) est caractérisée par :
 * son nom, une chaîne de caractères ;
 * et son prix forfaitaire (un double).
 * La classe OptionVoyage comportera :
 * un constructeur initialisant les attributs au moyen de valeurs passées en paramètre et dans un ordre compatible
 * avec le main fourni ; une méthode getNom retournant le nom de l’option ;
 * une méthode double prix() retournant le prix forfaitaire de l’option ;
 * une méthode toString produisant une représentation de l’option sous la forme d’une chaîne de caractères, selon
 * le format suivant : <nom> -> <prix> € où <nom> est le nom de l’option et <prix> est son prix.
 * Il vous est demandé d’implémenter la classe OptionVoyage en respectant une bonne encapsulation.
 * Les options de voyage peuvent bien sûr se décliner en différentes sous-classes.
 * Il s’agit ici d’en modéliser deux : les moyens de transport (classe Transport) et le logement pendant
 * le voyage (classe Sejour).
 *
 * La classe Sejour
 * Une instance de Sejour sera caractérisée par
 * le nombre de nuits (un entier) et le prix par nuit (un double).
 * Le prix d’un séjour est simplement le nombre de nuits multiplié par le prix par nuit, auquel on ajoutera
 * le prix forfaitaire de l’option.
 *
 * La classe Transport
 * Une instance de Transport sera caractérisée par :
 * un booléen indiquant si le trajet est long.
 * Le prix du transport vaut la constante TARIF_LONG (1500.0) si le trajet est long et TARIF_BASE (200.0) sinon,
 * auquel on ajoutera le prix forfaitaire de l’option.
 * Les constantes seront publiquement accessibles.
 * Faites maintenant en sorte que la classe OptionVoyage se spécialise en deux sous-classes :
 * Transport et Sejour répondant à la description précédente.
 * La hiérarchie de classes sera dotée :
 * de constructeurs conformes au main fourni. Les arguments sont dans l’ordre : le nom, le prix forfaitaire et un booléen (valant true si le trajet est long et false sinon) pour les Transport. Les arguments pour le constructeur de Sejour sont dans l’ordre : le nom, le prix forfaitaire, le nombre de nuits et le prix par nuit. Par défaut, un Transport a un trajet court.
 * de redéfinitions spécifiques de la méthode prix. Ces spécialisations ne contiendront aucune duplication de code et seront utilisables de façon polymorphique.
 *
 * Kit de voyage
 * Le voyagiste vend des kits composés de plusieurs options.
 * Il vous est demandé de coder une classe KitVoyage comme une «collection hétérogène» de OptionVoyage (un ArrayList).
 * La classe KitVoyage sera également caractérisée par le départ et la destination du kit (deux String).
 * La classe KitVoyage sera dotée :
 * d’un constructeur compatible avec le main
 * d’une méthode double prix() qui calculera le prix du kit comme la somme du prix de toutes ses options ;
 * d’une méthode toString, générant une représentation du kit sous la forme d’une String, selon le format suivant :
 * Voyage de <depart> à <destination>, avec pour options :
 * - <nom option1> -> <prix option1> €
 * ....
 * <nom optionN> -> <prix optionN> €
 * Prix total : <prix du kit> € où <depart> est le départ du kit, <destination> sa destination et
 * <prix du kit> son prix. La chaîne construite se termine par \n.
 * d’une méthode ajouterOption, compatible avec le main fourni et permettant d’ajouter une OptionVoyage à la
 * collection d’options du kit (les options seront ajoutées en fin de collection). Si l’argument de ajouterOption
 * vaut null, il ne sera pas ajouté à la collection.
 * une méthode annuler vidant la collection d’options (utiliser la méthode clear des ArrayList) ;
 * une méthode getNbOptions retournant le nombre d’options de voyage du kit.
 *
 */
