package tpDemineur;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author User-05
 *
 */
public class ZoneDemineur extends JPanel {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;	
	/**
	 * Déclaration des variables lignes, colones, etc.
	 */
	private final int lignes = 10;
	private final int colones = 10;
	
	public static JButton Cases[][];
	/**
	 * 
	 */
	public ZoneDemineur() {
		// Création de la grille awt avec remplissage JButton swing
		setLayout(new GridLayout(lignes, colones));
		/**
		 * assigner les valeurs précédemment déclarées à notre 
		 * tableau en 2D
		 */
		Cases = new JButton[lignes][colones];
		for (int row = 0; row < lignes; row++) {			
			for (int col = 0; col < colones; col++) {
				// Remplissage des lignes*colones par des JButton
				Cases[row][col] = new JButton();
				// Ajout de mines dans notre tableau en 2D (voir méthode RandomMines)
				new RandomMines(Cases[row][col], false);
				// Ajout du listener sur la grille de JButton
				Cases[row][col].addMouseListener(new MouseHandler(row, col));
				// Ajout du tableau sur la grille
				this.add(Cases[row][col]);				
			}
		}
	}

}
