package javaTutorialSchool.OnlineTest12022C.question3;

import java.util.ArrayList;

public class Clients {
    private String name;
    private ArrayList<Services> services;

    public Clients(String name) {
        this.name = name;
        services = new ArrayList<>();
    }

    public Services bookService(int distance, String type) {
        Services service;
        if (type.equalsIgnoreCase("Food Delivery")) {
            service = new FoodDelivery(distance);
        } else {
            service = new ExpressDelivery(distance);
        }
        services.add(service);
        System.out.printf("The client %s has booked the service %s!\n", this.getName(), type);
        return service;
    }

    public void printAllService() {
        System.out.printf("%s Service", name);

        for (Services s : services) {
            System.out.println(s);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


