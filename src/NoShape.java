import jdk.jshell.spi.ExecutionControl;

public class NoShape implements Shape{

    @Override
    public double calculateArea() {
        throw new IllegalStateException("Cannot calculate Area!");
    }
}
