import figure.Circle;
import figure.Figure;
import figure.Rectangle;
import figure.Square;

public class Test {
    @org.junit.jupiter.api.Test
    void test1() {
        final Figure figure = new Rectangle(55, 100);
        final double square = figure.getSquare();
        org.junit.jupiter.api.Assertions.assertEquals(5500, square);
    }

    @org.junit.jupiter.api.Test
    void test2() {
        final Figure figure = new Circle(150);
        final double square = figure.getSquare();
        org.junit.jupiter.api.Assertions.assertTrue(square > 100);
    }
    @org.junit.jupiter.api.Test
    void test3() {
        final Figure figure = new Square(100);
        final double square = figure.getSquare();
        org.junit.jupiter.api.Assertions.assertEquals(10000, square);
    }
}
