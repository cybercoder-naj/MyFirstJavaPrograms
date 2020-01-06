import java.util.*;
public class vowel_consonent_digit_space
{
    Scanner sc = new Scanner (System.in);
    long vowel, consonent, digit, space;
    void input()
    {
        System.out.println("Enter a word, sentence of paragraph below:-");
        String input = sc.nextLine();
        check(input);
    }
    void check(String line)
    {
        for(int i=0;i<line.length();i++)
        {
            char ch = line.charAt(i);
            if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||
                (ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
                vowel++;
            else if(Character.isDigit(ch))
                digit++;
            else if(Character.isWhitespace(ch))
                space++;
            else
                consonent++;
        }
        display();
    }
    void display()
    {
        System.out.println("\nThe number vowels in the above word/sentence/paragraph is " 
                                + vowel + ".");
        System.out.println("The number consonent in the above word/sentence/paragraph is " 
                                + consonent + ".");
        System.out.println("The number digit in the above word/sentence/paragraph is " 
                                + digit + ".");
        System.out.println("The number blank space in the above word/sentence/paragraph is " 
                                + space + ".\n");
    }
    void reset()
    {
        System.out.println("\nDo you want to restart the program?\n");
        System.out.println("Enter 1 for 'Yes'");
        System.out.println("Enter 2 for 'No'\n");
        System.out.print("Enter your choice: ");
        int choice2 = sc.nextInt();
        if(choice2==1)
        {
            System.out.println("\n\n\n\t\t\t<<<RESTART OF PROGRAM>>>\n\n\n");
            vowel_consonent_digit_space.main(new String[1]);
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
    public static void main(String[] args)
    {
        vowel_consonent_digit_space obj = new vowel_consonent_digit_space();
        obj.input();
        obj.reset();
    }
}
