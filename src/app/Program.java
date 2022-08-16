package app;

import entidades.Triangulo;

import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(US);

        System.out.println("xxxxxx");
        double catetoOposto = sc.nextDouble();
        double hipotenusa = sc.nextDouble();
        double catetoAdjacente = sc.nextDouble();

        Triangulo t = new Triangulo(catetoOposto, hipotenusa, catetoAdjacente);
        System.out.println(t.tipoTriangulo());
        System.out.println(t.area());
        System.out.println(t.perimetro());
    }
}
