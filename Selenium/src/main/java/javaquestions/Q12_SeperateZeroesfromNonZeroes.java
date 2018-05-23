package javaquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_SeperateZeroesfromNonZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int nextInt=0;
		int input[]= new int[8];
		for(int i=1;i<input.length;i++)
		{
			System.out.print("Enter digit "+ i +":");
			nextInt = sc.nextInt();
		}
		Arrays.sort(input);
		System.out.println(input);
	}
}
