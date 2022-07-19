package SegregationInterfacesPrinciple;

import java.util.ArrayList;
import java.util.Arrays;
// 1.L'ajout d'un seul requirement casse le code dans plusieurs fichier, car le
// constructeur doit être mis à jour
// exp: ajour liste de langages maitrisés pour un devloppeur
// necessite de modifier toutes les instanciation dans le code en rajoutant (list ou null)

// 2. On voit que le comptable peut aussi définir les langages de programmation
// segregation d'interfaces:
// l'ajout d'une liste de langages: on aura des set et get disponible mais non utiles pour d'autres employer
// --> utiliser l'heritage pour separer les interafces : calss developeur, classe comptable ...

// autre exp sur problème de segregation d'interfaces: exp : PaymentService, qui a un attribut pour chaque mode de
// paiement(Visa,Master ou Paypal). au final il y a un seule mode utilisé a la fois donc les deux utre non utilisé
// pb se complique encore plus si on ajoute des interfaces pour chaque mode de paiement. --> pb segregation d'interface



public class EmployersBad {
    public static void main(String[] args) {
        ArrayList<String> langages=new ArrayList<>(Arrays.asList("Python","Java",
                "Spring","Symfony","Laravel"));
        Employer chrisDevOps=new Employer("Lisangola","Christian","23/04/1988","DevOps",null);
        Employer samiDev=new Employer("Nefzi","Sami","25/09/1986","Dev",langages);
        Employer laurent=new Employer("Bila","Laurent","20/08/1996","Dev",null);
        //laurent.setLangagesMaitrises("Python");
        //laurent.setLangagesMaitrises("C++","Rust","Go","Fortan");

        Employer ruth=new Employer("Akakpo","Ruth","01/06/1990","Project Manager",null);
        Employer benjamin=new Employer("Perrin","Benjamin","12/05/1995","Comptable",null);

        //benjamin.setLangagesMaitrises("C++");// pas bon: interface pour ajouter des langages pour un comptable

        System.out.printf("%s : %s\n",chrisDevOps.getPrenom(),chrisDevOps.getRole());
        System.out.printf("%s : %s\n",samiDev.getPrenom(),samiDev.getRole());
        System.out.printf("%s : %s\n",ruth.getPrenom(),ruth.getRole());
        System.out.printf("%s : %s\n",benjamin.getPrenom(),benjamin.getRole());
    }
}

// nom,prenom,date de naissance
// comptables, devops, chefs de projet, developers
// Pour les développeurs, il faut lister les langages et framworks qu'ils maitrisent
class Employer{
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String role;

    private ArrayList<String> langagesMaitrises;
    private ArrayList<String> outilsDecomptaMaitrises;

    public Employer(String nom,String prenom,String dateNaissance,String role,
                    ArrayList<String> langagesMaitrises){
        if(role.equals("Dev")){
            this.langagesMaitrises=langagesMaitrises;
        }
        this.nom=nom;
        this.prenom=prenom;
        this.dateNaissance=dateNaissance;
        this.role=role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLangagesMaitrises(String langage)throws Exception{
        if(this.role!="Dev"){
            throw new Exception("Il faut être un dev pour ajouter des lanagages");
        }
        this.langagesMaitrises.add(langage);
    }

    public void setLangagesMaitrises(String ...langages) throws Exception{
        if(this.role!="Dev"){
            throw new Exception("Il faut être un dev pour ajouter des lanagages");
        }
        for(String langage:langages){
            this.langagesMaitrises.add(langage);
        }
    }
}