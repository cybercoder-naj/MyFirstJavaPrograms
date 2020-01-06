import java.util.*;
public class Special {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2 digit number: ");
        int input = sc.nextInt();
        int copy=input,count=0;
        do {
            count++;
            copy/=10;
        } while(copy>0);
        copy=input;
        if(count!=2){
            System.out.println("Enter a 2-digit number!");
            main();
        }
        else {
            int first = copy/10;
            int second = copy%10;
            if(((first+second)+(first*second))==input) {
                System.out.println("Special 2-digit number");
            }
            else {
                System.out.println("Not a special 2-digit number");
            }
        }
    }
}