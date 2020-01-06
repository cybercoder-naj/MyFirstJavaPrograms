import java.util.*;
class linear_search
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        int flag = 0, pos=0, temp;
        System.out.print("How many elements do you want: ");
        int a = sc.nextInt();
        int arr[] = new int [a];
        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray Before Sorting :-\n");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n\nSorting. . .\n\n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    display(arr);
                }
            }
        }
        System.out.println("\nArray After Sorting :-\n");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.print("\nEnter the number you want to search for?: ");
        int search = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                flag=1;
                pos = i+1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Your number has been found at postion (" + pos + ").");
        else 
        System.out.println("Sorry! Your number has not been found!");
    }

    void display(int x[])
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+"\t");
        }
        System.out.println();
    }
}