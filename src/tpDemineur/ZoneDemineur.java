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
	
	public static int nombreMines;
	
	int curentLigne = 0;
    int curentColone = 0;
	
	private double random;
	
	private boolean boolMine = false;
	
	public static JButton Mines[][];
	/**
	 * 
	 */
	public ZoneDemineur() {
		// Création de la grille awt avec remplissage JButton swing
		setLayout(new GridLayout(lignes, colones));
		Mines = new JButton[lignes][colones];
		for (int row = 0; row < lignes; row++) {
			curentLigne++;
			for (int col = 0; col < colones; col++) {
				Mines[row][col] = new JButton();
				
				ZoneMines(Mines[row][col]);
				
				Mines[row][col].addMouseListener(new MouseHandler(row, col));
				
				add(Mines[row][col]);
				
				curentColone++;
			}
		}
	}
	/**
	 * 
	 * @param button
	 * @return
	 */
    public boolean ZoneMines(JButton button)
    {
        random = Math.random()*100;
        if(random >= 80)
        {
            boolMine = true;
            nombreMines++;
        }
        else
        {
            boolMine = false;
        }
        return boolMine;
    }

}
