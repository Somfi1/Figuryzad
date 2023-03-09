import figury.Figury;
import figury.Kolo;
import figury.Prostokat;
import figury.Trojkat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Figury> figury = new ArrayList<>();

        System.out.println("Podaj promien koła: ");
        double prom = in.nextDouble();
        figury.add(new Kolo(prom));

        System.out.println("Podaj a: ");
        double a = in.nextDouble();
        System.out.println("Podaj b: ");
        double b = in.nextDouble();
        figury.add(new Prostokat(a, b));

        System.out.println("Podaj a: ");
        double ta = in.nextDouble();
        System.out.println("Podaj b: ");
        double tb = in.nextDouble();
        figury.add(new Trojkat(ta, tb));

        for(Figury listapoka : figury){
            System.out.println(listapoka.getClass().getSimpleName() + " powierzchnia " +listapoka.getPerimeter() +" obwod "+ listapoka.getArea());
        }



    }
}