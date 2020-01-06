package patterns;

class pattern9 {
    void main() {
        int count=9;
        for(int i=4;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}