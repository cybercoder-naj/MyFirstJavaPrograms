import java.util.Scanner;
class Floyds_triangle
{
    void main()
    {
        int num=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
                