
/**
 * Abstract class Shape - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Shape implements Drawable
{
    // instance variables - replace the example below with your own
    protected float area;
    protected float perimeter;
     // To read the shape information from users
     abstract public String readShape();
     // To compute the shape’s area
     abstract public void computeArea();
     // To computer the shape’s perimeter
     abstract public void computePerimeter();
     // To display the area and perimeter of the shape
     abstract public void displayShape();
     //To draw the shape
     abstract public void draw();
}
