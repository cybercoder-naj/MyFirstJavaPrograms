import java.util.*;

public class Ascending
{

    ArrayList<Integer> array = new ArrayList<Integer>();

    public Ascending()
    {
        array.add(2);
        array.add(4);
        array.add(6);
        array.add(8);
    }

    public static void main()
    {
        Ascending obj = new Ascending();
        obj.ascendingOrder();
    }

    public void ascendingOrder()
    {
        for(int loop=0;loop<=10;loop++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("The array is 2,4,6,8 ");
            System.out.println("Enter a number you wish to insert in the array");
            int input = sc.nextInt();
            int i,size = array.size(),last=size-1;

            for(i=0;i<size;i++)
            {
                if(input<array.get(i))
                {
                    array.add(i,input);
                    System.out.println("\nSorted array -:");
                    for(int y:array)
                    {
                        System.out.println(y);

                    }
                    break;
                }
            }

            if(input>array.get(last))
                {
                    array.add(size,input);
                    System.out.println("\nSorted array -:");

                    for(int q:array)
                    {
                        System.out.println(q);
                    }
                }
        }
    }
}