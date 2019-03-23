/*
 * EIE3320 Tutorial 1 Question3
 * Author: Simon Yang
 */
public class tut1q3 {
	public static int getTriangularNumber(int n){
		int count = 100;
		System.out.printf("The first %d triangular numbers are: \n",count);
		for(int i=1;i<101;i++){
			int sum=i;
			for(int j=0;j<i;j++){
				sum+=j;
			}
			System.out.print(sum+" ");
			if(i%10==0){
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static void main(String[] args){
		getTriangularNumber(10);
	}
}
