package tpAgenceVoyage;

import java.util.ArrayList;
import java.util.List;

public class KitVoyage {
    private String depart;
    private String destination;
    private List<OptionVoyage> kitVoyage= new ArrayList<>();

    public KitVoyage(String depart, String destination) {
        this.depart = depart;
        this.destination = destination;
        //kitVoyage= new ArrayList<>();
    }

    public double prix(){
        double sum = 0;
        for(OptionVoyage e:kitVoyage){
            sum+=e.prix();
        }
        return sum;
    }

    public void ajouterOption(OptionVoyage optionVoyage){
        if(optionVoyage!=null){
            kitVoyage.add(optionVoyage);
        }
    }

    public void annuler(){
        kitVoyage.clear();
    }

    public int getNbOptions(){
        return kitVoyage.size();
    }

    @Override
    public String toString() {
        String s=String.format("Voyage de %s à %s avec pour options:\n", depart,destination);
        for(OptionVoyage e:kitVoyage){
            s+=e.toString();
        }
        return String.format("%sPrix total %.3f €\n",s, this.prix());
    }
}
