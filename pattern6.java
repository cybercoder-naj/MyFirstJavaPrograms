package patterns;

import java.util.Scanner;

class pattern6 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=((n+1)-i);k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}