import java.util.*;
class twin_primes
{
    Scanner sc = new Scanner(System.in);
    long inp,f,s;
    boolean f2, s2;
    void input()
    {
        System.out.print("Enter a number: ");
        inp = sc.nextLong();
    }
    
    void method()
    {
        for(f=inp-1, s=inp+1;;f--,s++)
        {
            f2 = isPrime(f);
            s2 = isPrime(s);
            if(((f2==true) && (s2==true)) && ((inp-f)==(s-inp)))
                break;
        }
    }
    
    boolean isPrime (long num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    
    void display()
    {
        System.out.println("The Twin Primes of " + inp + " are " +f +" and " +s+ ".");
    }
    
    void main()
    {
        input();
        method();
        display();
    }
}