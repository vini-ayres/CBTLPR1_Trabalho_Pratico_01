/* 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o diametro da esfera: ");
        double diametroEsfera = terminal.nextDouble();

        double raioEsfera = diametroEsfera / 2;
        double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(raioEsfera, 3);

        System.out.println("O volume da esfera sera: " + volumeEsfera);
    }
}
