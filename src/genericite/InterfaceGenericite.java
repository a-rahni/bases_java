package genericite;

import java.util.ArrayList;

public class InterfaceGenericite {
}

// CRUD:
class Contact{
    private int id;
    private String name;
}

class Customer{
    private int id;
    private  String ame;
    private String company;
}
// quand on creer un service ..


// findAll
// findById(int id)
// create( Customer c)  / create (Contact c)
// update( Customer c)  / create (Contact c)
// delete (int id)

interface Crud<T>{
    ArrayList<T> findAll();
    T findById(int id);
    void create(T t);
    void update(T t);
    void delete(int id);
}

class ContactRepository implements Crud<Contact>{
    public ArrayList<Contact> findAll(){
        return null;
    }

    public Contact findById(int id){
        return null;
    }

    public void create (Contact contact){

    }
    public void update (Contact contact){

    }
    public void delete(int id){

    }
}

class CustomerRepository implements Crud<Customer>{
    public ArrayList<Customer> findAll(){
        return null;

    }

    public Customer findById(int id){
        return null;
    }

    public void create (Customer contact){

    }
    public void update (Customer contact){

    }
    public void delete(int id){

    }
}