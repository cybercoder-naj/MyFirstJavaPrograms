
/**
 * 
 */
public class unknown_number
{

    /**
     * 
     */
    protected void main()
    {
        boolean trufal = false;
        long num = 1;
        while (trufal == false) {
            if ((num % 2 == 1) && (num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1) && (num % 7 == 0) && (num % 8 == 1) && (num % 9 == 1) && (num % 10 == 1)) {
                System.out.println("Your number is " + num);
                trufal = true;
            }
            num = num + 1;
        }
    }
}
