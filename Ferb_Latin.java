import java.util.Scanner;
class Ferb_Latin
{
    Scanner sc = new Scanner (System.in);
    void main()
    {
        System.out.print("Enter a word: ");
        String input = sc.next();
        String copy = input;
        int confirm=0;
        for (int i=0;i<copy.length();i++)
        {
            char space = copy.charAt(i);
            if(space==' ')
                confirm=1;
        }
        if (confirm==1)
        {
            System.out.println("\nYou fool! Can't you understand the simple meaning of 'word'");
            reset();
        }
        else
        {
            int length = input.length();
            String uno = input.substring(1,length);
            char abc = input.charAt(0);
            String result = "";
            if(uno.length()!=0) result = uno + "-" + abc + "erb";
            else result = abc + "erb";
            System.out.println ("\nThe equivalent Ferb Latin for " + input + " is " + result +".");
            reset();
        }
    }
    void reset()
    {
        System.out.println("Do you want to restart the program?\n");
        System.out.println("Enter 1 for 'Yes'");
        System.out.println("Enter 2 for 'No'\n");
        System.out.print("Enter your choice: ");
        int choice2 = sc.nextInt();
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
}
