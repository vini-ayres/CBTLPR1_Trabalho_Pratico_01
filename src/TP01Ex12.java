/* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o valor da altura de um cone: ");
        double altura = terminal.nextDouble();

        System.out.print("Digite o valor do raio da base de um cone: ");
        double raio = terminal.nextDouble();

        double volumeCone = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cone sera de " + volumeCone);
    }
}