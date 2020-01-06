import java.util.*;
class IMEI
{
         
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a 15 digit IMEI code : ");
        long n = sc.nextLong();
         
        String s = Long.toString(n); 
        int l = s.length();
         
        if(l!=15) 
            System.out.println("Wrong Input!");
        else
        {
            int d = 0, sum = 0;
            for(int i=15; i>=1; i--)
            {
                d = (int)(n%10);
                 
                if(i%2 == 0)
                {
                    d = 2*d; 
                }
 
                sum = sum + d;
                 
                n = n/10;
            }
             
             
            if(sum%10==0)
                System.out.println("Valid IMEI Code");
            else
                System.out.println("Invalid IMEI Code");
        }
    }
}
