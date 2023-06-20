package javaTutorialSchool.week7;

class Cat extends lecture {
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Scratching...");
    }

    public static void main(String[] args) {
        lecture animal = new Cat();
        animal.makeSound(); // Output: "Meow!"

        Dog myDog = (Dog) animal; // Attempting to downcast to Dog

        // The following line throws a ClassCastException at runtime
        myDog.makeSound();
    }
}
