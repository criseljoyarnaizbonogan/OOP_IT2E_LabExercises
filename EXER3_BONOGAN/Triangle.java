public class Triangle extends Shape {
    private float base;
    private float height;
    private float side1, side2, side3; 

    public Triangle(String color, float base, float height, float side1, float side2, float side3) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float calculateArea() {
        return 0.5f * base * height;
    }

    @Override
    public float calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public void setBaseHeight(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public void setSides(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getBase() { return base; }
    public float getHeight() { return height; }
    public float getSide1() { return side1; }
    public float getSide2() { return side2; }
    public float getSide3() { return side3; }
}