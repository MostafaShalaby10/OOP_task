import java.util.Scanner;

class MyPoint 
{
    Scanner input = new Scanner(System.in);
    public double x ; 
    public double y;
//Empty constructor  
    MyPoint()
    {
        x=0;
        y=0;
    }
//non-empty constructor 
    MyPoint( double x , double y)
    {
        this.x=x;
        this.y=y;
    }  
    public double getx()
    {
        return x;
    }

    public double gety()
    {
        return y;
    }

    public void show()
    {
        System.out.println("x is = " + getx());
        System.out.println("y is = " + gety());
    }

    public void distance()
    {
        System.out.println("Enter the x point");
        double x1 = input.nextDouble();
    
        System.out.println("Enter the y point");
        double y1 = input.nextDouble();
        
        System.out.println("The point x is = " + (x - x1));
        System.out.println("The point y is = " + (y - y1));
    }
}
