import java.util.*;
class Matrix_Addition
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows for the array: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns for th array: ");
        int col = sc.nextInt();
        double a[][] = new double [row][col];
        double b[][] = new double [row][col];
        double c[][] = new double [row][col];
        System.out.println("Taking input for 1st array[]\n\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter the number of Position ["+(i+1)+", "+(j+1)+"]: ");
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\n\nTaking input for 2nd array[]\n\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter the number of Position ["+(i+1)+", "+(j+1)+"]: ");
                b[i][j] = sc.nextDouble();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                c[i][j] = a[i][j] + b [i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a [i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(b [i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(c [i][j]+"\t");
            }
            System.out.println();
        }
    }
}