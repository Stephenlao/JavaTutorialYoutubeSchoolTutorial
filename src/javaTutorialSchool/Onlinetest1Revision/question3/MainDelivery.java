package javaTutorialSchool.Onlinetest1Revision.question3;

public class MainDelivery {
    public static void main(String[] args) {
        Drivers tom = new Drivers("Tom");
        Clients jerry = new Clients("Jerry");
        Services s1 = jerry.bookedServices(2, "food delivery");
        jerry.printallClientServices();
        tom.accepts(s1);
        jerry.printallClientServices();
        tom.completes();
        System.out.printf("Tom's wallet: %.2f\n", tom.getWallet());
        jerry.printallClientServices();
        System.out.println();
        Clients phong = new Clients("Phong");
        Services s2 = phong.bookedServices(10, "express delivery");
        phong.printallClientServices();
        tom.accepts(s2);
        phong.printallClientServices();
        tom.completes();
        phong.printallClientServices();
        System.out.printf("Tom's wallet: %.2f\n", tom.getWallet());


    }
}
