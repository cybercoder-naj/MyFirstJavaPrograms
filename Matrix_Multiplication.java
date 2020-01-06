import java.util.*;
class Matrix_Multiplication
{
    Scanner sc = new Scanner (System.in);
    int row1, col1, row2, col2, array1[][], array2[][], array3[][];
    void input()
    {
        System.out.print("Enter rows for 1st matrix: ");
        row1 = sc.nextInt();
        System.out.print("Enter columns for 1st matrix: ");
        col1 = sc.nextInt();
        System.out.print("Enter rows for 2nd matrix: ");
        row2 = sc.nextInt();
        System.out.print("Enter columns for 2nd matrix: ");
        col2 = sc.nextInt();
        if(col1!=row2)
        {
            System.out.println("Wrong number of rows and columns!!");
        }
        else
        {
            array1 = new int [row1][col1];
            array2 = new int [row2][col2];
            System.out.println("\n\nTaking input for 1st matrix . . . ");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    System.out.print("Enter the numbers: ");
                    array1[i][j] = sc.nextInt();
                }
            }
            System.out.println("\n\nTaking input for 2nd matrix . . . ");
            for(int s=0;s<row2;s++)
            {
                for(int t=0;t<col2;t++)
                {
                    System.out.print("Enter the numbers: ");
                    array2[s][t] = sc.nextInt();
                }
            }
            calculate();
        }
    }
    void calculate()
    {
        array3 = new int [row1][col2];
        for(int k=0;k<row1;k++)
        {
            for(int q=0;q<col2;q++)
            {
                for(int o=0;o<row2;o++)
                {
                    array3[k][q] += array1[k][o] * array2[o][q];
                }
            }
        }
        display(array1, array2, array3);
    }
    void display(int matrix1[][], int matrix2[][], int answer[][])
    {
        System.out.println("Displaying 1st matrix . . . \n");
        for(int x=0;x<row1;x++)
        {
            for(int z=0;z<col1;z++)
            {
                System.out.print(matrix1[x][z] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n Displaying 2nd matrix . . . \n");
        for(int x=0;x<row2;x++)
        {
            for(int z=0;z<col2;z++)
            {
                System.out.print(matrix2[x][z] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n Displaying matrix after multiplying . . . \n");
        for(int x=0;x<row1;x++)
        {
            for(int z=0;z<col2;z++)
            {
                System.out.print(answer[x][z] + "\t");
            }
            System.out.print("\n");
        }
    }
    void  main()
    {
        input();
    }
}
