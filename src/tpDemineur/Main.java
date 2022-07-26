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
	 * Méthode statique main, point d'entrée de l'application qui 
	 * définit le "look and feel"
	 * @param args
	 */
	public static void main(String[] args) {
	try {
		// Look and feel swing UIManager
		 UIManager.setLookAndFeel(
		 UIManager.getCrossPlatformLookAndFeelClassName());
		 // Metal test
//		 JFrame.setDefaultLookAndFeelDecorated(true);
		 }
		 catch(Exception e) { }
		// Objet Deminuer instancié
		 new Demineur();
	}

}
