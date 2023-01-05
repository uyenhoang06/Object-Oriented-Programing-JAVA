package exercise1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        cat.greets();

        Dog dog1 = new Dog("dog1");
        dog1.greets();
        Dog dog2 = new Dog("dog2");
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("big dog1");
        bigDog1.greets();
        BigDog bigDog2 = new BigDog("big dog2");
        bigDog1.greets(bigDog2);
        bigDog1.greets(dog1);

        Dog dog3 = (Dog) bigDog1;
        dog3.greets();
        dog3.greets(dog2);
        dog3.greets(bigDog2);
    }
}
