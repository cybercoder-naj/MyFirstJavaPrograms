import java.util.*;

class star_pyramid
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        int copy = row;
        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=copy;k++)
                System.out.print(" ");
            copy--;
            for(int q=1;q<=((2*i)-1);q++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
