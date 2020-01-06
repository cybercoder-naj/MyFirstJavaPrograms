import java.util.*;
class ArraySort {
    void input() {
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        char ch='y';
        do {
            System.out.print("Enter the element: ");
            int input = sc.nextInt();
            
            arr.add(input);
            System.out.print("Do you want to continue?[y/n]: ");
            String inp = sc.next();
            if(inp.length()>1) {
                System.out.println("1 character please!");
                continue;
            }
            else{
                ch = inp.charAt(0);
            }
            System.out.println();
        } while((ch=='y') || (ch=='Y'));
        
        System.out.println("Before Sorting:-\n" + arr);
        
        Collections.sort(arr);
        
        System.out.println("\nAfter Sorting:-\n" + arr);
    }
}