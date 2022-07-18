package interfaces;

/**
 * le concept Voler existe deux fois (Dans superHerosVolant et MechantInsecte
 * dupliquer un concept même si ce n'est pas la même façon de voler.
 *
 *
 *exemple class Action qui on lui passe un objet nimporte quel personnage qui vol
 *  - void presenterUnSupperHerosVolant(SuperHerosVolant )
 *  -void presnererMechantInsect(..)
 *  mauvaise façon: pb couplage
 *  : duplication (meme comportement des deux méthode)
 *  : si on rajoute un autre superHeros volant: obliger de rajouter une méthode
 *
 *  => comment dire a Action tu epux accepeter n'importe quelle type d'objet qui contient un comportement Voler
 *  ceer une classe Voler: qui va contenir une methode abstract voler (class abstract)
 *  dans Action repmlacer les deux methodes par une seule qui prend un objet voler (superHeros ou MechantInsecte hériatnt voler
 *  presenterUnPersonnageVolant(Voler voler)
 *  => pb: pas d'heritage multiple en Java (SuperHeros et MechantInsect hétitent déja Personnage
 *
 *  ==> solution : deonner la possibilité d'implementer plusieurs comportement
 *  notion d'interfaces: Interface déja public abstract.
 *  methode interface est abstract: --> obliger les classes de la redefinir.
 *  La methode presenterPersonnageVolant prent toute classe implementant l'interface Voler
 *
 *  ==> donne la reutilisation + decouplage  (couplage faible)
 *  modification ou evolution pas besoin de modifier Action
 *
 *  exp: coordonnée d'un entreprise sur une carte: interface mappable : on peut representer n'importe quel objet
 *  (personne, entreprise,..)implementant Mappable
 */
public class MainInterfaces {
    public static void main(String[] args) {
        SuperHerosVolant superman=new SuperHerosVolant("Clark Kent","23/09/1889",500,1000);
        SuperHeros flash=new SuperHerosCourant("Barry Allen","03/05/1890",300,200);
        MechantInsecte insecte=new MechantInsecte("Jeff Goldblum","05/02/1790");

        Action action=new Action();
        action.presenterUnPersonnageVolant(superman);
    }
}
