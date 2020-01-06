import java.util.*;
class magic_number{
    static Scanner sc = new Scanner(System.in);
    static void main() {
        System.out.print("Enter testing number: ");
        int input = sc.nextInt();
        int copy=input, sum=0;
        while(copy>9) {
            int s=0;
            sum=copy;
            while (sum>0) {
                s+=(sum%10);
                sum/=10;
            }
            copy=s;
        }
        if(copy==1) {
            System.out.println(input + " is a magic number!");
        }
        else {
            System.out.println(input + " is not a magic number!");
        }
        reset();
    }
    
    static void reset() {
        System.out.print("\n\nDo you want to restart the program?\n\nEnter 1 for \'Yes\'.\nEnter 2 for \'No\'.\n\nEnter your choice: ");
        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("\n\n\n\n\t\t\t\t<<<RESTART OF PROGRAM>>>\n\n\n\n");
            main();
        }
        else if(choice==2) {
            System.out.println("\n\n\n\n\t\t\t\t<<<END OF PROGRAM>>>\n\n\n\n");
            System.exit(0);
        }
        else {
            System.out.println("Go learn your numbers you numbskull!!");
        }
    }
}