/* 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor 1: ");
        double valor1 = terminal.nextDouble();
        
        System.out.print("Digite o valor 2: ");
        double valor2 = terminal.nextDouble();

        double mediaGeomretica = Math.sqrt(valor1 * valor2);

        System.out.println("A media geometrica dos valores sera: " + mediaGeomretica);
    }
}