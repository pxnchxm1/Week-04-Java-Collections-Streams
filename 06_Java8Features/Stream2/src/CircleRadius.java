import java.util.function.*;

public class CircleRadius {
    public static void main(String[] args) {
        double radius = 10.0;
        Function<Double, Double> area = (r -> 3.14 * r * r);
        System.out.println("Area : " + area.apply(radius));
    }
}
