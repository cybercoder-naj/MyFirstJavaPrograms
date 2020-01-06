import java.util.*;

class Multiplication_tables
{

    void main ()
    {
        
        Scanner sc = new Scanner ( System.in );
        
        System.out.print ( "Enter the number for the table: " );
        int a = sc.nextInt ();
        
        System.out.print ( "\nEnter the limitation for the table: ");
        int b = sc.nextInt ();
        
        System.out.println ();
        
        for ( int i = 1; i <= b; i++)
        {
            
            int p = a * i;
            
            System.out.println ( a + " x " + i + " = " + p );
            
        }
        
        System.out.println ( "\n\nDo you want to restart this program??\n" );
        
        System.out.println ( "Enter 1 for Yes." );
        System.out.println ( "Enter 0 for No.\n" );
        
        System.out.print ( "Enter your choice: ");
        int c = sc.nextInt ();
        
        switch (c)
        {
            
            case 1:
                System.out.println ( "\n\n\n\t\t\t<<RESTART OF PROGRAM>>\n\n\n" );
                main ();
                break;
                
            case 0:
                System.out.println ( "\n\n\n\t\t\t<<END OF PROGRAM>>" );
                break;
                
            default:
                System.out.println ( "Wrong input. . .");
                System.exit (0);
                break;
                
        }
        
    }
    
}
