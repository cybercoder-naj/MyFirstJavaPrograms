package patterns;


class pattern4
{
    static void main()
    {
        /*
         * 12345
         *  1234
         *   123
         *    12
         *     1
         */
        for(int i=5; i>=1; i--)
        {
            for(int k=1; k<=(5-i); k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}