import gui.FenetrePrincipale;

import javax.swing.*;

public class Application {
    public static void creerEtMontrerFenetrePrincipale() {
        JFrame frame = new JFrame("Zoom in et zoom out") ;
        frame.setContentPane(new FenetrePrincipale().getFenetre()) ;
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
        frame.pack() ;
        frame.setVisible(true) ;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creerEtMontrerFenetrePrincipale() ;
            }
        });
    }
}
