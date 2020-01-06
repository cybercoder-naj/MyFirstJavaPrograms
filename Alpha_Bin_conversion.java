import java.util.*;
class Alpha_Bin_conversion
{
    static Scanner sc = new Scanner (System.in);
    static void input()
    {
        System.out.println("What do you want to convert?\n");
        System.out.println("Enter 1 for Alphabet to Binary.");
        System.out.println("Enter 2 for Binary to Alphabet.\n");
        System.out.print("Enter your choice: ");
        int choice1 = sc.nextInt();
        if(choice1==1)
            Alpha_Bin();
        else if(choice1==2)
            Bin_Alpha();
        else
            System.out.println("You numbskull! Go learn your numbers!!");
    }
    
    static void Alpha_Bin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter A Character: ");
        String st=sc.nextLine();
        if(st.length()!=1)
            System.out.println("Only one letter or character. Not more than that.");
        char ch=st.charAt(0);
        System.out.println("\nThe equivalent binary number of '" + ch + "' is " + Integer.toBinaryString(ch) + ".");
    }
    
    static void Bin_Alpha()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Binary Number: ");
        String st=sc.nextLine();
        System.out.println("\nThe equivalent alphabet of '" + st + "' is " + (char)Integer.parseInt(st,2) + ".");
    }
    
    static void reset()
    {
        System.out.println("\n\nDo you want to restart the program?\n");
        System.out.println("Enter 1 for Yes.");
        System.out.println("Enter 2 for No.\n");
        System.out.print("Enter you choice: ");
        long choice2 = sc.nextInt();
        if(choice2==1)
        {
            System.out.println("\n\n\n\t\t\t<<<RESTART OF PROGRAM>>>\n\n\n");
            main();
        }
        else if(choice2==2)
        {
            System.out.println("\n\n\n\t\t\t<<<END OF PROGRAM>>>\n\n\n");
        }
        else
        {
            System.out.println("You numbskull! Go learn your numbers");
        }
    }
    
    static void main()
    {
        input();
        reset();
    }
}
