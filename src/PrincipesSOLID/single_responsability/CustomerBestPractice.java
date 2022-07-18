package PrincipesSOLID.single_responsability;

public class CustomerBestPractice {
    private int id;
    private String name;
    private boolean active;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

class CustomerRepository{

    public void addCustomer(){
        //Ajout
    }

    public void deleteCustomer(int id){
        //Suppression
    }
}
