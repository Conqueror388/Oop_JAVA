import java.util.Scanner;
public class Addition
{
	public static void main(String[]args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
	 	System.out.println("Enter the First Number:");
		a=s.nextInt();
		System.out.println("Enter the Second  Number:");
		b=s.nextInt();
		c=a+b;
		System.out.println("The Sum of the Two numbers:"+c);
	}
}
