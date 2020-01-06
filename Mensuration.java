import java.util.*;
class Mensuration
{
    double pi = Math.PI;
    void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Which dimension do you want? 2D 0r 3D?\n");
        System.out.println ("Enter 2 for 2D.");
        System.out.println ("Enter 3 for 3D.\n");
        System.out.print ("Enter the Dimension: ");
        int d = sc.nextInt ();
        System.out.print ("\n\n");
        if (d==2)
        {
            System.out.println ("Which shape do you want?\n");
            System.out.println ("Enter 1 for Square.");
            System.out.println ("Enter 2 for Rectangle.");
            System.out.println ("Enter 3 for Triangle.");
            System.out.println ("Enter 4 for Circle.\n");
            System.out.print ("Enter your shape: ");
            int s = sc.nextInt ();
            System.out.print ("\n\n");
            if (s==1)
            {
                System.out.println ("What do you want to do?\n");
                System.out.println ("Enter 1 for Perimeter.");
                System.out.println ("Enter 2 for Area.\n");
                System.out.print ("Enter your choice: ");
                int ap = sc.nextInt ();
                System.out.print ("\n\n");
                if (ap==1)
                {
                    System.out.print ("Enter sides of Square: ");
                    double sos = sc.nextInt ();
                    System.out.println ("The Perimeter of Square is " + 4*sos + ".");
                }
                else if (ap==2)
                {
                    System.out.print ("Enter sides of Square: ");
                    double sos = sc.nextInt ();
                    System.out.println ("The Area of Square is " + sos*sos + ".");
                }
                else if (ap!=1 || ap!=2) 
                {
                    System.out.println ("Wrong Input.");
                }
            }
            else if (s==2)
            {
                System.out.println ("What do you want to do?\n");
                System.out.println ();
                System.out.println ("Enter 1 for Perimeter.");
                System.out.println ("Enter 2 for Area.");
                System.out.println ();
                System.out.print ("Enter your choice: ");
                int ap = sc.nextInt ();
                System.out.print ("\n\n");
                if (ap==1)
                {
                    System.out.print ("Enter length of Rectangle: ");
                    double l= sc.nextInt ();
                    System.out.print ("Enter breadth of Rectangle: ");
                    double b = sc.nextInt ();
                    System.out.println ("The Perimeter of Rectangle is " + (2*(l+b)) + ".");
                }
                else if (ap==2)
                {
                    System.out.print ("Enter length of Rectangle: ");
                    double l= sc.nextInt ();
                    System.out.print ("Enter breadth of Rectange: ");
                    double b = sc.nextInt ();
                    System.out.println ("The Area of Rectangle is " + (l*b) + ".");
                }
                else if (ap!=1 || ap!=2)
                {
                    System.out.println ("Wroung Input.");
                }
            }
            else if (s==3)
            {
                System.out.println ("What do you you want to do?\n");
                System.out.println ();
                System.out.println ("Enter 1 for Perimeter.");
                System.out.println ("Enter 2 for Area.");
                System.out.println ();
                System.out.print ("Enter your choice: ");
                int ap = sc.nextInt ();
                System.out.print ("\n\n");
                if (ap==1)
                {
                    System.out.print ("Enter the side A of Triangle: ");
                    double a = sc.nextInt ();
                    System.out.print ("Enter the side B of Triangle: ");
                    double b = sc.nextInt ();
                    System.out.print ("Enter the side C of Triangle: ");
                    double c = sc.nextInt ();
                    System.out.println ("The Perimeter of Triangle is " + (a+b+c) + ".");
                }
                else if (ap==2)
                {
                    System.out.print ("Enter the side A of Triangle: ");
                    double a = sc.nextInt ();
                    System.out.print ("Enter the side B of Triangle: ");
                    double b = sc.nextInt ();
                    System.out.print ("Enter the side C of Triangle: ");
                    double c = sc.nextInt ();
                    double sp= (a+b+c)/2;
                    double aot= (int)Math.pow(((s-a)*(s-b)*(s-c)),0.5);
                    System.out.println ("The Area of Triangle is " + aot + ".");
                }
                else if (ap!=1 || ap!=2)
                {
                    System.out.println ("Wrong Input.");
                }
            }
            else if (s==4)
            {
                System.out.println ("What do you want to do?\n");
                System.out.println ();
                System.out.println ("Enter 1 for the Circumference.");
                System.out.println ("Enter 2 for the Area.");
                System.out.println ();
                System.out.print ("Enter your choice: ");
                int ap = sc.nextInt ();
                System.out.print ("\n\n");
                if (ap==1)
                {
                    System.out.print ("Enter radius of circle: ");
                    double r = sc.nextInt();
                    System.out.println ("The Circumference of Circle is " + (2*pi*r) + ".");
                }
                else if (ap==2)
                {
                    System.out.print ("Enter radius of Circle: ");
                    double r = sc.nextInt ();
                    System.out.println ("The Area of Circle is " + (pi*r*r));
                }
                else if (ap!=1 || ap!=2)
                {
                    System.out.println ("Wrong Input.");
                }
            }
            else if (s!=1 || s!=2 || s!=3 || s!=4)
            {
                System.out.println ("Wrong Input.");
            }
        }
        else if (d==3)
        {
            System.out.println ("What shape do you want?\n" + "\n");
            System.out.println ("Enter 1 for Sphere.");
            System.out.println ("Enter 2 for Hemisphere.");
            System.out.println ("Enter 3 for Cuboid.");
            System.out.println ("Enter 4 for Cube." + "\n");
            System.out.print ("Enter your Shape: ");
            int s = sc.nextInt();
            System.out.print ("\n\n");
            if (s==1)
            {
                System.out.println ("What do you want to do?\n" + "\n");
                System.out.println ("Enter 1 for Total Suface Area.");
                System.out.println ("Enter 2 for Volume." + "\n");
                System.out.print ("Enter your choice: " + "\n");
                int tsav = sc.nextInt ();
                if (tsav==1)
                {
                    System.out.print ("Enter the radius: ");
                    double r = sc.nextInt ();
                    System.out.println ("Total Surface Area of Sphere is " + (4*pi*(r*r)) + ".");
                }
                else if (tsav==2)
                {
                    System.out.print ("Enter the radius: ");
                    double r = sc.nextInt ();
                    System.out.println ("Volume of Sphere is " + ((4/3)*pi*((r*r)*r)) + ".");
                }
                else if (tsav!=1 || tsav!=3)
                {
                    System.out.print ("Wrong Input.");
                }
            }
            else if (s==2)
            {
                System.out.println ("What do you want to do?\n" + "\n");
                System.out.println ("Enter 1 for Total Suface Area.");
                System.out.println ("Enter 2 for Volume." + "\n");
                System.out.print ("Enter your choice: ");
                int tsav = sc.nextInt ();
                System.out.print ("\n\n");
                if (tsav==1)
                {
                    System.out.print ("Enter the radius: ");
                    double r = sc.nextInt ();
                    System.out.println ("Total Surface Area of Hemisphere is " + (2*pi*(r*r)) + ".");
                }
                else if (tsav==2)
                {
                    System.out.print ("Enter the radius: ");
                    double r = sc.nextInt ();
                    System.out.println ("Volume of Hemisphere is " + ((2/3)*pi*((r*r)*r)) + ".");
                }
            }
            else if (s==3)
            {
                System.out.println ("What do you want to do?\n" + "\n");
                System.out.println ("Enter 1 for Total Suface Area.");
                System.out.println ("Enter 2 for Volume." + "\n");
                System.out.print ("Enter your choice: ");
                int tsav = sc.nextInt ();
                System.out.print ("\n\n");
                if (tsav==1)
                {
                    System.out.print ("Enter the length: ");
                    double l= sc.nextInt ();
                    System.out.print ("Enter the breadth: ");
                    double b = sc.nextInt ();
                    System.out.print ("Enter the height: ");
                    double h = sc.nextInt ();
                    System.out.println ("Total Surface Area of Cuboid is " + 2*((l*b)+(l*h)+(b*h)) + ".");
                }
                else if (tsav==2)
                {
                    System.out.print ("Enter the length: ");
                    double l= sc.nextInt ();
                    System.out.print ("Enter the breadth: ");
                    double b = sc.nextInt ();
                    System.out.print ("Enter the height: ");
                    double h = sc.nextDouble ();
                    System.out.println ("Volume of Cuboid is " + ((l*b)*h) + ".");
                }
                else if (tsav!=1 || tsav!=2)
                {
                    System.out.println ("Wrong Input.");
                }
            }
            else if (s==4)
            {
                System.out.println ("What do you want to do?\n" + "\n");
                System.out.println ("Enter 1 for Total Suface Area.");
                System.out.println ("Enter 2 for Volume." + "\n");
                System.out.print ("Enter your choice: ");
                int tsav = sc.nextInt ();
                System.out.print ("\n\n");
                if (tsav==1)
                {
                    System.out.print ("Enter sides of Cube: ");
                    double soc = sc.nextInt ();
                    System.out.println ("Total Surface Area of Cube is " + (6*(soc*soc)) + ".");
                }
                else if (tsav==2)
                {
                    System.out.print ("Enter sides of Cube: ");
                    double soc = sc.nextInt ();
                    System.out.println ("Volume of Cube is " + ((int)Math.pow(soc,3)) + ".");
                }
                else if (tsav!=1 || tsav!=2)
                {
                    System.out.println ("Wrong Input.");
                }
            }
            else if (s!=1 || s!=2 || s!=3 || s!=4)
            {
                System.out.println ("Wrong Input.");
            }
        }
        else if (d!=2 || d!=3)
        {
            System.out.println ("Wrong Input.");
        }
        System.out.println ("\n\nDo you you want to restart the program?\n");
        System.out.println ("Enter 0 for 'No'.");
        System.out.println ("Enter 1 for 'Yes'.\n");
        System.out.print ("Enter you choice: ");
        int rtp = sc.nextInt ();
        if (rtp==1)
        {
            System.out.println ("\n\n\t\t\t>>RESTART OF PROGRAM<<\n\n\t\t\t");
            main ();
        }
        else if (rtp==0)
        {
            System.out.println ("\n\n\t\t\t" + ">>END OF PROGRAM<<");
            try 
            {
                Thread.sleep(7000);                 
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
        else
        {
            System.out.println ("Wrong Input.");
        }
    }
}
