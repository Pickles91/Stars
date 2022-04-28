/* Background Information about Star Program:
 * Name: Steven Sommer
 * Date: 4/3/22
 * Preconditions: Programming Stars.
 * Postconditions: Pop up window of Stars.
 */

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class Screen extends JPanel {
	
	Star[] myStars;
	int numStars;
	
	public Screen() {
		numStars = 500;
		myStars = new Star[numStars];
		
		for(int i = 0; i < numStars; i++) {
			myStars[i] = new Star((int)(Math.random()*1920),(int)(Math.random()*1080));
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(1920,1080);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0,0,1920,1080);
		
		for(int i = 0; i < numStars; i++) {
			myStars[i].drawStar(g);
		}
	}
	
	public void animate() {
		while (true) {
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			for(int i = 0; i < numStars; i++) {
				myStars[i].changeSize();
			}
			repaint();
		}
	}
}
