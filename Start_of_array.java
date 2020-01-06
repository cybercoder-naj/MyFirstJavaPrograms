import java.util.*;
class Start_of_array
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the number of numbers you want: ");
        int len = sc.nextInt ();
        int a [] = new int[len];
        System.out.println ("Enter the numbers below:- " + "\n");
        for (int i=0;i<len;i++)
        {
            System.out.print ("Enter the number: ");
            a [i] = sc.nextInt ();
        }
        for (int i=0;i<len;i++)
        {
            if (i%2==0)
            {
                System.out.println (a [i]);
            }
        }
    }
}
