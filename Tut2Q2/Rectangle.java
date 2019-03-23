
/**
 * Write a description of class Rectangle here.
 * Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
 * A no-arg constructor that creates a default rectangle.
 * A constructor that creates a rectangle with the specified width and height.
 * A method named getArea() that returns the area of this rectangle.
 * A method named getPerimeter() that returns the perimeter.
 * @author 13102841d
 * @version (2017/9/25)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double width;
    private double height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        // initialise instance variables
        width = 1;
        height = 1;
    }
    public double setWidth(double getWidth)
    {
        width = getWidth;
        return width;
    }
    public double setHeight(double getHeight)
    {
        height = getHeight;
        return height;
    }
    /**
     * @return    the area of this rectangle
     */
    public double getArea()
    {
        // put your code here
        return width*height;
    }
    /**
     * @return    the perimeter of this rectangle
     */
    public double getPerimeter()
    {
        // put your code here
        return 2*(width+height);
    }
}
