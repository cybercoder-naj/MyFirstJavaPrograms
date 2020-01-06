import java.io.*;
public class unique {
    public static void main() throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter lower limit: ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Enter upper limit: ");
        int n = Integer.parseInt(br.readLine());
        if(m>=n) {
            System.out.print("Wrong input! Do you want to try again?[y/n]: ");
            String again = br.readLine();
            if(again.equalsIgnoreCase("y")) {
                System.out.println("\n");
                main();
            }
            else if(again.equalsIgnoreCase("n")) {
                System.out.println("\n\n\n\t\t\t\t<<<END OF PROGRAM>>>\n\n\n");
            }
            else {
                System.out.println("\n\n\n\t\t\t\t<<<PROGRAM IS CRASHING>>>\n\n\n");
                try {
                    Thread.sleep(3000);                 
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.exit(0);
            }
        }
        else {
            for(int i=m; i<=n; i++) {
                boolean isUnique = true;
                int c=0;
                for(int j=0;j<=9;j++) {
                    if(i%10==j) {
                        c++;
                    }
                    i/=10;
                    if(c>1) {
                        isUnique = false;
                    }
                }
                if(isUnique) {
                    System.out.println(i);
                }
            }
        }
    }
}