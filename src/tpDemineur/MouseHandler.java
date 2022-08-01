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
	
	public static int countMarques = 0;
	public int ligne, colone;
	
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
		// sinon si event sur le bouton 3 marquer le JButton et compter le marquage
        else if(e.getButton() == 3) {
        	ZoneDemineur.Cases[ligne][colone].setText("X");
        	
        	if(ZoneDemineur.Cases[ligne][colone].getText().equals("X")) {
        		countMarques = countMarques+1;
        		System.out.println(countMarques);
        	}
        }
	}
	/**
	 * 
	 * @author User-05
	 *
	 */
	static class newGame implements ActionListener {
		/**
		 * 
		 */
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
