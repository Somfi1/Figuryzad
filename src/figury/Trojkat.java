package figury;

public class Trojkat implements Figury {
    private double a, b;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){
        Double h = Math.sqrt(Math.pow(a, 2)*Math.pow(b, 2));
        return a * h / 2;
    }
    public double getArea(){
        Double c = Math.sqrt(Math.pow(a, 2)*Math.pow(b, 2));
        return a + b + c;
    }
}
