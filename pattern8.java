package patterns;


class pattern8 {
    void main() {
        int sum=0;
        for(int i=0;i<=10;i++) {
            int power = (int)Math.pow(2, i);
            sum=sum+power;
        }
        System.out.print(sum);
    }
}