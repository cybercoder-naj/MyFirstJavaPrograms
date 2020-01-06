import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nThese are the classes available:-\n\n1)areaOfShapes\n2)AbstractDemo\n3)Jeet\n4)sirTest2\n5)decimalToRoman\n6)Magic_Square\n\nEnter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                areaOfShapes areaOfShapes = new areaOfShapes();
                System.out.print("\n1)Area of Triangle\n2)Area of Trapezium\n3)Area of Rhombus\n\nEnter your choice: ");
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("\nEnter the sides of the Triangle:-");
                        System.out.print(">>");
                        double a = scanner.nextDouble();
                        System.out.print(">>");
                        double b = scanner.nextDouble();
                        System.out.print(">>");
                        double c = scanner.nextDouble();
                        System.out.println("Area of triangle=" + areaOfShapes.area(a,b,c));
                        break;

                    case 2:
                        System.out.print("\nEnter the first parallel side: ");
                        int a2 = scanner.nextInt();
                        System.out.print("\nEnter the second parallel side: ");
                        int b2 = scanner.nextInt();
                        System.out.print("\nEnter the height: ");
                        int h = scanner.nextInt();
                        System.out.println("Area of Trapezium=" + areaOfShapes.area(a2,b2,h));
                        break;

                    case 3:
                        System.out.println("\nEnter the 2 diagonals:-");
                        System.out.print(">>");
                        double d1 = scanner.nextDouble();
                        System.out.print(">>");
                        double d2 = scanner.nextDouble();
                        System.out.println("Area of Rhombus" + areaOfShapes.area(d1, d2));
                        break;

                    default:
                        System.out.println("\nWrong Input!");
                }
                break;

            case 2:
                FirstPhone obj = new SamsungNote8();
                obj.call();
                obj.clickPicture();
                obj.playMusic();
                obj.playGames();
                break;

            case 3:
                Jeet jeet = new Jeet();
                jeet.start();
                break;

            case 4:
                sirTest2 ob = new sirTest2();
                ob.start(new int[]{2,4,6,8});
                break;

            case 5:
                decimalToRoman dtr = new decimalToRoman();
                dtr.start();
                break;

            case 6:
                System.out.print("Enter the side of square: ");
                int side = scanner.nextInt();
                Magic_Square magicSquare = new Magic_Square(side);
                magicSquare.main();
                break;



            default:
                for(int i=1;i<=3;i++) {
                    System.out.println("Wrong Input!!!");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
        }
    }
}