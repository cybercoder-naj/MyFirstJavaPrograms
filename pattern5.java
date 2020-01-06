package patterns;


class pattern5
{
    static void main()
    {
        /*
         *     1
         *    121
         *   12321
         *  1234321
         * 123454321
         */
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=(5-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            for(int q=(i-1); q>=1; q--)
            {
                System.out.print(q);
            }
            System.out.println();
        }
    }
}