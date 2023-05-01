import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(12);
        Cube cube = new Cube(8);
        Rectangle rectangle = new Rectangle(2,3);
        NoShape noShape = new NoShape();
        IAreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter(areaCalculator);
        List<Shape> shapes = List.of(
                circle,
                square,
                cube,
                rectangle);

        System.out.println(areaPrinter.json(shapes));
        System.out.println(areaPrinter.csv(shapes));
    }
}