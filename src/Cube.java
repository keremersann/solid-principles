public class Cube implements Shape, ThreeDimensionalShape{
    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return this.sideLength * this.sideLength * 6;
    }

    @Override
    public double calculateVolume() {
        return this.sideLength * this.sideLength * this.sideLength;
    }
}
