package figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return height * width;
    }
}
