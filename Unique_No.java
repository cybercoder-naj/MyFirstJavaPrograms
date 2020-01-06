import java.util.Scanner;
class Unique_No
{
    public static void main(String args[])
    {
        int n, flag=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a lower and upper limit");
        int m=in.nextInt();
        n=in.nextInt();
        int c;//acts a counter to count the number of digits.
        int no=n;//to store the orginal no. so as to help for repeated checking of digits of the number.
        for(int j=m;j<=n;j++) {
            for(int i=0;i<=9;i++)//since digits starts from 0 and ends in 9
            {
                n=no;//interchanging of numbers.
                c=0;//The counter has been intialised inside so that it gets reintialised every time.
                while(n>0)
                {
                    if((n%10)==i) {
                        c++;
                    }
                    n/=10;
                }
                if(c>1)/*to check if any repeated digits are present or not.
                It is done in a loop because the loop helps in repeated counting of nos.*/
                System.out.println(j);
                //Well it is a flag variable to check whether repeated digits are present in the number or not.
            }
            /*if(flag==1){
                System.out.println("It is a Unique number");
            }
            else {
                
            }*/
        }
    }
}