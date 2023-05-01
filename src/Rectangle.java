public class Rectangle implements Shape{
    private int shortSide;
    private int longSide;

    public Rectangle(int shortSide, int longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    @Override
    public double calculateArea() {
        return this.shortSide * this.longSide;
    }
}
