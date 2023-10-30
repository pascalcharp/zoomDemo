package gui;

import domaine.Cossin;
import geometrie.Afficheur;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipale {

    Cossin cossin = new Cossin() ;

    private JPanel fenetre;
    private JPanel zoomPanel;
    private PanneaudeDessin cossinPanel ;
    private JButton zoomInButton;
    private JButton zoomOutButton;
    private JLabel zoomLabel;

    public FenetrePrincipale() {
        cossinPanel.setCossin(cossin) ;
        cossinPanel.setAfficheur(new Afficheur(cossin, cossinPanel)) ;
        zoomInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cossinPanel.zoomIn() ;
            }
        });
    }

    public JPanel getFenetre() {
        return fenetre ;
    }
}
