import java.util.Scanner;
public class Keith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int copy=n;
        int arr[] = new int[n];
        String num = Integer.toString(n);
        int count = num.length();
        for(int i=count-1; i>=0; i--) {
            arr[i] = copy%10;
            copy /= 10;
        }
        int sum=0;
        
    }
}