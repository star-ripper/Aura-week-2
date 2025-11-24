package Petstore;

public class Bird extends Pet{
    private String species;
    private boolean canFly;
    Bird(String name, int age, String species, String furColor, boolean canFly) {
        super(name, age);
        this.species = species;
        this.canFly = canFly;
    }
    void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Price: " + getPrice());
        System.out.println("Species: " + species);
        System.out.println("Can Fly: ");
        if(canFly)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
