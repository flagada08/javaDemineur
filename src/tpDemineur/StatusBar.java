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
	 * 
	 */
	public StatusBar() {
		
		this.setLayout(new BorderLayout());
		this.setSize(100, 100);
		
		// Bar de status en bas de la fenêtre
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		this.add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setPreferredSize(new Dimension(this.getWidth(), 16));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		JLabel statusLabel = new JLabel("Status");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		
		this.setVisible(true);
	}
}
