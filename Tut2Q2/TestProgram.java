
/**
 * Test program for class Rectangle
 *
 * @author 13102841d
 * @version (2017/9/25)
 */
public class TestProgram
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Rectangle rec1 = new Rectangle();
        double width = rec1.setWidth(4.0);
        double height = rec1.setHeight(40.0);
        System.out.println("The area of a rectangle with width "+width+" and height "+height+" is "+rec1.getArea());
        System.out.println("The perimeter of this rectangle is "+rec1.getPerimeter());
        Rectangle rec2 = new Rectangle();
        width = rec2.setWidth(3.5);
        height = rec2.setHeight(35.9);
        System.out.println("The area of a rectangle with width "+width+" and height "+height+" is "+rec2.getArea());
        System.out.println("The perimeter of this rectangle is "+rec2.getPerimeter());
        
    }
}
