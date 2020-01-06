package patterns;


class pattern7 {
    static void main(int x, int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            int power=(int)Math.pow(x, (i+1));
            int result=power/(n+1);
            sum += result;
        }
        System.out.print(sum);
    }
}