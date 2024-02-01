package LiskovSubstitution.BadExample;

public class LiskovSubstitutionTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        if(rectangle.getArea() == 10) {
            System.out.println("OK");
        }

        // the next example violates Liskov Substitution Principle
        Rectangle rect = new Square();
        rect.setWidth(2);
        rect.setHeight(5);
        if(rect.getArea() == 10) { // condition will not be satisfied
            System.out.println("OK");
        }

    }
}
