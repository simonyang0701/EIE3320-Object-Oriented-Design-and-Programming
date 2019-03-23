
/**
 * Write a description of class ShapeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ShapeTester{
    public static void main(String[] args){
        do{
            System.out.println("*************************************");
            System.out.println("* Please choose one the followings: *");
            System.out.println("* Press 'c' - Circle                *");
            System.out.println("* Press 's' - Square                *"); 
            System.out.println("* Press 'r' - Rectangle             *"); 
            System.out.println("* Press 'x' - EXIT                  *");
            System.out.println("*************************************");
        
            Scanner scan = new Scanner(System.in);
        
            String s = scan.next();
            switch(s)
            {
                case "c": 
                System.out.println("Please input the radius: ");
                Scanner scan1 = new Scanner(System.in);
                float radius = scan1.nextFloat();
                Shape circle = new Circle(radius);
                displayShape(circle);
                break;
                
                case "s": 
                System.out.println("Please input the length: ");
                Scanner scan2 = new Scanner(System.in);
                float length = scan2.nextFloat();
                Shape square = new Square(length);
                displayShape(square);
                break;
                
                case "r":
                System.out.println("Please input the length: ");
                Scanner scan3 = new Scanner(System.in);
                float length1 = scan3.nextFloat();
                System.out.println("Please input the width: ");
                Scanner scan4 = new Scanner(System.in);
                float width = scan4.nextFloat();
                Shape rectangle = new Rectangle(length1,width);
                displayShape(rectangle);
                break;
              
                case "x": System.exit(0);break;
                default: System.out.println("Invalid command!");break;
            }
        }while(true);                          
    }
    public static void displayShape(Shape object){
        object.computeArea();
        object.computePerimeter();
        object.displayShape();
        object.draw();
    }
}