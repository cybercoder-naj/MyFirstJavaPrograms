import java.util.Scanner;
public class SirTest2 {
    static Scanner sc = new Scanner(System.in);
    public static void Q1() {
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int copy=input, sum=0;
        while(copy!=0) {
            sum+=(copy%10);
            copy/=10;
        }
        if(input%sum==0) {
            System.out.println(input + " is a Harshad number!");
        }
        else {
            System.out.println(input + " is not a Harshad number!");
        }
    }
}
