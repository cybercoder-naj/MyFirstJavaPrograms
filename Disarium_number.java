import java.util.*;
class Disarium_number
{
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int copy=num,copy2=num, result=0, countd=0;
        while(copy!=0)
        {
            countd++;
            copy /= 10;
        }
        int arr[] = new int [countd];
        for(int i=arr.length-1;i>=0;i--)
        {
            int r = copy2 % 10;
            arr[i] = r;
            copy2 /= 10;
        }
        
        for(int j=0;j<arr.length;j++)
        {
            int power = (int)Math.pow(arr[j],j+1);
            result += power;
        }
        
        if(result==num)
            System.out.println(num + " is a Disarium number.");
        else
            System.out.println(num + " is a not Disarium number.");
    }
}

        