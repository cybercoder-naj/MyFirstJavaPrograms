import java.util.*;
class Time_from_GMT
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the degree longitude WITHOUT °: ");
        double l = sc.nextDouble ();
        double copy = l;
        if (l<15 && l>=0)
        {
            l=(l*4);
        }
        else if (l==15)
        {
            l=((l*4)/60);
        }
        else if (l>15 && l<=180)
        {
            l=((l*4)/60);
        }
        else if (l<0 && l>180)
        {
            System.out.println ("Redo from start!");
            main ();
        }
        double d = l - copy;
        if (d>=0.5)
        {
            l = ((l+1)-d);
        }
        else
        {
            l=l-d;
        }
        System.out.println ("The time from GMT is " + l + ".");
    }
}
