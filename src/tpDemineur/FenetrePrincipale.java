package tpDemineur;

import javax.swing.JFrame;

public class FenetrePrincipale extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Champs privés: Réferences d'objets contrôles, menus...
	 */
	
	
	public FenetrePrincipale(String string) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 // Définition de l'état initial de la fenêtre,
		 initControles();
	}

	private void initControles() {
		this.setTitle("Mon Super Démineur");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
	}

}
