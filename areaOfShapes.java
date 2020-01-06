public class areaOfShapes {

    public areaOfShapes() {

    }

    public double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ar;
    }

    public double area(int a, int b, int h) {
        return 0.5*(a+b)*h;
    }

    public double area(double d1, double d2) {
        return 0.5*d1*d2;
    }

}