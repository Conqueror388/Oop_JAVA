import java.util.Scanner;

public class odd_even 
{
    public static void main(String[]args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        a=s.nextInt();
        if(a%2==0)
            System.out.println(a+" is a Even number");
        else
            System.out.println(a+" is a Odd number");
    }
}
