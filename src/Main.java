import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(12);
        Cube cube = new Cube(8);
        Rectangle rectangle = new Rectangle(2,3);
        NoShape noShape = new NoShape();
        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        double sum = areaCalculator.calculateArea(List.of(
                circle,
                square,
                cube,
                rectangle,
                noShape));

        System.out.println(areaPrinter.json(sum));
        System.out.println(areaPrinter.csv(sum));
    }
}