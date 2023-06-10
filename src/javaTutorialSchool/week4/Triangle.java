package javaTutorialSchool.week4;

public class Triangle {

    // create attributes
    private int myX;
    private int myY;
    private int myZ;

    // create "Triangle" constructor in order to called it in
    //main "TriangleTest"

    // always create constructor
    //using "public methodname"
    public Triangle(int x, int y, int z) {
        myX = x;
        myY = y;
        myZ = z;
    }

    public String verify() {
        if (myX + myY > myZ && myY + myZ > myX && myX + myZ > myY) {
            if ( myX == myY && myY == myZ) {
                return "Equilateral Triangle";
            } else if ( myX == myY || myY == myZ) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        } else {
            return "Not a triangle";
        }
    }
}
