package javaTutorialSchool.week9.exercise1;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooooooow");
    }
}
