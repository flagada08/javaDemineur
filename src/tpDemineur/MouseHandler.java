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
	
	public MouseHandler(int ligne, int colone) {
		this.ligne = ligne;
		this.colone = colone;
	}
	// déclenchement d'un évenement au click
	public void mouseClicked(MouseEvent e) {
		// TODO 
		// test si bouton gauche (1) marquer 1
		if(e.getButton() == 1) {
			ZoneDemineur.Mines[ligne][colone].setText("1");
        }
		// TODO 
		// test sinon si bouton droit (3) marquer 3
        else if(e.getButton() == 3) {
        	ZoneDemineur.Mines[ligne][colone].setText("3");
        }
	}
	/**
	 * 
	 * @author User-05
	 *
	 */
	static class exitApp implements ActionListener {
		/**
		 * 
		 */
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
	
}
