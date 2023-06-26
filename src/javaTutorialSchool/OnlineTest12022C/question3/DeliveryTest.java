package javaTutorialSchool.OnlineTest12022C.question3;

public class DeliveryTest {
    public static void main(String[] args) {
        // Create 2 drivers (Tom and Jerry with zero money for their wallets)
        Drivers tom = new Drivers("Tom");

        // Create 2 clients (jerry and phong)
        Clients jerry = new Clients("Jerry");
        Clients phong = new Clients("Phong");

        // Client jerry books a service of 2 km food delivery.
        Services s1 = jerry.bookService(2, "Food Delivery");

        // Show the status and cost of all booked services of client jerry.
        jerry.printAllService();

        // Driver Tom accepts the service of 2km food delivery from client jerry.
        tom.accepts(s1);

        // Show the status and cost of all booked services of client jerry.
        jerry.printAllService();

        tom.completes();

        // Show the wallet amount of driver Tom.
        System.out.printf("Tom's wallet: %.1f\n", tom.getWallet());

        // Show the status and cost of all booked services of client jerry.
        jerry.printAllService();

        // Client phong books a service of 10km express delivery.
        Services s2 = phong.bookService(10, "Express Delivery");

        // Show the status and cost of all booked services of client phong.
        phong.printAllService();

        // Driver Tom accepts the service of 2km food delivery from client jerry.
        tom.accepts(s2);

        // Show the status and cost of all booked services of client phong.
        phong.printAllService();

        tom.completes();

        // Show the status and cost of all booked services of client phong.
        phong.printAllService();

        // Show the wallet amount of driver Tom.
        System.out.printf("Tom's wallet: %.1f\n", tom.getWallet());
    }
}
