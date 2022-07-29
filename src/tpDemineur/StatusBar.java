package tpDemineur;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * 
 * @author User-05
 *
 */
public class StatusBar extends JPanel {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Méthode de la bar de status
	 */
	public StatusBar() {
		// Objet AWT BroderLayout
		setLayout(new BorderLayout());	
		
		// déclarer un composant JPanel de la bar de status, au sud de la fenêtre
		JPanel statusPanel = new JPanel();
		// Border du composant status bar
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		// add ajoute un composant spécifique au container
		add(statusPanel, BorderLayout.SOUTH);
		// taille du composant
		statusPanel.setPreferredSize(new Dimension(getWidth(), 25));
		// modification du composant pour le position sur un axe horizontal
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		/**
		 * déclarer un JLabel afin d'assigner un string à la bar de status 
		 * + ajout de la variable défini dans ZoneDemineur pour afficher le 
		 * nombre de mines générées aléatoirement
		 */
		JLabel statusLabel = new JLabel("STATUS: " + ZoneDemineur.nombreMines + " marked: ");
		// implémentation du label précédemment déclaré, dans notre composant JPanel
		statusPanel.add(statusLabel);
		// Setter swing de visibilité au cas où
		setVisible(true);
	}
}
