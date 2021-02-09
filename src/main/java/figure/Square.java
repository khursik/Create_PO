package figure;

public class Square extends Figure{
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
