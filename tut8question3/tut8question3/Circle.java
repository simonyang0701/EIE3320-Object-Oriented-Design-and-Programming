package tut8question3;

import java.util.Scanner;

public class Circle extends Shape {
	private float radius;
	Circle()
	{readShape();}

	public Circle(float r) {
		radius = r;
	}
	public void readShape()
	{
		System.out.println("Please input the radius:");
		Scanner input1 = new Scanner(System.in);
		float radius = input1.nextFloat();
		this.radius = radius;
	}
	public void computeArea()
	{
		area=(float) (Math.PI*radius*radius);
	}
	public float getArea()
	{
		return area;
	}
	public float getPerimeter()
	{
		return perimeter;
	}
	public void computePerimeter()
	{
		perimeter=(float)(Math.PI*2*radius);
	}
	public void displayShape()
	{
		computeArea();
		computePerimeter();
		System.out.println("Area of circle = "+area);
		System.out.println("Perimeter of circle = "+perimeter);
	}

	@Override
	public void readShape(char shape) {
		// TODO Auto-generated method stub
		
	}
	
}
