public class Square extends Rectangle {
    public Square(String color, float side) {
        super(color, side, side);
    }

    public void setSide(float side) {
        setLength(side);
        setWidth(side);
    }

    public float getSide() {
        return getLength(); 
    }
}