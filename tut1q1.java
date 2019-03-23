import java.util.Scanner;
/*
 * EIE3320 Tutorial 1 Question1
 * Author: Simon Yang
 */

public class tut1q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int count = input.nextInt();
		System.out.println("Hello: Chan Tai Man");
		for(int i=1;i<count+1;i++){
			System.out.print(" ");
			for(int j=i;j<count;j++){
				System.out.print("   ");
				}
			for(int j=i;j>0;j--){
				if(j<10){
					System.out.print(" "+j+" ");
				}					
				else{
					System.out.print(j+" ");
				}
			}
			for(int j=2;j<i+1;j++){
				if(j<10){
					System.out.print(" "+j+" ");
				}					
				else{
					System.out.print(j+" ");
				}
			}
			System.out.print("\n");
			}
		}	
}
