import java.util.*;
class String_Tokenizer
{
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a line:- ");
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line, " ,.!?;:");
        int num=st.countTokens();
        String array[] = new String[num];
        String str="";
        for(int i=0;i<num;i++)
        {
            array[i]=st.nextToken();
        }
        for(int i=0;i<num;i+=2)
        {
            String arr[] = new String[array[i].length()];
            for(int j=0;j<num;j++)
            {
                arr[i]=array[i];
            }
            for(int k=0;k<num;k++)
            {
                if(k%2!=0)
                {
                    char ch=array[k].charAt(k);
                    str=str+ch;
                }
            }
        }
    }
}