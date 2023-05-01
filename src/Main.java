import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(12);
        Cube cube = new Cube(8);
        AreaCalculator areaCalculator = new AreaCalculator();
        AreaPrinter areaPrinter = new AreaPrinter();
        double sum = areaCalculator.calculateArea(List.of(
                circle,
                square,
                cube));

        System.out.println(areaPrinter.json(sum));
        System.out.println(areaPrinter.csv(sum));
    }
}