public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle(String color, float length, float width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return length * width;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getters and Setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}