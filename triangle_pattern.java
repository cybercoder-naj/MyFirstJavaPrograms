import java.util.*;
class triangle_pattern
{
    Scanner sc = new Scanner (System.in);
    int n;
    void input()
    {
        System.out.print("Enter number of lines of the pattern: ");
        n = sc.nextInt();
    }
    
    void pattern()
    {
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<(n-i);j++)
            {System.out.print(" ");
            }
            
            for(int k=0;k<=i;k++)
            {System.out.print("* ");
            }
         System.out.println(); 
        }
    }

    void main()
    {
        input();
        pattern();
    }
}