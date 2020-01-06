import java.util.*;
class Kaprekar
{
Scanner sc; int n;

void input()
{sc=new Scanner(System.in);
System.out.print("Enter A Number: ");
n=sc.nextInt();
}

void calculate()
{int copy=(int)Math.pow(n,2);
int copy2=copy, cd=0;
while (copy2!=0)
{cd++;
copy2=copy2/10;
}
int a = (int)Math.pow(10,(int)cd/2);
int b = copy/a;
int c = copy%a;
display(b,c);
}

void display(int x,int y)
{if (x+y==n)
{
System.out.println(n + " is a kaprekar number.");
}
else
{
System.out.println(n + " is not a kaprekar number.");
}
}

void main ()
{input();
calculate();
}
}
