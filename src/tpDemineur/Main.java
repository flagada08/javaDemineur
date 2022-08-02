package tpDemineur;

//import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * 
 * @author User-05
 *
 */
public class Main {
	/**
	 * Classe principale main, point d'entrée de l'application qui 
	 * contient la méthode static main qui définit la méthode de 
	 * "look and feel" qui force l'utilisation du thread (tuyau) 
	 * courant
	 * @param args
	 */
	public static void main(String[] args) {
	// Try catch en cas d'erreur au chargement de l'application
	try {
		// Méthode Look and feel de swing UIManager
		 UIManager.setLookAndFeel(
		 UIManager.getCrossPlatformLookAndFeelClassName());
		 // Metal test
//		 JFrame.setDefaultLookAndFeelDecorated(true);
		 }
		 catch(Exception e) { }
		// Objet de la fenetre principale instanciée
		FenetrePrincipale frame = new FenetrePrincipale();
		frame.setVisible(true);
	}

}
