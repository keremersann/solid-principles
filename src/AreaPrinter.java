import java.util.List;

public class AreaPrinter {
    private IAreaCalculator areaCalculator;
    public AreaPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }
    public AreaPrinter() {
    }

    public String json(List<Shape> shapes){
        return "{sum: %s}".formatted(areaCalculator.calculateArea(shapes));
    }
    public String csv(List<Shape> shapes){
        return "sum, %s".formatted(areaCalculator.calculateArea(shapes));
    }
}
