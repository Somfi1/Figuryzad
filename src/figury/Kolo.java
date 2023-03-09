package figury;

public class Kolo implements Figury {
    private double prom;

    public Kolo(double prom) {
        this.prom = prom;
    }


    public double getArea(){
        return Math.PI*Math.pow(prom, 2);
    }
    public double getPerimeter(){
        return 2*Math.PI*prom;
    }

}
