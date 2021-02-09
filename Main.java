import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Map;


public class Main {

    private static List<Rectangle> prostokaty;

    public static void main(String[] args) {

        prostokaty = new ArrayList<Rectangle>();
        prostokaty.add( new Rectangle(10, 10) );
        prostokaty.add( new Rectangle(15, 12) );
        prostokaty.add( new Rectangle(15, 30) );
        prostokaty.add( new Rectangle(33, 30) );
        prostokaty.add( new Rectangle(41, 5) );
        prostokaty.add( new Rectangle(32, 16) );
        prostokaty.add( new Rectangle(13, 3) );
        prostokaty.add( new Rectangle(3, 11) );
        prostokaty.add( new Rectangle(10, 30) );
        prostokaty.add( new Rectangle(20, 32) );
        prostokaty.add( new Rectangle(11, 22) );
        prostokaty.add( new Rectangle(40, 12) );

        List<Rectangle> zadanieA = prostokaty.stream()
                .filter( rect->rect.getArea()<rect.getPerimeter() )
                .collect(Collectors.toList());
        List<Rectangle> zadanieB = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getArea))
                .collect(Collectors.toList());
        List<Rectangle> zadanieC = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getPerimeter).reversed())
                .collect(Collectors.toList());
        double zadanieD = prostokaty.stream()
                .mapToDouble(Rectangle::getPerimeter).average().orElse(Double.NaN);
        double zadanieE = prostokaty.stream()
                .mapToDouble(Rectangle::getArea).sum();

        Map<Double, Rectangle> mapa = prostokaty.stream()
                .collect(Collectors.toMap(Rectangle::getArea, Function.identity()));
    }
}