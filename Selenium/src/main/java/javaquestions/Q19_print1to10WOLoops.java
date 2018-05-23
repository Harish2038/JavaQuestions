package javaquestions;

public class Q19_print1to10WOLoops {

	public static void recursion(int n) 
	{ 
		if(n <= 10) 
		{
			System.out.println(n); 
			recursion(n+1);   
		}
	}
	public static void main(String args[]) 
	{
		recursion(1); 
	}

}
