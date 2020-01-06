import java.util.*;
public class SortingSearch {
    Scanner sc = new Scanner(System.in);
    DynamicArray da = new DynamicArray();
        public void body() {
        char ch1='y';
        
        System.out.println("Welcome to Array searching and sorting!\nFirst, Lets build the array.");
        do {
            System.out.print("\n\nEnter 1 to add a number.\nEnter 2 to remove a number.\nEnter 3 to review the array.\n\nEnter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("\nEnter the number u want to insert: ");
                    da.insert(sc.nextInt());
                    break;
                    
                case 2:
                    System.out.print("\nEnter the number u want to remove: ");
                    da.remove(sc.nextInt());
                    break;
                    
                    
                case 3:
                    da.display();
                    break;
                 
                default:
                    System.out.println("Wrong input!");
                    try {
                        Thread.sleep(3000);
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.exit(0);
                    break;
            }
            
            System.out.print("\nDo you want to continue?[y/n]: ");
            String inp = sc.next();
            if(inp.length()>1) {
                System.out.println("1 character please!");
                continue;
            }
            else{
                ch1 = inp.charAt(0);
            }
        } while(ch1=='y' || ch1=='Y');
        
        System.out.print("The final array is:-");
        da.display();
        
        char ch2='y';
        System.out.println("\n\nWhat do you want to do?");
        
        do {
            System.out.print("\n\nEnter 1 to sort the array.\nEnter 2 to search the.\nEnter 3 to review the array.\n\nEnter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    da.sort();
                    break;
                    
                case 2:
                    System.out.print("Enter the number you want to search for?: ");
                    int n= da.search(sc.nextInt());
                    if(n==-1) {
                        System.out.println("\nNumber not found!");
                    }
                    else {
                        System.out.println("\nNumber found at index: " + n);
                    }
                    break;
                    
                case 3:
                    da.display();
                    break;
                 
                default:
                    System.out.println("Wrong input!");
                    try {
                        Thread.sleep(3000);
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.exit(0);
                    break;
            }
            System.out.print("\nDo you want to continue?[y/n]: ");
            String inp2 = sc.next();
            if(inp2.length()>1) {
                System.out.println("1 character please!");
                continue;
            }
            else{
                ch2 = inp2.charAt(0);
            }
        }while(ch2=='y' || ch2=='Y');
    }
    
    public void reset(){
        System.out.print("\n\nDo you want to edit the array?\n\nEnter 1 for Yes.\nEnter 2 for No.\n\nEnter your choice: ");
        int r_choice = sc.nextInt();
        if(r_choice==1) {
            main();
        }
        else if (r_choice==2) {
            return;
        }
        else {
            System.out.println("Wrong input!");
            try {
                Thread.sleep(3000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.exit(0);
        }
    }
    
    public void main() {
        body();
        reset();
    }
}

class DynamicArray {
    private ArrayList<Integer> list;
    public DynamicArray() {
        list = new ArrayList<>();
    }
    
    public void insert(int num) {
        list.add(num);
    }
    
    public void remove(int num) {
        list.remove(new Integer(num));
    }
    
    public void sort() {
        System.out.println("\nBefore Sorting:-\n" + list);
        Collections.sort(list);
        System.out.println("\nAfter Sorting:-\n" + list);
    }
    
    public int search(int num) {
        return list.indexOf(num);
    }
    
    public void display()  {
        System.out.println("\n\n" + list);
    }
}