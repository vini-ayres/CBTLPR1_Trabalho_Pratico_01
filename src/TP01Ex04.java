/* 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a base do triangulo: ");
        double baseTriangulo = terminal.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        double alturaTriangulo = terminal.nextDouble();

        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("A area do triangulo sera: " + areaTriangulo);
    }
}
