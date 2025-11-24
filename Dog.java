package Petstore;

public class Dog extends Pet{
    private String breed;
    private boolean isVaccinated;
    Dog(String name, int age, String breed, boolean isVaccinated) {
        super(name, age);
        this.breed = breed;
        this.isVaccinated = isVaccinated;
    }
    void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Breed: " + breed);
        System.out.println("IsVaccinated: ");
        if(isVaccinated)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
