package patterns;

public class Pattern1
{
    
    public void main() 
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}