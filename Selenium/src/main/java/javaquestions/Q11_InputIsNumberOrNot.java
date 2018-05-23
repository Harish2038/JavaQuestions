package javaquestions;
import java.util.Scanner;
public class Q11_InputIsNumberOrNot {
	public static void main(String[] args) {
		System.out.print("Enter Input number:");
		Scanner sc = new Scanner(System.in);
		String inputNumber = sc.nextLine();
		char[] array = inputNumber.toCharArray();
		int count=0;
		for (char eachChar : array) 
		{
			boolean digit = Character.isDigit(eachChar);
			if(digit==false) 
			{
				count=count+1;
				break;
			}
			else if(digit==true)
			{
				System.out.print("");
			}
		}
		if(count==0) 
			System.out.println("Given input is a number");
		else
			System.out.println("Givens input is not a number");

	}
}




/*for(int i=0;i<inputNumber.length(); i++) {
if(inputNumber.charAt(i)>=48 && inputNumber.charAt(i)<=57) {
	System.out.print("");
}
else
{
	count=count+1;
}
if(count==1) {
	System.out.print("Input is not digit");
	break;
}

}
if(count==0)
System.out.print("Input is digit");*/