package tut8question3;


public class Rectangle extends Shape {
	private float length;
	private float width;
	Rectangle(){}
	Rectangle(float l,float w)
	{
		length=l;
		width=w;
	}
	public void readShape(char shape)
	{
		
	}
	public void computeArea()
	{
		area=length*width;
	}
	public void computePerimeter()
	{
		perimeter=2*(length+width);
	}
	public float getArea()
	{
		return area;
	}
	public float getPerimeter()
	{
		return perimeter;
	}
	public void displayShape()
	{
		computeArea();
		computePerimeter();
		System.out.println("Area of rectangle = "+area);
		System.out.println("Perimeter of rectangle = "+perimeter);
	}
}

