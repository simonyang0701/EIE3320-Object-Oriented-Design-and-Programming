
/**
 * Write a description of class Picture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Picture
{
    // instance variables - replace the example below with your own
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    public void addShape(Shape s)
    {
        shapes.add(s);
    }
    public void computeShape()
    {
        for(Shape s : shapes)
        {
            s.computeArea();
            s.computePerimeter();
        }
    };
    public void listAllShapeTypes()
    {
        for(Shape s : shapes)
        {
            s.displayShape();
        }
    };
    public void listSingleShapeType(String className)
    {
        for(Shape s : shapes)
        {
            if(s.readShape().equals(className)){
                s.displayShape();
            }
        }
    };
}
