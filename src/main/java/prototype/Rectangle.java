package prototype;

public class Rectangle implements Prototype{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle target) {
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
