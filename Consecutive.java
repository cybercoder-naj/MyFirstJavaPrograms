import java.util.Scanner;
public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        int m=1, n=(input+1)/2;
        while(m<n) {
            int sum =0;
            for(int i=m;i<=n;i++) {
                sum += i;
                if (sum==input) {
                    for (int j=m;j<=i;j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    break;
                }
                if(sum>input) {
                    break;
                }
            }
            m++;
        }
    }   
}