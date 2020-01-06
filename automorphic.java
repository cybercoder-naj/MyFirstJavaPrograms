import java.io.*;

class automorphic {
    String strinput;
    int input;
    void main() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        strinput = br.readLine();
        
        input = Integer.parseInt(strinput);
        
        int c = count_digit(input);
        boolean check = check_auto(input, c);
        if(check==true) {
            System.out.println("\nIt is an automorphic number");
        }
        else {
            System.out.println("\nIt is not an automorphic number");
        }
    }
    
    int count_digit(int inp) {
        int copy = inp;
        int count=0;
        while(copy!=0) {
            count++;
            copy /= 10;
        }
        return count;
    }
    
    boolean check_auto(int input, int count) {
        int power = input*input;
        int k = (int)Math.pow(10, count);
        int x = power%k;
        if(input==x) {
            return true;
        }
        else {
            return false;
        }
    }
}