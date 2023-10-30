package domaine;

import geometrie.Point;

import java.util.ArrayList;
import java.util.List;

public class Cossin {
    private final int nombreDePoints = 3 ;
    private ArrayList<Point> points = new ArrayList<>(List.of(new Point(0, 0), new Point(0.4, 0), new Point(0, 0.6) )) ;

    public ArrayList<Point> getPoints() {return points ; }
}
