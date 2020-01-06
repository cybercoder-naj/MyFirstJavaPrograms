import java.util.*;
class Diamond_pattern
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
              
        //for upper half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k+" ");
            for(int g=i-1;g>=1;g--)
                System.out.print(g+" ");
            System.out.println();
        }
        
        //for lower half
        for(int i=n-1;i>=1;i--)
        {
            for(int j=n-i;j>=1;j--)
                System.out.print("\t");
            for(int k=1;k<=i;k++)
                System.out.print(k+"\t");
            for(int g=i-1;g>=1;g--)
                System.out.print(g+"\t");
            System.out.println();
        }
    }
}