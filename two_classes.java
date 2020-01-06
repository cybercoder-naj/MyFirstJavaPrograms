import java.util.*;

public class two_classes extends constructor
{
    
    public void input ()
    {
        IDontKnow();
        Scanner sc = new Scanner ( System.in );
        
        System.out.print ( "Enter a number: ");
        num = sc.nextLong ();
        
    }
    
    public void main ()
    {
        
        input();
        
        System.out.println ( "\nThe factors of " + num + " are/is :- \n" );
            
        for ( int i=1; i<=num; i++)
        {
            
            if(num%i==0)
            {
                
                System.out.println ( i );
                
            }
            
        }
        
    }
    
}

class constructor
{

    public long num;
    public long fac;
    
    void IDontKnow ()
    {
        
        num=0;
        fac=0;
        
    }
    
}
