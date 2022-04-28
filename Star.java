/* Background Information about Star Program:
 * Name: Steven Sommer
 * Date: 4/3/22
 * Preconditions: Programming Stars.
 * Postconditions: Pop up window of Stars.
 */

import java.awt.Graphics;
import java.awt.Color;


public class Star {

	private int x;
	private int y;
	private double timer;
	private double speed;
	private double size;
	private double maxSize;
	private double maxSpeed;
	
	
	public Star(int _x, int _y) {
		x = _x;
		y = _y;
		
		maxSize = 8;
		maxSpeed = 0.03;
		
		timer = Math.random()*2*Math.PI;
		speed = Math.random()*maxSpeed;
	}
	
	public void drawStar(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x-(int)(size/2), y - (int)(size/2), (int)size,(int)size);
	}
	
	public void changeSize() {
		timer += speed;
		size = (int)(maxSize/2*Math.sin(timer)+ maxSize/2);
	}
}
