import java.util.*;
class HCF_LCM
{
     void main ()
    {
        Scanner sc = new Scanner ( System.in );
        System.out.print ("Enter the 1st number: ");
        int m = sc.nextInt ();
        System.out.print ("Enter the 2nd number: ");
        int n = sc.nextInt();
        System.out.println("\n");
        int h = 1;
        int p = m * n;
        for (int i = 2; i < p; i++)
        {
            if ((m%i==0) &&(n%i==0))
            {
                h = i;
            }   
        }
        int l = p / h;
        System.out.println("The HCF of " + m + " and " + n + " is " + h + ".");
        System.out.println("The LCM of " + m + " and " + n + " is " + l + ".\n\n");
        System.out.println("Do you want to restart this program?\n");
        System.out.println("Enter 1 for Yes.");
        System.out.println("Enter 0 for No.\n");
        System.out.print("Enter your choice: ");
        int c = sc.nextInt ();
        if (c==1)
        {
            System.out.println("\n\n\n\t\t <<RESTART OF PROGRAM>> \n\n\n");
            main ();
        }
        else if (c==0)
        {
            System.out.println("\n\n\n\t\t <<END OF PROGRAM>>");
            System.exit(0);
        }
        else
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
    }
}
