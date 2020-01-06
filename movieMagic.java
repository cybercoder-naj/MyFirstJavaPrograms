import java.util.Scanner;
public class movieMagic {
    int year;
    String title;
    float rating;
    public movieMagic() {
        year=0;
        title="";
        rating= 0;
    }
    
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of release of the movie: ");
        year = sc.nextInt();
        System.out.print("Enter the name of the movie: ");
        title = sc.nextLine();
        System.out.print("Enter the rating[0.0 to 5.0]: ");
        rating = sc.nextFloat();
    }
    
    public void display() {
        System.out.println("\nThe title of the movie is " + title);
        if(rating>=0 && rating<=2) {
            System.out.println("Flop");
        } else if(rating>2 && rating<=3.4) {
            System.out.println("Semi-hit");
        } else if(rating>=3.5 && rating<=4.6) {
            System.out.println("Hit");
        } else if(rating>=4.6 && rating<=5) {
            System.out.println("Super Hit");
        }
    }
    
    public void main() {
        movieMagic ob = new movieMagic();
        ob.accept();
        ob.display();
    }
}