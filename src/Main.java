public  class Main {
    public static void main(String[] args) {
    Animal an=new Animal("generic animal",5);
    System.out.println("Name: "+an.name);
    System.out.println("Age: "+an.age);
    an.makeSound();
    Dog dg=new Dog("miki",5,"bow bow");
    System.out.println("Name: "+dg.name);
    System.out.println("age: "+dg.age);
    dg.makeSound();

    }
}