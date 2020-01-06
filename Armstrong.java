import java.util.*;
class Armstrong
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the number to check wheather it is an Armstrong number or not: ");
        int n = sc.nextInt ();
        int v=n,s=0,r=0,c=0,countdigit=0,a=n;
        while (a!=0)
        {
            countdigit++;
            a=a/10;
        }
        while (v!=0)
        {
            r=v%10;
            s=s+(int)Math.pow(r,countdigit);
            v=(v/10);
        }
        if (n==s)
        {
            System.out.println (n + " is an Armstong Number");
        }
            else
            {
                System.out.println (n + " is not an Armstrong");
        }
    }
}
