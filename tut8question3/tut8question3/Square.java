package tut8question3;


public class Square extends Shape {
	private float length;
	Square(){}
	Square(float l)
	{
		length=l;
	}
	public void readShape(char shape){}
	public void computeArea()
	{
		area=length*length;
	}
	public void computePerimeter()
	{
		perimeter=4*length;
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
		System.out.println("Area of square = "+area);
		System.out.println("Perimeter of square = "+perimeter);
	}
}

