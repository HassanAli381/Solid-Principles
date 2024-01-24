package OpenClosed.BadExample;

public class ShapeDrawer {

    public void drawShape(Object shape) {
        if(shape instanceof Rectangle) {
            // Drawing Rectangle
            System.out.println("Rectangle drawn successfully");
        }
        else if(shape instanceof Square) {
            // Drawing Square
            System.out.println("Square drawn successfully");
        }
    }

}
