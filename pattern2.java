package patterns;


class pattern2
{
    static void main()
    {
        /*
         *     1
         *    12
         *   123
         *  1234
         * 12345
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
            System.out.println();
        }
    }
}