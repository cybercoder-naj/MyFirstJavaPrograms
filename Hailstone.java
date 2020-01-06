import java.util.*;
class Hailstone
{Scanner sc = new Scanner (System.in);
int a, b, c;
void input()
{System.out.print("Enter starting number: ");
a = sc.nextInt();
System.out.print("\nHow many numbers you want in the series: ");
b = sc.nextInt();
}
void series()
{for(int i=1;i<=b;i++)
{if(i==b)
{System.out.println(a + ".\n\n\n");
}
else
{System.out.print(a + ", ");
}
if(a%2==0)
a=a/2;
else
a=(a*3)+1;
}
}
void reset()
{System.out.println("Do you want to restart the program?\n");
System.out.println("Enter 1 for Yes.");
System.out.println("Enter 0 for No.\n");
System.out.print("Enter your choice: ");
c = sc.nextInt();
if(c==1)
{System.out.println("\n\n\n\t\t\t<<RESTART OF PROGRAM>>\n\n\n");
main();
}
else if(c==0)
{System.out.println("\n\n\n\t\t\t<<END OF PROGRAM>>");
System.exit(999999);
}
else
{System.out.println("Wrong Input.");
System.exit(999999);
}
}
void main()
{input();
series();
}
}
