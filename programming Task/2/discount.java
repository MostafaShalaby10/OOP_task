class discount extends visit
{
    public void discountt()
    {
        if (x==1) 
        {
            System.out.println("Your type is primum");
            System.out.println("The cost of services is = " + (s-s*0.2));
            System.out.println("The cost of products is = " + (p-p*0.1));
            
        }
        else if (x==2)
        {
            System.out.println("Your type is Gold");
            System.out.println("The cost of services is = " + (s-s*0.15));
            System.out.println("The cost of products is = " + (p-p*0.1));

        } 
        else if(x==3)
        {
            System.out.println("Your type is Silver");
            System.out.println("The cost of services is = " + (s-s*0.1));
            System.out.println("The cost of products is = " + (p-p*0.1));

        }
        else if (x==4)
        {
            System.out.println("You haven't membership");
            System.out.println("The cost of services is = " + (s));
            System.out.println("The cost of products is = " + (p));
        }
    }

}
