import java.util.*;
class Quadritic
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Welcome to the Quadritic Equation Solver (QES)!!!!!!!");
        System.out.print ("Enter value of a(Enter positive(+) or negative(-) before the number): ");
        int a = sc.nextInt ();
        System.out.print ("Enter value of b(Enter positive(+) or negative(-) before the number): ");
        int b = sc.nextInt ();
        System.out.print ("Enter value of c(Enter positive(+) or negative(-) before the number): ");
        int c = sc.nextInt ();
        double y = -b+(int)Math.sqrt((b*b) - (4*a*c));
        double z = -b-(int)Math.sqrt((b*b) - (4*a*c));
        y=y/(2*a);
        z=z/(2*a);
        if (y==z)
        {
            System.out.println("The value of x is " + y);
        }
        else
        {
            System.out.println("The value of x is " + y + " OR " + z);
        }
        System.out.println("Do you want to solve a another equation?" + "\n");
        System.out.println("Enter 0 for 'No'");
        System.out.println("Enter 1 for 'Yes'" + "\n");
        System.out.print ("Enter your choice: ");
        int ny = sc.nextInt ();
        if (ny==0)
        {
            System.out.println ("\n\n\t\t\t" + ">>END OF PROGRAM<<");
        }
        else if (ny==1)
        {
            System.out.println ("\n\n\t\t\t" + ">>RESTART OF PROGRAM<<" + "\n\n");
            main ();
        }
        else
        {
            System.out.println ("Wrong Input.");
        }
    }
}
