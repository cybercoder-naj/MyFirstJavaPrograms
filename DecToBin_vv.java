import java.util.*;
class DecToBin_vv
{
    Scanner sc = new Scanner (System.in);
    void input()
    {
        System.out.println("What do you want to convert?\n");
        System.out.println("Enter 1 for Decimal to Binary.");
        System.out.println("Enter 2 for Binary to Decimal.\n");
        System.out.print("Enter you choice: ");
        long choice = sc.nextInt();
        if(choice==1)
            DectoBin();
        else if(choice==2)
            BintoDec();
        else 
            System.out.println("You numbskull! Go learn your numbers and come here");
    }
    void DectoBin()
    {
        System.out.print("\n\nEnter the decimal number: ");
        long dec1 = sc.nextLong();
        long copy = dec1;
        String bin1="";
        while (copy!=0)
        {
            long rem=copy%2;
            bin1=rem+bin1;
            copy /= 2;
        }
        System.out.println("The equivalent Binary number of " + dec1 + " is " + bin1 + ".");
    }
    void BintoDec() 
    {
        System.out.print("\n\nEnter the binary number: ");
        long bin2 = sc.nextInt();
        long copy2=bin2, copy3=bin2;
        while(copy2!=0)
        {
            long rem2=copy2%10;
            if(rem2<0 || rem2>1)
            {
                System.out.println("Trying to fool me!!Wait I'll call your mom! Intruder!");
                System.exit(0);
            }
            copy2 /= 10;
        }
        long power=0;
        long dec2=0;
        while(copy3!=0)
        {
            long rem3=copy3%10;
            long powerwith2 = (int)Math.pow(2,power);
            long term = rem3*powerwith2;
            dec2 += term;
            power++;
            copy3 /= 10;
        }
        System.out.println("The equivalent decimal number for " + bin2 + " is " + dec2 + ".");
    }
    void reset()
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
            System.out.println("You numbskull! Go learn your numbers and come here");
        }
    }
    void main()
    {
        input();
        reset();
    }
}