/* Background Information about Star Program:
 * Name: Steven Sommer
 * Date: 4/3/22
 * Preconditions: Programming Stars.
 * Postconditions: Pop up window of Stars.
 */

import javax.swing.JFrame;

public class TestStars {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Stars of the Night Sky - Steven Sommer");
		
		Screen sc = new Screen();
		frame.add(sc);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		sc.animate();

	}

}
