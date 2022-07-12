package poo.exos;

public class Rectangle {

    private float longueur;
    private float largeur;

    public float getLongueur() {
        return longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getAire(){
        return  longueur*largeur;
    }

    public float getPerimetre(){
        return 2*(longueur+largeur);
    }
}
