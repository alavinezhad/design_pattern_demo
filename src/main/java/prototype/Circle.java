package prototype;

public class Circle implements Prototype{
    private int radious;

    public Circle(int radious) {
        this.radious = radious;
    }

    public Circle(Circle target) {
        if (target != null) {
            this.radious = target.radious;
        }
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle with radious: " + radious;
    }
}
