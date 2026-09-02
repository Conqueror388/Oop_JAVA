import java.util.Scanner;
public class Name
{
	public static void main(String[]args)
	{
		String a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Name:");
		a=s.next();
		System.out.println("Enter Second Name:");
		b=s.next();
		System.out.println(a+""+b);
	}
}