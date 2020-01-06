import java.util.*;
class conversion
{
    Scanner sc = new Scanner (System.in);    
    void main()
    {
         
        System.out.println("Want do you want to do? \n");

        System.out.println("Enter 1 for Binary to Decimal.");
        System.out.println("Enter 2 for Decimal to Binary.");
        System.out.println("Enter 3 for Decimal to Roman.");
        System.out.println("Enter 4 for Binary to Octal.\n");
        
        System.out.print("Enter your choice: ");
        int x = sc.nextInt();
        
        if(x==1)    
            BinarytoDecimal();
        else if(x==2)
            DecimaltoBinary();
        else if(x==3)
            DecimaltoRoman();
        else if(x==4)
            BinarytoOctal();
        else
            System.out.println ("Don't you know geenti(numbers)!!??"); 

        System.out.println("Do you want to reset this program???\n");

        System.out.println("Enter 0 for No.");
        System.out.println("Enter 1 for Yes. \n");

        System.out.print("Enter your choice: ");
        int a = sc.nextInt();
        if(a==0)
        {
             System.out.println("\n\n\n\t\t <<END OF PROGRAM>>");
        }
        else if(a==1)
        {
             System.out.println("\n\n\n\t\t <<RESTART OR PROGRAM>> \n\n\n");
             main();
        }
        else
        {
             System.out.println("Error");
             System.exit(0);
        }
    }
    void BinarytoDecimal ()
    {
        System.out.print ("Enter binary number: ");
        int btd = sc.nextInt ();
        int copy=btd,copy2=btd,d=0,i=0;
        copy=copy%10;
        if (copy==2 || copy==3 || copy==4 || copy==5 || copy==6 || copy==7 || copy==8 || copy==9)
        {
                System.out.println  ("Error!");
                System.exit(0);
        }
        
        while (copy2!=0)
        {
            int a = copy2%10;
            int b = (int)Math.pow(2,i);
            int c = a*b;
            d = d+c;
            copy2=copy2/10;
            i++;
        }
        System.out.println ("The equilavent decimal number is " + d);
    }
    void DecimaltoBinary ()
    {
        System.out.print ("Enter decimal to change to Binary: ");
        int dtb = sc.nextInt ();
        int copy = dtb;
        String str="",abc="";
        while (copy!=0)
        {
            int r = copy%2;
            str = str+r;
            copy=copy/2;
        }
        str = str + "0";
        for (int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            abc=abc+ch;
        }
        System.out.println (abc);
    }
    void DecimaltoRoman()
    {
        System.out.print("Enter Decimal to change to Roman: ");
        int roman = sc.nextInt();
        String decimalones[] = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String decimaltens[] = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String decimalhuns[] = {"C","CC","CCC","CD","D","DC","DCC","DCCC","MC"};
        int copy=roman, i=1;
        String result="";
        while(copy!=0)
        {
            int r=copy%10;
            if(i==1)
            result=result+decimalones[r-1];
            else if(i==2)
            result=decimaltens[r-1]+result;
            else if(i==3)
            result=decimalhuns[r-1]+result;
            copy=copy/10;
            i++;
        }
        System.out.println(result);
    }
    void BinarytoOctal()
    {
        System.out.print ( "Enter Binary number: " );
        int bto = sc.nextInt ();
        int copy = bto, copy2 = bto;
        String octal="";
        copy=copy%10;
        if (copy==2 || copy==3 || copy==4 || copy==5 || copy==6 || copy==7 || copy==8 || copy==9)
        {
            System.out.println  ("Error!");
            System.exit(0);
        }
        
        while(copy2!=0)
        {
            int r = copy2%1000;
            switch(r)
            {
                case 000:
                    octal="0"+octal;
                    break;
                    
                case 001:
                    octal="1"+octal;
                    break;
                    
                case 010:
                    octal="2"+octal;
                    break;
                    
                case 011:
                    octal="3"+octal;
                    break;
                    
                case 100:
                    octal="4"+octal;
                    break;
                    
                case 101:
                    octal="5"+octal;
                    break;
                    
                case 110:
                    octal="6"+octal;
                    break;
                    
                case 111:
                    octal="7"+octal;
                    break;
                    
            }
            copy2 /= 1000;
        }
        System.out.println("The Octal of Binary " + bto + " is " + octal + ".");
    }
    
}

                    