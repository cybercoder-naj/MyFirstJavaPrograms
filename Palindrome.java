import java.util.*;
class Palindrome
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the number: ");
        int y = sc.nextInt ();
        int copy=y,s=0,t=0;
        while (copy!=0)
        {
            int a = copy%10;
            s = s*10+a;
            copy=copy/10;
        }
        int z = y+s;
        int copy2=z;
        while (copy2!=0)
        {
            int b=copy2%10;
            t=t*10+b;
            copy2=copy2/10;
        }
        if (z==t)
        {
            System.out.println (y + " is a paindrome number.");
        }
        else
        {
            System.out.println (y + " is not a palindrome number.");
        }
    }
}
