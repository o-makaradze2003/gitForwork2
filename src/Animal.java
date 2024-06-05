public class Animal {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println(name);
        System.out.println(age);
    }
    public void makeSound(){
        System.out.println("animal MakeSound");
    }
}
