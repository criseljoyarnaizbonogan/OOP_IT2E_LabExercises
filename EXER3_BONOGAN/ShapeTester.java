public class ShapeTester {
    public static void main(String[] args) {
       
        Shape circle = new Circle("Red", 5.0f);
        Shape rectangle = new Rectangle("Blue", 6.0f, 4.0f);
        Shape square = new Square("Green", 3.0f);
        Shape triangle = new Triangle("Yellow", 5.0f, 4.0f, 3.0f, 4.0f, 5.0f);

        
        Shape[] shapes = {circle, rectangle, square, triangle};

        System.out.println("=== SHAPE INFORMATION ===\n");

        for (Shape s : shapes) {
            s.displayInfo();
        }
        System.out.println("Special: Square side change");
        ((Square) square).setSide(7.0f);
        square.displayInfo();
    }
}