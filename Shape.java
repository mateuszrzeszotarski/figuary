public abstract class Shape {
    protected String colour = "red";
    protected boolean filled = true;

    public Shape(){ }
    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "Shape[" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                ']';
    }
}