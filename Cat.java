package Petstore;

public class Cat extends Pet{
    private String breed;
    private String furColor;
    private boolean isVaccinated;

    Cat(String name, int age, String breed, String furColor, boolean isVaccinated) {
        super(name, age);
        this.breed = breed;
        this.furColor = furColor;
        this.isVaccinated = isVaccinated;
    }
    void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Breed: " + breed);
        System.out.println("FurColor: " + furColor);
        System.out.print("  Price: " + petType.getPrice());
        System.out.println("IsVaccinated: ");
        if(isVaccinated)
            System.out.println("Yes");
        else System.out.println("No");
    }

}
