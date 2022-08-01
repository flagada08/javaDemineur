package tpDemineur;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
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
	JMenu fichierGameMenu = new JMenu("Fichier");
	ImageIcon exitIcon = new ImageIcon(getClass() .getResource("/exit.png"));
	Image tempExitIcon = exitIcon.getImage();
	Image exitIconResized = tempExitIcon.getScaledInstance(15, 15,  java.awt.Image.SCALE_SMOOTH);
	/**
	 * 
	 * @param string
	 */
	public FenetrePrincipale() {
		/**
		 * Méthode swing pour quitter le programme lorsque la fenêtre
		 * d'application est fermée
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 /**
		  * Appel de la méthode menuControles(); qui définit 
		  * l'état initial de la fenêtre
		  */
		menuControles();
		// propriétés de la fenêtre
		setTitle("Mon Super Démineur");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Création et capture du contenu JPanel méthode
		JPanel zoneDemineur = (JPanel) getContentPane();
		// New objet zoneDemineur qui contient la grille du jeu
		zoneDemineur.add(new ZoneDemineur());
		/**
		 * New objet StatusBar qui contient le composant bar de 
		 * status + ajout d'une contrainte pour ne pas écraser le 
		 * container de la zone d'affichage du démineur par 
		 * supperposition du JPanel
		 */
		zoneDemineur.add(new StatusBar(), BorderLayout.SOUTH);
	}
	/**
	 * 
	 */
	private void menuControles() {
		// TODO Définition de l'état initial des contrôles
		exitIcon = new ImageIcon(exitIconResized);
		JMenuItem nouvelleGameMenu = new JMenuItem("Nouvelle game");	
		JMenuItem exitGameMenu = new JMenuItem("Quitter le game", exitIcon);
		// Handler ajouté au JMenuItem exit
		exitGameMenu.addActionListener(new MouseHandler.exitGame());
		nouvelleGameMenu.addActionListener(new MouseHandler.newGame());
		// TODO Positionnement des controles
		menuBar.add(fichierGameMenu);
		fichierGameMenu.add(nouvelleGameMenu);
		fichierGameMenu.add(exitGameMenu);
		// affichage de la barre de menu
		setJMenuBar(menuBar);
	}
}
