package geometrie;

import domaine.Cossin;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Afficheur {

    private final Cossin cossin ;
    private final JPanel panel ;

    public Afficheur(Cossin cossinValue, JPanel panelValue) {
        cossin = cossinValue ;
        panel = panelValue ;
    }

    private void transformCoordinates(Graphics2D graphics) {
        graphics.translate(0.0, panel.getHeight()) ;
        graphics.scale(0.5 * panel.getWidth(), -0.5 * panel.getHeight()) ;
    }

    private void dessineLeCossin(Graphics2D graphics) {
        ArrayList<Point> points = cossin.getPoints() ;
        Path2D.Double forme = new Path2D.Double() ;

        boolean premier = true ;
        for (Point point: points) {
            if (premier) {
                forme.moveTo(point.getX(), point.getY()) ;
                premier = false ;
            }
            else {
                forme.lineTo(point.getX(), point.getY()) ;
            }
        }
        forme.closePath() ;
        graphics.setColor(Color.GREEN) ;
        graphics.draw(forme) ;
    }

    public void zoomIn(Graphics2D graphics) {
        graphics.scale(1.2, 1.2) ;
    }

    public void zoomOut(Graphics2D graphics) {
        graphics.scale(0.8, 0.8) ;
    }

    public void afficher(Graphics2D graphics) {
        transformCoordinates(graphics) ;
        dessineLeCossin(graphics) ;
    }
}
