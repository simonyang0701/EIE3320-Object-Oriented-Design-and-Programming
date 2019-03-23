import java.util.Scanner;
/*
 * EIE3320 Tutorial 1 Question6
 * Author: Simon Yang
 */

public class tut1q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		int getCandies = m;
		int remainWrappers = m;
		while(remainWrappers>=n){
			int tmp = remainWrappers/n;
			getCandies+=tmp;
			remainWrappers = remainWrappers+tmp-tmp*n;
		}
		System.out.printf("n=%d; m=%d; No. of candies=%d",m,n,getCandies);

	}

}
