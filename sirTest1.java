import java.util.*;
class sirTest1 {
    Scanner sc = new Scanner(System.in);
    
    void One() {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int copy=n, count=0, sum=0;
        do {
            count++;
            copy/=10;
        }while(copy>0);
        copy=n;
        for(int i=1;i<=count;i++) {
            sum += copy%10;
            copy/=10;
        }
        
        System.out.println("The sum of digits are " + sum);
    }
    
    void Two() {
        int s=0;
        for(int i=1;i<=20;i++) {
            switch(i%2) {
                case 1:
                    s+=(int)Math.pow(2, i);
                    break;
                    
                case 0:
                    s-=(int)Math.pow(2, i);
                    break;
            }
        }
        System.out.println("\nThe sum of the series is " + s);
    }
    
    void Three() {
        for(int i=1;i<=5;i++) {
            for(int j=i;j>=1;j--) {
                System.out.print("|");
            }
            System.out.print(" ");
        }
    }
    
    void Four() {
        System.out.println();
        int max,min,sum=0;
        int arr[] = new int[20];
        for(int i=0;i<20;i++) {
            System.out.print("Enter integer at position " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        max = arr[0];
        min = arr[0];
        for(int i=1;i<20;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
            else if(arr[i]<min) {
                min=arr[i];
            }
        }
        
        System.out.print("Largest number="+max+"\nSmallest Number="+min+"\nSum of elements="+sum);
    }
    
    void Five() {
        String temp;
        Scanner sc = new Scanner(System.in);
        String [] names = new String[10];
        for(int i=0;i<10;i++) {
            System.out.print("Enter the word>>");
            names[i] = sc.next();
        }
        
        for(int i=0;i<10;i++) {
            for(int j=i+1;j<10;j++) {
                if(names[i].compareTo(names[j])<0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted array");
        for(String s: names) {
            System.out.println(s);
        }
    }
    
    void main() {
        One();
        Two();
        Three();
        Four();
    }
} 