package Petstore;
import java.util.ArrayList;
import java.util.List;

public class PetCatalog {
    List<Pet> pets ;
    PetCatalog(){
        pets = new ArrayList<>();
    }
    PetCatalog(Pet p){
        pets = new ArrayList<>();
        pets.add(p);
    }
    void addPet(Pet p){
        pets.add(p);
    }
    void removePet(int id){
        pets.remove(pets.get(id));
    }
    void search(int id){
        for(Pet p : pets){
            if(p.getId() == id){
                p.displayInfo();
                return;
            }
        }
        System.out.println("Unable to find pet with id " + id);
    }
    void search(String name){
        for(Pet p : pets){
            if(p.getName().equalsIgnoreCase(name)){
                p.displayInfo();
            }
        }
    }
    void displayAll(){
        for(Pet p : pets){
                p.displayInfo();
        }
    }

}
