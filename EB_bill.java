import java.util.Scanner;
class billCalc
{
    int a;
    int bill;
    void dombill()
    {
        if (a <= 100) {
            bill = 0;
        } else if (a <= 200) {
            bill = (a- 100) * 2;
        } else if (a>=200 && a<= 500) {
            bill = (100 * 2) + (a - 200) * 4;
        } else {
            bill = (100 * 2) + (300 * 4) + (a - 500) * 6;
        }
        System.out.println("Amount to be paid: Rs."+bill);

    }
    void combill()
    {
        if (a <= 100) {
            bill = (a*2);
        } else if (a <= 200) {
            bill = (100 *2) +(a-100)*4;
        } else if (a>=200 && a<= 500) {
            bill = (100 * 2) + (100*4) + (a-200)*6;
        } else {
            bill = (100 * 2) + (100 * 4) +(300*6)+ (a - 500) * 7;
        }
        System.out.println("Amount to be paid: Rs."+bill);

    }

}



public class EB_bill
{
    public static void main (String[]args)
    {
        String b,na;
        int pr,cr,cn;
        Scanner s= new Scanner(System.in);
        billCalc obj=new billCalc();
        System.out.println("Enter your Name:");
        na=s.next();
        System.out.println("Enter the Consumer number:");
        cn=s.nextInt();
        System.out.println("Connection Type!!\n1.Domestic\n2.Commercial");
        System.out.println("Enter your Type:");
        b=s.next();
        if(b.equalsIgnoreCase("Domestic"))
        {
            System.out.println("Previous Reading:");
            pr=s.nextInt();
            System.out.println("Current Reading:");
            cr=s.nextInt();
            obj.a=cr-pr;
            obj.dombill();
        }
        else if(b.equalsIgnoreCase("Commercial"))
        {
            System.out.println("Previous Reading:");
            pr=s.nextInt();
            System.out.println("Current Reading:");
            cr=s.nextInt();
            obj.a=cr-pr;
            obj.combill();
        }
        else
            System.out.println("Invalid Choice");
    }
}