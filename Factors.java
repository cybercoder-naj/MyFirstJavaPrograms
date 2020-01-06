import java.util.*;
class Factors
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the number for its factors: ");
        int n = sc.nextInt ();
        System.out.print("F(" + n + ")=");
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                if(i==n)
                System.out.print(i+".");
                else
                System.out.print(i+", ");
            }
        }
    }
}

