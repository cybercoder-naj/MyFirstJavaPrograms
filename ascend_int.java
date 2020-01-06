import java.util.*;
class ascend_int {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        for(int i=0;i<=9;i++) {
            int copy = input;
            while (copy!=0) {
                int rem = copy%10;
                if(rem==i) {
                    System.out.print(i);
                }
                copy/=10;
            }
        }
        
        System.out.print("\n\n\n\nEnter a number: ");
        int input2 = sc.nextInt();
        for(int i=0;i<=9;i++) {
            int copy2 = input2;
            while (copy2!=0) {
                int rem2 = copy2%10;
                if(rem2==i) {
                    System.out.print(i);
                }
                copy2/=10;
            }
        }
    }
}