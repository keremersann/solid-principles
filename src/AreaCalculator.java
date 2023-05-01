import java.util.List;

public class AreaCalculator {

    public double calculateArea(List<Shape> shapes){
        double sum = 0;
        for (Shape shape: shapes) {
           sum += shape.calculateArea();
        }
        return sum;
    }
}
