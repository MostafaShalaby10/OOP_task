import java.util.Scanner;

class customer
{
    Scanner input = new Scanner(System.in);
    public int x;
    public int type()
    {
        System.out.println("Please Enter your type of membership");
        System.out.println("Enter 1 if you are Premium");
        System.out.println("Enter 2 if you are Gold");
        System.out.println("Enter 3 if you are Silver");
        System.out.println("Enter 4 if you aren't a membership");
         x = input.nextInt();
        return x;
    }   
}