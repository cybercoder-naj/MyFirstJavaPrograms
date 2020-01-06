import java.util.Scanner;

public class Jeet {
    public void start() {
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements below:-");
        int c=5;
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        System.out.println("\nEnter the number and the position of your choice!\nEnter any letter to exit");
        int insert, position;
        while (true) {
            System.out.println("\nArray:-");
            for(int i=0; i<c ; i++) {
                if(i==0) System.out.print("[" + arr[i] + ", ");
                else if(i==(c-1)) System.out.print(arr[i] + "]");
                else System.out.print(arr[i]+", ");
            }
            try {
                System.out.print("\n\nEnter the number you want to insert: ");
                insert = sc.nextInt();
                System.out.print("Enter the position of the number you want to insert: ");
                position = sc.nextInt();
            } catch (Exception e) {
                break;
            }

            if(position<0 || position>=50) {
                System.out.println("\nPlease enter a valid position!\n");
                continue;
            }

            int[] temp = new int[c-position];
            int pos = position;
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[pos++];
            }
            arr[position] = insert;
            int a=0;
            for (int i = position+1; i <= c; i++) {
                if(a<temp.length)
                    arr[i] = temp[a];
                a++;
            }
            c++;
        }
        System.out.println("\nTHANK YOU!!");
    }
}