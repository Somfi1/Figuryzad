package figury;

public class Prostokat implements Figury {
    private double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){
        return a*b;
    }
    public double getArea(){
        return a*2+b*2;
    }


}
