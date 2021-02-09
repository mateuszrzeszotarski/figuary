public class Rectangle extends Shape{
    protected double width = 1.0d;
    protected double length = 1.0d;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String colour, boolean filled){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2*width + 2*length;
    }

    @Override
    public String toString() {
        return "Rectangle["+ super.toString() +
                "],width=" + width +
                ", length=" + length +
                ']';
    }
}
