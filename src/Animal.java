public class Animal {
    protected String name;
    protected int age;

    /**
     * Gets the name.
     * @return A string representing the name.
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name
     * @param name A String containing name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return An int representing the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age An int contain age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *Prints name and age
     */
    public void displayDetails() {
        System.out.println(name);
        System.out.println(age);
    }

    /**
     * Print sound of animal
     */
    public void makeSound() {
        System.out.println("animal MakeSound");
    }
}
