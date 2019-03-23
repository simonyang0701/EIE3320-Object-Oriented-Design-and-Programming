import java.awt.Graphics; // import class Graphics

import javax.swing.JOptionPane;

import java.applet.Applet; // import applet package
public class AdditionApplet extends Applet {
	double sum; // sum of values entered by user
	public void init()
	{
		String firstNumber; // first string entered by user
		String secondNumber; // second string entered by user
		double number1; // first number to add
		double number2; // second number to add
		// Use the JOptionPane class to obtain the first and second number from user
		firstNumber = JOptionPane.showInputDialog("input the first number");
		secondNumber = JOptionPane.showInputDialog("input the second number");
		// Use the Double class to convert the numbers from String to double
		number1 = Double.parseDouble(firstNumber);
		number2 = Double.parseDouble(secondNumber);
		sum = number1 + number2;
	} // end method init
	// draw results in a rectangle on applet’s background
	public void paint( Graphics g)
	{
		super.paint( g );
		// draw rectangle starting from (15, 10) that is 270
		// pixels wide and 20 pixels tall
		g.drawRect( 15, 10, 270, 20 );
		// Use the drawstring() method of class Graphics to display
		// the results as a String at (25, 25)
		g.drawString( "The sum is " + sum, 25, 25);
	} // end method paint
} // end class AdditionApplet
