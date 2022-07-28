package tpDemineur;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
		
		// JPanel de la bar de status, au sud de la fenêtre
		JPanel statusPanel = new JPanel();
		// Propriétés status bar
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(getWidth(), 25));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		// JLabel de la bar de status, avec alignement horizontal
		JLabel statusLabel = new JLabel("STATUS: " + " marked: 0");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		// Setter swing de visibilité au cas où
		setVisible(true);
	}
}
