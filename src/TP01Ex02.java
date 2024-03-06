/* 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a aresta do quadrado: ");
        double arestaQuadrado = terminal.nextDouble();

        double areaQuadrado = Math.pow(arestaQuadrado, 2);

        System.out.println("A area do quadrado sera: " + areaQuadrado);
    }
}
