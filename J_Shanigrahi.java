import java.util.*;
class J_Shanigrahi {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        String copy = String.valueOf(input);
        String rev = "";
        for (int i=copy.length()-1;i>=0;i--) {
            char num = copy.charAt(i);
            rev = rev + num;
        }
        System.out.println("\nThe reversed number is " +rev);
        
    }
}