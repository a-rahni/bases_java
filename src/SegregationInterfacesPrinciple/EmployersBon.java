package SegregationInterfacesPrinciple;

import java.util.ArrayList;
import java.util.Arrays;


public class EmployersBon {
    public static void main(String[] args) {
        ArrayList<String> langages=new ArrayList<>(Arrays.asList("Python","Java",
                "Spring","Symfony","Laravel"));
        DevOps chrisDevOps=new DevOps("Lisangola","Christian","23/04/1988");
        Developer samiDev=new Developer("Nefzi","Sami","25/09/1986",langages);
        Developer laurent=new Developer("Bila","Laurent","20/08/1996");
        //laurent.setLangagesMaitrises("Python");
        //laurent.setLangagesMaitrises("C++","Rust","Go","Fortan");

        ProjectManager ruth=new ProjectManager("Akakpo","Ruth","01/06/1990");
        Comptable benjamin=new Comptable("Perrin","Benjamin","12/05/1995");

        //benjamin.setLangagesMaitrises("C++");

    }
}

abstract class Employer2{
    private String nom;
    private String prenom;
    private String dateNaissance;



    public Employer2(String nom,String prenom,String dateNaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.dateNaissance=dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

}

class Developer extends Employer2{
    ArrayList<String> langages;
    public Developer(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.langages=new ArrayList<>();
    }

    public Developer(String nom, String prenom, String dateNaissance,
                     ArrayList<String> langages) {
        super(nom, prenom, dateNaissance);
        this.langages=langages;
    }

    public void setLangagesMaitrises(String langage){

        this.langages.add(langage);
    }

    public void setLangagesMaitrises(String ...langages){
        for(String langage:langages){
            this.langages.add(langage);
        }
    }
}

class Comptable extends Employer2{

    public Comptable(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
    }
}

class DevOps extends Employer2{

    public DevOps(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
    }
}

class ProjectManager extends Employer2{

    public ProjectManager(String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
    }
}
