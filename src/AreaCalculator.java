import java.util.List;

public class AreaCalculator {

    public double calculateArea(List<Object> shapes){
        double sum = 0;
        for (Object o: shapes) {
            if(o instanceof Circle){
                sum += Math.PI * ((Circle) o).getRadius() * ((Circle) o).getRadius();
            }else if(o instanceof Square){
                sum += ((Square) o).getLength() * ((Square) o).getLength();
            }
        }
        return sum;
    }
}
