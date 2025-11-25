package Petstore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    List<Pet> pets;
    public static void addPets(PetCatalog catalog){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter FurColor: ");
        String furColor = sc.nextLine();
        System.out.print("Breed: ");
        String breed = sc.nextLine();
        Pet p = new Cat(name, age, breed, furColor, true);
        System.out.println("---------------------------------------");
        catalog.addPet(p);
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        PetCatalog petCatalog = new PetCatalog();

        while(true) {
            System.out.println("================-Menu-===================");
            System.out.println("Enter your choice");
            System.out.println("1. Add Pet");
            System.out.println("2. Remove Pet");
            System.out.println("3. List of all Pets");
            System.out.println("4. Search Pets by Name");
            System.out.println("5. Search Pets by ID");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            int id;
            switch (choice) {
                case 1:
                    addPets(petCatalog);
                    break;
                case 2:
                    System.out.println("Enter the id of the pet you want to remove");
                    id = sc.nextInt();
                    sc.nextLine();
                    petCatalog.removePet(id);
                    break;
                case 3:
                    petCatalog.displayAll();
                    break;
                case 4:
                    String name = sc.nextLine();
                    petCatalog.search(name);
                    break;
                case 5:
                    System.out.println("Enter the id of the pet you want to search");
                    id = sc.nextInt();
                    sc.nextLine();
                    petCatalog.search(id);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}

