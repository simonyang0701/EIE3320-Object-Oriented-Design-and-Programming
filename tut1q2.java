import java.util.Scanner;
/*
 * EIE3320 Tutorial 1 Question2
 * Author: Simon Yang
 */

public class tut1q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int second = input.nextInt();
		System.out.printf("%d seconds is %d hours, %d minutes, and %d seconds",second,second/3600,(second-second/3600*3600)/60,second-second/3600*3600-(second-second/3600*3600)/60*60);
	}

}