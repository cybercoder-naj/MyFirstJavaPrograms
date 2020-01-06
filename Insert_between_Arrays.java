import java.util.*;
public class Insert_between_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(5);
        arr.add(8);
        arr.add(4);
        arr.add(24);
        arr.add(32);
        
        System.out.println("The default array is:-\n" + arr + "\nSize=" + arr.size());
        
        char ch='y';
        do {
            System.out.println("\n\nEnter the integer you want to insert along with the position ranging from 1 to " + arr.size());
            System.out.print("Integer=");
            int n = sc.nextInt();
            System.out.print("Postion[1 to " + arr.size() +"]: ");
            int pos = sc.nextInt();
            if(pos>arr.size() || pos<1) {
                System.out.println("\nThe position inputted will result in an ArrayOutOfBoundsException!\n");
                continue;
            }
            
            arr.add(pos-1,n);
            
            System.out.println("Current array is:-\n"+arr+"\nSize="+arr.size());
            
            System.out.print("\nDo you want to continue?[y/n]: ");
            String inp = sc.next();
            if(inp.length()>1) {
                System.out.println("1 character please!");
                continue;
            }
            else{
                ch = inp.charAt(0);
            }
            System.out.println();
        }while(ch=='y' || ch=='Y');
    }
}
