package poo;

public class Avion {
    private String fabricant;
    private String modele;
    private int nombreSieges;
    private String couleur;


    //    Getters ou Accesseurs
    public String getFabricant(){
        return fabricant;
    }

    public String getModele(){
        return modele;
    }

    public int getNombreSieges(){
        return nombreSieges;
    }

    public String getCouleur(){
        return couleur;
    }

    //    Setters ou manipulateurs
    public void setFabricant(String fabricant){
        this.fabricant=fabricant;
    }

    public void setModele(String modele){
        this.modele=modele;
    }

    public void setCouleur(String couleur){
        this.couleur=couleur;
    }

    public void setNombreSieges(int nombreSieges){
        this.nombreSieges=nombreSieges;
    }



    String nomCompletAvion(){
        //return fabricant+" "+modele;
        return String.format("%s %s",fabricant,modele);
    }
}