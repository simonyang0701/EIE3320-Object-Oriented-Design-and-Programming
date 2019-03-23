package tut8question3;

import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args)
	{
		boolean flag=true;
		char shape;
		while(flag=true)
		{
			menu();
			Scanner input = new Scanner(System.in);
			shape = input.next().trim().charAt(0);
			switch(shape)
			{
			case 'c':	Circle circle1 = new Circle();
						circle1.displayShape();
						flag=true;
						break;
			case 's':	System.out.println("Please input the length");
						Scanner input2 = new Scanner(System.in);
						float length1 = input2.nextFloat();
						Square square1 = new Square(length1);
						square1.displayShape();
						flag = true;
						break;
			case 'r':	System.out.println("please input the length and width");
						Scanner input3 = new Scanner(System.in);
						float length = input3.nextFloat();
						float width = input3.nextFloat();
						Rectangle rectangle1 = new Rectangle(length,width);
						rectangle1.displayShape();
						flag = true;
						break;
			case 'x':	flag = false;break;
			default:	flag = true;break;	
			}
		}
	}
	static void menu()
	{
		System.out.println("Please choose one the followings:");
		System.out.println("Press 'c' - Circle");
		System.out.println("Press 's' - Square");
		System.out.println("Press 'r' - rectangle");
		System.out.println("Press 'x' - EXIT");
	}
}
