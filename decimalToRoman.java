import java.util.Scanner;

public class decimalToRoman {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int copy=input;
        StringBuffer ans = new StringBuffer();
        if(input>3999) {
            System.out.println("The range is between 1 to 3999");
        }
        else {
            while (copy>=1000) {
                ans.append("M");
                copy -= 1000;
            }
            while(copy>=900) {
                ans.append("CM");
                copy-=900;
            }
            while (copy>=500) {
                ans.append("D");
                copy-=500;
            }
            while (copy>=400) {
                ans.append("CD");
                copy-=400;
            }
            while (copy>=100) {
                ans.append("C");
                copy-=100;
            }

            while (copy>=90) {
                ans.append("XC");
                copy-=90;
            }
            while (copy>=50) {
                ans.append("L");
                copy-=50;
            }
            while (copy>=40) {
                ans.append("XL");
                copy-=40;
            }
            while (copy>=10) {
                ans.append("X");
                copy-=10;
            }
            while (copy>=9) {
                ans.append("IX");
                copy-=9;
            }
            while (copy>=5) {
                ans.append("V");
                copy-=5;
            }
            while (copy>=4) {
                ans.append("IV");
                copy-=4;
            }
            while (copy>=1) {
                ans.append("I");
                copy-=1;
            }

            System.out.println("The equivalent Roman numeral for" +input+ " is " + ans.toString());
        }
    }
}