public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String colour, boolean filled){
        super(side, side, colour, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSize(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString();
    }
}
