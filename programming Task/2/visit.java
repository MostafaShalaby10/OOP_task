import java.util.Scanner;

class visit extends customer
{
    Scanner input = new Scanner(System.in);
    public double p;
    public double s;
    public void pruchases()
    {
        System.out.println("Please enter the cost of products");
         p = input.nextDouble();
    
        System.out.println("Please enter the cost of services");
         s = input.nextDouble();

    }
}
