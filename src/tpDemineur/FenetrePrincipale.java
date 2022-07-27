package tpDemineur;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * 
 * @author User-05
 *
 */
public class FenetrePrincipale extends JFrame {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
// TODO Champs privés: Réferences d'objets contrôles, menus, …
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("Fichier");
	JMenuItem nouvelleGameButton = new JMenuItem("Nouvelle game");
	JMenuItem exitGameButton = new JMenuItem("Quitter le game");
	
	/**
	 * 
	 * @param string
	 */
	public FenetrePrincipale(String string) {
		/**
		 * Méthode swing pour quitter le programme lorsque la fenêtre
		 * application est fermée
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 /**
		  * Appel de la méthode initControles(); qui définit 
		  * l'état initial de la fenêtre
		  */
		 initControles();
		 
		this.setTitle("Mon Super Démineur");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		// Création et capture du contenu JPanel méthode
		JPanel zoneDemineur = (JPanel) this.getContentPane();
		// Appel objet zoneDemineur qui contient la grille du jeu
		zoneDemineur.add(new ZoneDemineur());
		// Appel objet StatusBar qui contient la bar de status
		JPanel statusBar = (JPanel) this.getContentPane();
		statusBar.add(new StatusBar());
	}

	private void initControles() {
		// TODO Définition de l'état initial des contrôles
		// TODO Positionnement des controles
		menuBar.add(menu);
		menu.add(nouvelleGameButton);
		menu.add(exitGameButton);
		
		this.setJMenuBar(menuBar);
	}
// TODO Gestion des événements
}
