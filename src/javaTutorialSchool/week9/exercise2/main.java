package javaTutorialSchool.week9.exercise2;

public class main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println("-----------------------");


//        System.out.println(s1.getRadius());  // Trigger Error
        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        // line 28 error because
        // Explain
        // 1. we create new object name "s2" of "shape" class
        // 2. error: "shape" is abstract can not instantiate (create) directly
//        Shape s2 = new Shape(); // Trigger Error

        // upcast: create object "new Rectangle" up to superclass "Shape"
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // error: "s3" created from "shape" which is superclass,
        // s3 is established from "new Rectangle" (child class).
        // therefore s3 is belonged to "shape" class whilst "getlength" is
        // Rectangle's attribute
        System.out.println("-----------------------");

        //System.out.println(s3.getLength()); // Trigger Error
        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());


        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // Trigger Error


//        // Take note that we downcast Shape s4 to Rectangle,
//        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); // Trigger Error
        System.out.println(r2.getLength());
        System.out.println("-----------------------");


//        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
