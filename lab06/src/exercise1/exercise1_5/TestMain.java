package exercise1.exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        //Animal
        Animal animal1 = new Animal("pig");
        System.out.println(animal1);

        //mammal
        Mammal mammal1 = new Mammal("cow");
        System.out.println(mammal1);

        //Dog
        Dog dog = new Dog("Bin");
        System.out.println(dog);
        dog.greets();

        Dog dog1 = new Dog("Bon");
        dog1.greets(dog);

        //Cat
        Cat cat = new Cat("pig");
        System.out.println(cat);
        cat.greets();
    }
}
