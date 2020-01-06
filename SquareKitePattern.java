import java.util.*;

class SquareKitePattern{

    void main (){
    
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        
        int i, j, k;
        
        for(i=1;i<=n;i++){
            
            for(j=4;j>=(i-1)*2-1;j--)
                System.out.print(" ");
            System.out.print(i);
            for(k=2;k<=(i-1)*n;k++)
                System.out.print(" ");
            if(i>1)
                System.out.print(i);
            System.out.println();
        }
        
        for(i=n-1;i>0;i--){
            
            for(j=4;j>=(i-1)*2-1;j--)
                System.out.print(" ");
            System.out.print(i);
            for(k=2;k<=(i-1)*n;k++)
                System.out.print(" ");
            if(i>1)
                System.out.print(i);
            System.out.println();
        }
        
    }
    
}
