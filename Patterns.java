import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of the pattern [1 to 9]: ");
        int input = sc.nextInt();
        
        switch(input) {
            case 1:
                System.out.print("Enter the number of rows: ");
                int num1 = sc.nextInt();
                Pattern1 p1 = new Pattern1(num1);
                p1.exe();
                break;
                
            case 2:
                System.out.print("Enter the number of rows: ");
                int num2 = sc.nextInt();
                Pattern2 p2 = new Pattern2(num2);
                p2.exe();
                break;
                
            case 3:
                System.out.print("Enter the number of \"|\": ");
                int num3 = sc.nextInt();
                Pattern3 p3 = new Pattern3(num3);
                p3.exe();
                break;
                
            case 4:
                System.out.print("Enter the number of \"|\": ");
                int num4 = sc.nextInt();
                Pattern4 p4 = new Pattern4(num4);
                p4.exe();
                break;
                
            case 5:
                System.out.print("Enter the number of rows: ");
                int num5 = sc.nextInt();
                Pattern5 p5 = new Pattern5(num5);
                p5.exe();
                break;
                
            case 6:
                System.out.print("Enter the number of rows: ");
                int num6 = sc.nextInt();
                Pattern6 p6 = new Pattern6(num6);
                p6.exe();
                break;
                
            case 7:
                System.out.print("Enter the number of rows: ");
                int num7 = sc.nextInt();
                Pattern7 p7 = new Pattern7(num7);
                p7.exe();
                break;
        }
    }
}

class Pattern1 {
    int n;
    Pattern1(int a) {
        n = a;
    }
    
    void exe() {
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern2 {
    int n;
    Pattern2(int a) {
        n=a;
    }
    
    void exe() {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

class Pattern3 {
    int n;
    Pattern3(int a) {
        n=a;
    }
    
    void exe() {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("|");
            }
            System.out.print(" ");
        }
    }
}

class Pattern4 {
    int n;
    Pattern4(int a) {
        n=a;
    }
    
    void exe() {
        for(int i=n; i>=1; i--)
        {
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern5 {
    int n;
    Pattern5(int a) {
        n=a;
    }
    
    void exe() {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            for(int q=(i-1); q>=1; q--)
            {
                System.out.print(q);
            }
            System.out.println();
        }
    }
}

class Pattern6 {
    int n;
    Pattern6(int a) {
        n=a;
    }
    
    void exe() {
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

class Pattern7 {
    int n;
    Pattern7(int a) {
        n=a;
    }
    
    void exe() {
        for(int i=1;i<=n;i++) {
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