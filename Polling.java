import java.util.*;
class Polling
{
    void main ()
    {
        System.out.println ("Hello! You are welcome to the Polling Booth! \n");
        System.out.println ("To vote for :- ");
        System.out.println ("BJP, enter. 1 ");
        System.out.println ("CONGRESS, enter 2. ");
        System.out.println ("TMC, enter 3.");
        System.out.println ("Enter 0 to exit\n");
        Scanner sc = new Scanner (System.in);
        int BJP=0, CON=0, TMC=0, z=1; int total=0;
        while (z!=0)
        {
            System.out.print ("Enter your choice: ");
            int v = sc.nextInt ();
            switch (v)
            {
                case 0:
                {
                    break;
                }
                case 1:
                {
                    BJP++;
                    break;
                }
                case 2:
                {
                    CON++;
                    break;
                }
                case 3:
                {
                    TMC++;
                    break;
                }                 
                default:
                {
                    System.out.println ("YOU STUPID! CAN'T EVEN VOTE!");
                }
            }
            if (v==0)
            {
                    z=0;
            }
        }
        total=BJP+TMC+CON;
        System.out.println ("Total votes: " + total);
        System.out.println ("BJP=" + BJP);
        System.out.println ("Congress=" + CON);
        System.out.println ("TMC=" + TMC);
        if(BJP>CON && TMC<BJP)
        {
            System.out.println ("BJP won the Election");
        }
        else if (CON>BJP && TMC<CON)
        {
            System.out.println ("Congress won the Election");
        }
        else if (TMC>CON && BJP<TMC)
        {
            System.out.println ("TMC won the Election");
        }
        else if (BJP==CON && TMC<CON)
        {
            System.out.println ("BJP and Congress has a draw");
        }
        else if (BJP==TMC && BJP>CON)
        {
            System.out.println ("BJP and TMC has a draw");
        }
        else if (CON==TMC && BJP<TMC)
        {
            System.out.println ("Congress and TMC has a draw");
        }
        else if (BJP==CON && CON==TMC)
        {
            System.out.println ("All the parties has a draw");
        }
    }
}
