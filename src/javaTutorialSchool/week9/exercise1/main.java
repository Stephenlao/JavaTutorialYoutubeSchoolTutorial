package javaTutorialSchool.week9.exercise1;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("chiwawa");
        Dog dog1 = new Dog("corgi");
        Dog dog2 = new Dog("buddle");
        dog1.greets(dog2);
        BigDog dog3 = new BigDog("bacde");
        dog3.greets(dog2);
    }

}
