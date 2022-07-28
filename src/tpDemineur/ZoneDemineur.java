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
	
//	JButton[][] buttons = new JButton[rows][cols];
	
	public static final int rows = 10;
	public static final int cols = 10;
	public static int numMines = 10;
	/**
	 * Déclaration des variables lignes, colones, etc.
	 */
	
	public ZoneDemineur() {
		// Remplissage de la grille awt avec JButton de swing
		this.setLayout(new GridLayout(rows, cols));
		for (int i = 0; i < (rows*cols); i++) {
			this.add(new JButton());
		}
	}
}
