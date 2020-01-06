import java.util.*;
class magic_square
{
    Scanner sc = new Scanner (System.in);
    int n;
    void main ()
    {
        System.out.print ("Enter the sides of square: ");
        n = sc.nextInt ();
        int magic[][] = new int [n][n];
        int temp1,temp2;
        int k=1,i,j;
        if(n%2==0)
        {
            for (i=0;i<n;i++)
            {
                for (j=0;j<n;j++)
                {
                    magic[i][j]=k;
                    k++;
                }
            }
            j=n-1;
            for(i=0;i<n/2;i++)
            {
                temp1=magic[i][i];
                magic[i][i]=magic[j][j];
                magic[j][j]=temp1;
            
                temp1=magic[i][j];
                magic[i][j]=magic[j][i];
                magic[j][i]=temp1;
            
                j--;
            }
        }
        else
        {
            i=0;
            j=(int)n/2;
            k=1;
            while (k<=(n*n))
            {
                magic[i][j] = k += 1;
                i -= 1;
                j += 1;
                if ((i<0) && (j>n-1))
                {
                    i += 2;
                    j -= 1;
                }
                else if (i<0)
                i=n-1;
                else if(j>n-1)
                j=0;
                else if(magic[i][j] > 0)
                {
                    i += 2;
                    j -= 1;
                }
            }
        }
        for (int q=0;q<n;q++)
        {
            for(int o=0;o<n;o++)
            {
                System.out.print ( magic[q][o] + "\t");
            }
            System.out.println();
        }
    }
}