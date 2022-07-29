package tpDemineur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author G75
 * TODO Gestion des événements
 */
public class MouseHandler extends MouseAdapter {	
	
	public int ligne, colone;
	public static int count = 0;
	
	public MouseHandler(int ligne, int colone) {
		this.ligne = ligne;
		this.colone = colone;
	}
	// déclenchement d'un évenement au click
	public void mouseClicked(MouseEvent e) {
		// si event sur le bouton 1 passer la méthode setVisible à false
		if(e.getButton() == 1) {
			ZoneDemineur.Cases[ligne][colone].setVisible(false);
        }
		// sinon si event sur le bouton 3 marquer le JButton
        else if(e.getButton() == 3) {
        	count++;
        	ZoneDemineur.Cases[ligne][colone].setText("X");
        	
        }
	}
	/**
	 * 
	 * @author User-05
	 *
	 */
	static class newGame implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO
		}
	}
	static class exitGame implements ActionListener {
		/**
		 * 
		 */
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
	
}
