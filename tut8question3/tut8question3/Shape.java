package tut8question3;

public abstract class Shape {
	protected float area;
	protected float perimeter;
	public abstract void readShape(char shape);
	public abstract void computePerimeter();
	public abstract void computeArea();
	public abstract void displayShape();
}
