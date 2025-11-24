package Petstore;
import java.util.ArrayList;
import java.util.List;

public class PetCatalog {
    List<Pet> pets ;
    PetCatalog(Pet p){
        pets = new ArrayList<>();
        pets.add(p);
    }
    void addPet(Pet p){
        pets.add(p);
    }
    void removePet(Pet p){
        pets.remove(p);
    }
    void searchID(int id){
        for(Pet p : pets){
            if(p.getId() == id){
                System.out.println(p.getName());
                return;
            }
        }
        System.out.println("Unable to find pet with id " + id);
    }
    void searchName(String name){
        for(Pet p : pets){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println(p.getName());
            }
        }
    }

}
