
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;

public class Circle extends Shape implements Drawable{

    private float radius;
    
    public Circle(){}
    public Circle(float radius){
        super();
        this.radius = radius;
    }
    
    public String readShape(){
        return this.getClass().getName();
    }
    
    public void computePerimeter(){
        this.perimeter =  2 * radius * (float)Math.PI;
    }
    
    public void computeArea(){
        this.area = radius * radius * (float)Math.PI;
    }
    public float getArea()
	{
		return area;
	}
	public float getPerimeter()
	{
		return perimeter;
	}
    public void displayShape(){
        System.out.println("Area of circle = "+area);
        System.out.println("Perimeter of circle = "+perimeter);
    };
    public void draw(){
        Canvas canvas = new Canvas("Shapes Demo",(int)radius*3,(int)radius*3);
        canvas.setVisible(true);
        java.awt.Shape circle = new java.awt.geom.Ellipse2D.Double(radius,radius,radius,radius);
        canvas.fill(circle);
    }
}
