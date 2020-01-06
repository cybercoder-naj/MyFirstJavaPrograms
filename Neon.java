class Neon {
    void main(int n) {
        int power=n*n, sum=0;
        do {
            sum+=power%10;
            power/=10;
        } while(power>0);
        if(sum==n) {
            System.out.print("yes");
        }
        else {
            System.out.print("no");
        }
    }
}