import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.applet.*;
public class FigureApplet extends JApplet
{
	public FigureApplet()
	{
		add(new Input());
		setSize(400,300);
	}
	public class Input extends JPanel
	{
		JTextField choose = new JTextField();
        JTextField radius = new JTextField();
        JTextField length = new JTextField();
        JTextField width = new JTextField();
        JTextField area = new JTextField();
        JTextField perimeter = new JTextField();
        JButton submit = new JButton("get result");
        public Input()
        {
        	JPanel p1 = new JPanel();
        	this.setLayout(new GridLayout(7,2,5,5));
        	this.add(new JLabel("Choose shape: 's','r','c': "));
        	this.add(choose);
        	this.add(new JLabel("Input radius of circle: "));
        	this.add(radius);
        	this.add(new JLabel("Input length of retangle or squre'"));
            this.add(length);
            this.add(new JLabel("Input width of retangle'"));
            this.add(width);
            this.add(new JLabel("Area"));
            this.add(area);
            this.add(new JLabel("Perimeter"));
            this.add(perimeter);
            this.add(submit);
            submit.addActionListener(new Listener());
        }
        class Listener implements ActionListener
        {
        	
			public void actionPerformed(ActionEvent e) 
			{
				if(choose.getText().equals("c"))
				{
					float radius1 = Float.parseFloat(radius.getText());
					Circle c = new Circle(radius1);
					c.computeArea();
					c.computePerimeter();
					area.setText(""+c.getArea());
					perimeter.setText(""+c.getPerimeter());
				}
				else if(choose.getText().equals("r"))
				{
					float length1 = Float.parseFloat(length.getText());
					float width1 = Float.parseFloat(width.getText());
					Rectangle r = new Rectangle(length1,width1);
					r.computeArea();
					r.computePerimeter();
					area.setText(""+r.getArea());
					perimeter.setText(""+r.getPerimeter());
				}
				else if(choose.getText().equals("s"))
				{
					float length2 = Float.parseFloat(length.getText());
					Square s = new Square(length2);
					s.computeArea();
					s.computePerimeter();
					area.setText(""+s.getArea());
					perimeter.setText(""+s.getPerimeter());
				}
			}
        }
	}
}