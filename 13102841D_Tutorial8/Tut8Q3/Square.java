
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape implements Drawable{
    // instance variables - replace the example below with your own
    private float length;
    
    public Square(){}
    public Square(float length){
        super();
        this.length = length;
    }
    
    public String readShape(){
        return this.getClass().getName();
    }
    
    public void computePerimeter(){
        this.perimeter =  4 * length;
    }
    
    public void computeArea(){
        this.area =  length * length;
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
        System.out.println("Area of square = "+area);
        System.out.println("Perimeter of square = "+perimeter);
    }
    public void draw(){
        Canvas canvas = new Canvas("Shapes Demo",(int)length*3,(int)length*3);
        canvas.setVisible(true);
        java.awt.Shape square = new java.awt.geom.Rectangle2D.Double(length, length, length, length);
        canvas.fill(square);
    }
}
