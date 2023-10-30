package gui;

import domaine.Cossin;
import geometrie.Afficheur;

import javax.swing.*;
import java.awt.*;

public class PanneaudeDessin extends JPanel {

    private Cossin cossin = null ;
    private Afficheur afficheur = null ;

    public void setCossin(Cossin cossinValue) {cossin = cossinValue ; }

    public void setAfficheur(Afficheur afficheurValue) {afficheur = afficheurValue ; }

    public void zoomIn() {
        repaint() ;
    }

    @Override
    protected  void paintComponent(Graphics g) {
        super.paintComponent(g) ;
        Graphics2D g2 = (Graphics2D) g ;

        if (cossin == null || afficheur == null) {
            return ;
        }

        afficheur.afficher(g2);


    }
}
