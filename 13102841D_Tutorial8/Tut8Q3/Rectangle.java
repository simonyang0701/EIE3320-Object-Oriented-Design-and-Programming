
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Rectangle extends Shape implements Drawable{
    // instance variables - replace the example below with your own
    private float length;
    private float width;
    
    public Rectangle(){}
    public Rectangle(float length, float width){
        super();
        this.length = length;
        this.width = width;
    }
    
    public String readShape(){
        return this.getClass().getName();
    }
    
    public void computePerimeter(){
        this.perimeter =  2 * (length + width);
    }
    
    public void computeArea(){
        this.area =  length * width;
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
        System.out.println("Area of rectangle = "+area);
        System.out.println("Perimeter of rectangle = "+perimeter);
    }
    public void draw(){
        Canvas canvas = new Canvas("Shapes Demo",(int)width*3,(int)length*3);
        canvas.setVisible(true);
        java.awt.Shape rectangle = new java.awt.geom.Rectangle2D.Double(width, length, width, length);
        canvas.fill(rectangle);
    }
}
