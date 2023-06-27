package javaTutorialSchool.week6.revision.exercise3;

public class main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3, "blue", true);
        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println(circle1);
        System.out.println();
        System.out.println(circle2);
        System.out.println();
        System.out.println(rectangle1);
        Square square1 = new Square(5);
        System.out.println(square1);


    }
}
