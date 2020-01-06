package patterns;


import java.util.*;
class HollowTrianglePattern {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++) {
                if((i==1) || (k==1) || (k==(2*i-1))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
}