import java.util.*;
class Magic_cards
{
    static void main ()
    {
        Scanner sc = new Scanner (System.in);
        int a=1, count=1, result=0;
        int card1[][] = new int [8][7];
        int card2[][] = new int [8][7];
        int card4[][] = new int [8][7];
        int card8[][] = new int [7][7];
        int card16[][] = new int [7][7];
        int card32[][] = new int [7][6];
        int card64[][] = new int [7][6];
        System.out.println("Think of a number under hundred(100). . .\n\n");
        try
        {
            Thread.sleep(7000);                 
        } catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }    
        for (int q=0;q<7;q++)
        {
            for(int w=0;w<8;w++)
            {
                if(a<=100)
                {
                    card1[w][q] = a;
                    a += 2;
                }   
            }
        }
        a=2;
        count=1;
        for(int q=0;q<7;q++)
        {
            for(int w=0;w<8;w++)
            {
                if(a<=100)
                {
                    card2[w][q] = a;
                    if(count<2)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 3;
                        count=1;
                    }   
                }       
            }    
        }
        a=4;
        count=1;
        for(int q=0;q<7;q++)
        {
            for(int w=0;w<8;w++)
            {
                if(a<=100)
                {
                    card4[w][q] = a;
                    if(count<4)
                    {    
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 5;
                        count=1;
                    }   
                }    
            }    
        }
        a=4;
        count=1;
        for(int q=0;q<7;q++)
        {
            for(int w=0;w<8;w++)
            {
                if(a<=100)
                {
                    card4[w][q] = a;
                    if(count<4)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 5;
                        count=1;
                    }   
                }    
            }   
        }
        a=8;
        count=1;
        for(int q=0;q<7;q++)
        {
            for(int w=0;w<7;w++)
            {
                if(a<=100)
                {
                    card8[w][q] = a;
                    if(count<8)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 9;
                        count=1;
                    }   
                }    
            }
        }
        a=16;
        count=1;
        for(int q=0;q<6;q++)
        {
            for(int w=0;w<7;w++)
            {
                if(a<=100)
                {
                    card16[w][q] = a;
                    if(count<16)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 17;
                        count=1;
                    }   
                }    
            }   
        }
        a=32;
        count=1;
        for(int q=0;q<6;q++)
        {
            for(int w=0;w<7;w++)
            {
                if(a<=100)
                {
                    card32 [w][q] = a;
                    if(count<32)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 33;
                        count=1;
                    }   
                }   
            }   
        }
        a=64;
        count=1;
        for(int q=0;q<6;q++)
        {
            for(int w=0;w<7;w++)
            {
                if(a<=100)
                {
                    card64 [w][q] = a;
                    if(count<64)
                    {
                        a++;
                        count++;
                    }
                    else
                    {
                        a += 65;
                        count=1;
                    }   
                }   
            }   
        }
        
        
        
        
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(card1[i][j]!=0)
                System.out.print(card1[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c1 = sc.nextInt();
        if( c1==1 )
        {
            result += card1[0][0];
        }
        else if( (c1!=1) && (c1!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(card2[i][j]!=0)
                System.out.print(card2[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c2 = sc.nextInt();
        if( c2==1 )
        {
            result += card2[0][0];
        }
        else if( (c2!=1) && (c2!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(card4[i][j]!=0)
                System.out.print(card4[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c4 = sc.nextInt();
        if( c4==1 )
        {
            result += card4[0][0];
        }
        else if( (c4!=1) && (c4!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(card8[i][j]!=0)
                System.out.print(card8[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c8 = sc.nextInt();
        if( c8==1 )
        {
            result += card8[0][0];
        }
        else if( (c8!=1) && (c8!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(card16[i][j]!=0)
                System.out.print(card16[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c16 = sc.nextInt();
        if( c16==1 )
        {
            result += card16[0][0];
        }
        else if( (c16!=1) && (c16!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(card32[i][j]!=0)
                System.out.print(card32[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c32 = sc.nextInt();
        if( c32==1 )
        {
            result += card32[0][0];
        }
        else if( (c32!=1) && (c32!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        
        System.out.println("\n\n");
        
        
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(card64[i][j]!=0)
                System.out.print(card64[i][j] + "\t");   
            }
            System.out.println();    
        }
        System.out.println("\nIs your number in this card?\n");
        System.out.println("Enter 1 for 'Yes'.");
        System.out.println("Enter 0 for 'No'.\n");
        System.out.print("Enter your choice: ");
        int c64 = sc.nextInt();
        if( c64==1 )
        {
            result += card64[0][0];
        }
        else if( (c64!=1) && (c64!=0) )
        {
            System.out.println("Wrong Input!");
            System.exit(0);
        }
        
        System.out.println("\n\n\nYour number is " + result);

    }
    
}
