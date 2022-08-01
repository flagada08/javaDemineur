package tpDemineur;

import javax.swing.JButton;

public class RandomMines {

	public static int nombreMines;
	private static double random;
	/**
	 * 
	 * @param button
	 * @return
	 */
    public RandomMines(JButton button, boolean boolMine) {
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
    }
}
