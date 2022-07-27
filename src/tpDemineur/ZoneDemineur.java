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
	int rows = 10;
	int cols = 10;
	int numMines = 10;
	
	public ZoneDemineur() {
		this.setLayout(new GridLayout(rows, cols));
		for (int i = 0; i < (rows*cols); i++) {
			this.add(new JButton());
		}
	}
}
