import java.util.*;
public class Question7 {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for area of Triangle.\nEnter 2 for area of Trapezium.\nEnter 3 for area of Rhombus\n\nEnter your choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the 3 side of the triangle:-");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double ans =area(a,b,c);
                System.out.println("Area of Triangle=" + ans );
                break;
                
            case 2:
                System.out.println("Enter the length of the parallel sides and the height of the trapezium:-");
                int d = sc.nextInt();
                int e = sc.nextInt();
                int height = sc.nextInt();
                System.out.println("Area of Trapezium=" + area(d, e, height));
                break;
                
            case 3:
                System.out.println("Enter the length of the diagonal of the trapezium:-");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                System.out.println("Area of Trapezium=" + area(d1, d2) );
                break;
        }
    }
    
    double area(double a, double b, double c) {
        double s = (a+b+c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    }
    
    double area(int a, int b, int height) {
        return (1/2)*height*(a+b);
    }
    
    double area(double diagonal1, double diagonal2) {
        return (1/2)*diagonal1*diagonal2;
    }
}