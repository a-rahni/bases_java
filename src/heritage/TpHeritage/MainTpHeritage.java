package heritage.TpHeritage;

import java.util.ArrayList;
import java.util.List;

public class MainTpHeritage {
    public static void main(String[] args) {

        List<Personne> listePersonnel= new ArrayList<>();

        listePersonnel.add(new EtudiantRegulier("Chris Lisangole",2013,"Physique",15));
        listePersonnel.add(new EtudiantRegulier("Jihane Cheddadi",2011,"Math Informatique",19.4));

        listePersonnel.add(new EtudiantEchange("Bjorn cote de Fer",2012,"Physique","Paris 40"));

        listePersonnel.add(new Enseignant("Zinedine Benzema",1998,"Physique",2000,"Physique"));

        listePersonnel.add(new Secretaire("Christiane Lisangolanne",2005,"Chimie",5000));

        int nbrEtudiant = 0;
        for(Personne p: listePersonnel){
            if(p.estEtudiant()){
                nbrEtudiant++;
            }
        }
        System.out.printf("Parmi les %d personnes qui frequentent CLBIT, %d sont des étudiants\n\n", listePersonnel.size(),nbrEtudiant);

        System.out.println("Liste de toutes les personnes:");
        for(Personne p:listePersonnel){
            System.out.println(p);
        }

    }
}
