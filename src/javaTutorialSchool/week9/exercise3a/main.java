package javaTutorialSchool.week9.exercise3a;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println("---------------------------");

        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());


    }
}
