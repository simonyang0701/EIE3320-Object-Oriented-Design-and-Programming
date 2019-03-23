import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * EIE3320 Tutorial 1 Question5
 * Author: Simon Yang
 */

public class tut1q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month(January = 1):");
		int month = input.nextInt();
		List<Integer> monthList = new ArrayList<Integer>();
		for(int i=1;i<13;i++){
			monthList.add(i);
		}
		if(monthList.contains(month)){
			String monthName = "";
			switch(month){
			case 1: monthName = "January";break;
			case 2: monthName = "February";break;
			case 3: monthName = "March";break;
			case 4: monthName = "April";break;
			case 5: monthName = "May";break;
			case 6: monthName = "June";break;
			case 7: monthName = "July";break;
			case 8: monthName = "August";break;
			case 9: monthName = "September";break;
			case 10: monthName = "October";break;
			case 11: monthName = "November";break;
			case 12: monthName = "December";break;
			}
			System.out.printf("%s has %d days",monthName,daysInMonth(month));
		}
		else{
			System.out.print("Please enter right Month No. such as 1,2,3...");
		}
		

	}
	public static int daysInMonth(int month){
		switch(month){
		case 1: return 31;
		case 2: return 28;
		case 3: return 31;
		case 4: return 30;
		case 5: return 31;
		case 6: return 30;
		case 7: return 31;
		case 8: return 31;
		case 9: return 30;
		case 10: return 31;
		case 11: return 30;
		case 12: return 31;
		default: return 0;
		}
	}

}
