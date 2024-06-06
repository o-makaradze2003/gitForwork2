public class Dog extends Animal {
    private String breed;

    /**
     * @return String representing a breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed A String contain breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    /**
     * Override method print sound of dog
     */
    @Override
    public void makeSound() {
        System.out.println("Dog makes sound: 'bov bov'");
    }

    /**
     * Override method print name age and breed of dog
     */
    @Override
    public void displayDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(breed);
    }
}
