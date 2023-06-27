package javaTutorialSchool.week6.exercise3;

public class MainShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red", true);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(5, "blue", true);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(5, 10, "yellow", true);

        Square square1 = new Square();
        Square square2 = new Square(4);
        Square square3 = new Square(10, "grey", true);


        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println("------------------");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("------------------");

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("------------------");

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);


    }
}
