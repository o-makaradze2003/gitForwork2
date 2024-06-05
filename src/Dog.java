public class Dog extends Animal{
    protected String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Dog makes sound: 'bov bov'");
    }

    @Override
    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(breed);
    }
}
