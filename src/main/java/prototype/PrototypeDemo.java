package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(5);
        Circle cloneCircle = (Circle) originalCircle.clone();

        Rectangle originalRectangle = new Rectangle(2, 5);
        Rectangle cloneRectangle = (Rectangle) originalRectangle.clone();

        System.out.println("Origonal: " + originalCircle);
        System.out.println("Cloned: " + cloneCircle);

        System.out.println("Origonal: " + originalRectangle);
        System.out.println("Cloned: " + cloneRectangle);

    }
}
