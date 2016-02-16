package pack2;

/*
 * Created by raugust on 2/11/2016.
 */

import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] joe) {
        Point2D pt1 = new Point2D(6.2, 5.3);
        Point2D pt2 = new Point2D(5.2, 2.3);

        System.out.printf("Distance = %.2f%n", pt1.distance(pt2));
    }
}
