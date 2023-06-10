package javaTutorialSchool.week4;

public class Rectangle {

    // create "private" in order to create attribute
    // store inside the Rectangle constructor or it
    // can be set as "getter" in this case
    private int myWidth;
    private int myHeight;

    public Rectangle(int width, int height) {
        myWidth = width;
        myHeight = height;
        if (myWidth < 0) {
            System.out.println("Warning: input width is negative!");
        } else if (myHeight < 0) {
            System.out.println("Warning: input height is negative!");
        }
    }

    public void visualise() {
        if (myHeight > 0 && myWidth > 0) {
            for (int i = 1; i <= myHeight; i++) {
                for (int j = 1; j <= myWidth; j++) {
                    System.out.print("*");
                }
                 // xuong dong
                System.out.println();
            }
        } else if (myHeight > 0 && myWidth < 0) {
            for (int i = 1; i <= myHeight; i++) {
                System.out.print("*\n");
            }
        } else if (myHeight < 0 && myWidth > 0) {
            for (int i = 1; i <= myWidth; i++) {
                System.out.print("*");
            }
        }
    }
}

