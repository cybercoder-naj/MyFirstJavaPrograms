import java.util.*;
class Fibonacci
{
    Scanner sc;
    int a, b, c, n;
    void input ()
    {
        sc = new Scanner(System.in);
        System.out.println ("Enter the starting 1st and 2nd number:-");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("\n");
        System.out.println("Enter the limitation:-");
        n = sc.nextInt();
    }
    
    void series()
    {
        System.out.println();
        for (int i=1;i<=n;i++)
        {
            if (i==n)
            {
                System.out.print(a + ".");
            }
            else
            {
                System.out.print(a + ", ");
            }
            c=a+b;
            a=b;
            b=c;
        }
    }
    
    void reset()
    {
        System.out.println("\n\nDo you want to reset the program? \n");
        System.out.println("1 for Yes.");
        System.out.println("0 for No. \n");
        sc = new Scanner (System.in);
        System.out.print("Enter your choice: ");
        int z = sc.nextInt();
        if (z==1)
        {
            System.out.println("\n\n\t\t\t <<RESTART OF PROGRAM>> \n\n\n");
            main();
        }
        else if (z==0)
        {
            System.out.println("\n\n\t\t\t <<END OF PROGRAM>>");
        }
    }
    
    void main ()
    {
        input();
        series();
        reset();
    }
}
