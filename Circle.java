public class Circle extends Shape{
    protected double radius = 1.0d;

    public Circle(){super();}
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String colour, boolean filled){
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[colour=" + super.getColour() + ",filled=" + super.isFilled() +
                "],radius=" + radius +
                ']';
    }
}
