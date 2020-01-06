import java.util.Scanner;
class Romit_Calculator
{
    public static void main()
    {               
        System.out.println("WELCOME TO THE CALCULATOR!");
        while (true)
        {
            System.out.println();
            String input = " ";
            while(true)
            {
                System.out.println("Please enter input string");
                System.out.println("(Press 'H' for help, and 'E' to exit)");
                System.out.print(":- ");
                Scanner scan = new Scanner(System.in);
                input = scan.nextLine();
                if (input.equals("H"))
                help();
                else if (input.equals("E"))
                {
                    System.out.print("Thank you for using this Calculator");
                    return;
                }
                else break;
            }
            input = parseString(input);
            if (input.length() == 0)
            continue;
            boolean syntax = syntaxCheck(input);
            if (syntax == false)
            {
                System.out.println("Syntax error");
                continue;
            }
            double ans = calculate(input);
            System.out.println("Answer is " + ans);
        }
    }
    private static void help()
    {
        System.out.println("\n\n\n\n***HELP MENU***");
        System.out.println("You may use:");
        System.out.println();
        System.out.println("Integers");
        System.out.println("Double values (i.e. numbers with decimal points)");
        System.out.println("Negative numbers");
        System.out.println("Addition sign - '+'");
        System.out.println("Subtraction sign - '-'");
        System.out.println("Multiplication sign - 'x' or '*'");
        System.out.println("Division sign - '/'");
        System.out.println("Modulus sign - '%'");
        System.out.println("Exponent(power) sign - '^'");
        System.out.println("Open and closed brackets - '(' and ')'");
        System.out.println();
        System.out.println("Please use brackets a lot for clarity so you get desired results");
        System.out.println("Please note, ++ and -- do not exist");
        System.out.println("Please use + 1 and - 1 instead");
        System.out.println("There is no 'Of'");
        System.out.println("If you imply multiplication it will have the same precedence as multiplication");
        System.out.println("(Even though 'Of' has higher precedence)");
        System.out.println("Please do not make syntactical errors");
        System.out.println("They are a pain to debug");
        System.out.println("Try to refrain from using spaces\n\n\n");
    }
    private static String parseString(String input)
    {
        String ans = "";
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) != ' ')
            {
                ans = ans + input.charAt(i);
            }
            if (i < input.length() - 1)
            {
                if ((input.charAt(i) >= '0') && (input.charAt(i) <= '9') && (input.charAt(i + 1) == '('))
                {
                    ans = ans + '*';
                }                
                if ((input.charAt(i + 1) >= '0') && (input.charAt(i + 1) <= '9') && (input.charAt(i) == ')'))
                {
                    ans = ans + '*';
                }
                if ((input.charAt(i) >= '0') && (input.charAt(i) <= '9') && input.charAt(i + 1) == '-')
                {
                    ans = ans + '+';
                }
            }
        }
        return ans;
    }
    private static boolean syntaxCheck(String input)
    {
        boolean syntax = true;
        int opbrac = 0, clbrac = 0, points = 0;
        if (input.length() > 100) 
        {
            syntax = false;
            System.out.println("Too many characters");
        }
        for (int i = 1; i <= input.length(); i++)
        {
            char a = input.charAt(i - 1);
            if ((a < '0' || a > '9') && (a != '(') && (a != ')') && (a != '.') && (a != '+') && (a != '-') && (a != 'x') && (a != '*') && (a != '/') && (a != '%') && (a != '^'))
            {
                syntax = false;
                System.out.println("The character " + a + " may not be used"); 
            }
            if (a == '(')
            opbrac++;
            if (a == ')')
            clbrac++;
            if ((a >= '0' && a <= '9') || (a == '.'))
            {
                if (a == '.')
                points++;
            }
            else
            points = 0;
            if (points > 1)
            {
                syntax = false;
                System.out.println("A number may have only one decimal point");
                points = 0;
            }
            if (clbrac > opbrac)
            {
                syntax = false;
                System.out.println("Unopened closed bracket");
            }
            if (i != input.length())
            {
                if (a == '.')
                {
                    if ((input.charAt(i) < '0' || input.charAt(i) > '9') && (input.charAt(i) != '.'))
                    {
                        syntax = false;
                        System.out.println("Number may not end with a decimal point");
                    }
                }
                if (a == '(')
                {
                    a = input.charAt(i);
                    if ((a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
                    {
                        syntax = false;
                        System.out.println("Signs may not be placed directly inside an open bracket");
                    }
                    if (a == ')')
                    {
                        syntax = false;
                        System.out.println("Empty brackets");
                    }
                }
                a = input.charAt(i - 1);
                if ((a == '+') || (a == '-') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
                {
                    a = input.charAt(i);
                    if ((a == '+') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
                    {
                        syntax = false;
                        System.out.println("Signs may not be placed next to each other");
                    }
                }
            }
        }
        if (opbrac != clbrac)
        {
            syntax = false;
            if (opbrac < clbrac)
            System.out.println("Less open brackets than closed ones, equal number required");
            else
            System.out.println("Less closed brackets than open ones, equal number required");
        }
        char a = input.charAt(0);
        if ((a == ')') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
        {
            syntax = false;
            System.out.println("May not begin with sign except plus or minus");            
        }
        a = input.charAt(input.length() - 1);
        if ((a == '(') || (a == '+') || (a == '.') || (a == '-') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
        {
            syntax = false;
            System.out.println("May not end with sign or decimal point");
        }
        return syntax;
    }
    private static double calculate(String input)
    {
        boolean partisnum = false;
        while (partisnum == false)
        {
            input = parseNumber(input);
            int opbrac = -1, maxop = -1, clbrac = -1, maxcl = 1, finalop = -1, firstcl = input.length();
            int greatop = -1, greatcl = -1;
            boolean isnum = false, brackets = true;
            for (int i = 0; i < input.length(); i++)                                        //B
            {
                if (input.charAt(i) == '(')
                {
                    opbrac++;
                    maxop++;
                    if (maxop > greatop)
                    {
                        greatop = maxop;
                        finalop = i;
                    }
                }
                if (input.charAt(i) == ')')
                {
                    clbrac++;
                    if (maxop > greatcl)
                    {
                        greatcl = maxop;
                        firstcl = i;
                    }
                    maxop--;
                }      
            }
            finalop++;
            String sub = input.substring(finalop, firstcl);
            if (finalop == 0 && firstcl == input.length())
            brackets = false;
            int power = 0, multiply = 0, divide = 0, add = 0, mod = 0;
            double num1 = 0, num2 = 0, partans = 0;
            String replacement = sub;
            for (int i = 1; i <= sub.length(); i++)
            {
                if (sub.charAt(i - 1) == '^')
                power++;
                if (sub.charAt(i - 1) == '*' || sub.charAt(i - 1) == 'x')
                multiply++;
                if (sub.charAt(i - 1) == '/')
                divide++;
                if (sub.charAt(i - 1) == '+')
                add++;
                if (sub.charAt(i - 1) == '%')
                mod++;
            }
            for (int i = 1; i <= power; i++)                                       //E
            {
                char a = 0, b = 0;
                int j = 0, k = 0, x = 0;
                String newStr = "", newerStr = "", newStr2 = "", newerStr2 = "";
                while (a != '^')
                {
                    a = sub.charAt(j);
                    j++;
                    k++;
                    newStr = a + newStr;
                }
                a = 0;
                while (k > 0)
                {
                    a = newStr.charAt(j - k);
                    if ((a == '+') || (a == 'x') || (a == '*') || (a == '/') || (a == '%'))
                    break;
                    newerStr = a + newerStr;
                    k--;
                }
                newerStr = newerStr.substring(0, newerStr.length() - 1);
                num1 = Double.parseDouble(newerStr);
                int n = sub.length();
                while (n > 0)
                {
                    n--;
                    newerStr2 += sub.charAt(n);
                }
                a = 0;
                j = 0;
                while (a != '^' || x < power - i + 1)
                {
                    a = newerStr2.charAt(j);
                    newStr2 = a + newStr2;
                    j++;
                    if (a == '^')
                    x++;
                }
                j = 0;
                newerStr2 = "";
                while(j <= newStr2.length() - 1)
                {
                    a = newStr2.charAt(j);
                    if ((a == '+') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))
                    {
                        if (a == '^')
                        {
                            if (x == power - i)
                            break;
                            else
                            x--;
                        }
                        else
                        break;
                    }
                    newerStr2 += a;
                    j++;
                }
                newerStr2 = newerStr2.substring(1, newerStr2.length());
                num2 = Double.parseDouble(newerStr2);
                partans = Math.pow(num1, num2);
                sub = sub.replace(newerStr + "^" + newerStr2, Double.toString(partans));
            }
            for (int i = 1; i <= multiply + divide + mod; i++)                                       //M D %
            {
                char a = 0, b = 0, sgn = 0;
                int j = 0, k = 0, x = 0, realop = 0;
                String newStr = "", newerStr = "", newStr2 = "", newerStr2 = "";
                while (a != '*' && a != 'x' && a != '/' && a != '%')
                {
                    a = sub.charAt(j);
                    j++;
                    k++;
                    newStr = a + newStr;
                }
                sgn = a;
                realop = (sgn == '/' ? divide : (sgn == '%' ? mod : multiply));
                a = 0;
                while (k > 0)
                {
                    a = newStr.charAt(j - k);
                    if ((a == '+') || (a == '^'))
                    break;
                    newerStr = a + newerStr;
                    k--;
                }
                newerStr = newerStr.substring(0, newerStr.length() - 1);
                num1 = Double.parseDouble(newerStr);
                int n = sub.length();
                while (n > 0)
                {
                    n--;
                    newerStr2 += sub.charAt(n);
                }
                a = 0;
                j = 0;
                while (a != sgn || x < realop - i + 1)
                {
                    a = newerStr2.charAt(j);
                    newStr2 = a + newStr2;
                    j++;
                    if (a == sgn)
                    x++;
                }
                j = 0;
                newerStr2 = "";
                while(j <= newStr2.length() - 1)
                {
                    a = newStr2.charAt(j);
                    if ((a == '+') || (a == '^') || (a == '*') || (a == 'x') || (a == '/') || (a == '%'))
                    {
                        if (a == sgn)
                        {
                            if (x == realop - i)
                            break;
                            else
                            x--;
                        }
                        else
                        break;
                    }
                    newerStr2 += a;
                    j++;
                }
                newerStr2 = newerStr2.substring(1, newerStr2.length());
                num2 = Double.parseDouble(newerStr2);
                if (sgn == '*' || sgn == 'x')
                partans = num1 * num2;
                else if (sgn == '/')
                partans = num1 / num2;
                else if (sgn == '%')
                partans = num1 % num2;
                sub = sub.replace(newerStr + sgn + newerStr2, Double.toString(partans));
            }
            for (int i = 1; i <= add; i++)                                                  //A S
            {
                char a = 0, b = 0;
                int j = 0, k = 0, x = 0;
                String newStr = "", newerStr = "", newStr2 = "", newerStr2 = "";
                while (a != '+')
                {
                    a = sub.charAt(j);
                    j++;
                    k++;
                    newStr = a + newStr;
                }
                a = 0;
                while (k > 0)
                {
                    a = newStr.charAt(j - k);
                    if ((a == '*') || (a == 'x') || (a == '/') || (a == '^')|| (a == '%'))
                    break;
                    newerStr = a + newerStr;
                    k--;
                }
                newerStr = newerStr.substring(0, newerStr.length() - 1);
                num1 = Double.parseDouble(newerStr);
                int n = sub.length();
                while (n > 0)
                {
                    n--;
                    newerStr2 += sub.charAt(n);
                }
                a = 0;
                j = 0;
                while (a != '+' || x < add - i + 1)
                {
                    a = newerStr2.charAt(j);
                    newStr2 = a + newStr2;
                    j++;
                    if (a == '+')
                    x++;
                }
                j = 0;
                newerStr2 = "";
                while(j <= newStr2.length() - 1)
                {
                    a = newStr2.charAt(j);
                    if ((a == '+') || (a == '^') || (a == '*') || (a == 'x') || (a == '/') || (a == '%'))
                    {
                        if (a == '+')
                        {
                            if (x == add - i)
                            break;
                            else
                            x--;
                        }
                        else
                        break;
                    }
                    newerStr2 += a;
                    j++;
                }
                newerStr2 = newerStr2.substring(1, newerStr2.length());
                num2 = Double.parseDouble(newerStr2);
                partans = num1 + num2;
                sub = sub.replace(newerStr + "+" + newerStr2, Double.toString(partans));
            }
            if (brackets == true)
            input = input.replace("(" + replacement + ")", sub);
            else
            input = input.replace(replacement, sub);
            partisnum = true;
            for (int i = 0; i < input.length(); i++)
            {
                char a = input.charAt(i);
                if ((a == '+') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^') || (a == '(') || (a == ')'))
                partisnum = false;
            }
        }
        double ans = Double.parseDouble(input);
        return ans;
    }
    private static String parseNumber(String input)
    {
        String ans = "";
        boolean continuation = false;
        for (int i = 0; i < input.length(); i++)
        {
            if (continuation == true)
            {
                continuation = false;
                continue;
            }
            char a = input.charAt(i);
            if (i < input.length() - 1)
            {
                if (((a == '+') || (a == '-') || (a == 'x') || (a == '*') || (a == '/') || (a == '%') || (a == '^'))&& (input.charAt(i + 1) == '+'))
                continuation = true;
            }
            ans += a;
        }
        input = "";
        for (int i = 0; i < ans.length(); i++)
        {
            if (continuation == true)
            {
                continuation = false;
                continue;
            }
            char a = ans.charAt(i);
            if (i < ans.length() - 1)
            {
                if ((a == '-') && (ans.charAt(i + 1) == '-'))
                {
                    continuation = true;
                    continue;
                }
            }
            input += a;
        }
        return input;
    }
}