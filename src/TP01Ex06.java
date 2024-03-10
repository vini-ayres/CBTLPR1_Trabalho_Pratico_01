/* 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor 1: ");
        double valor1 = terminal.nextDouble();
        
        System.out.print("Digite o valor 2: ");
        double valor2 = terminal.nextDouble();
        
        System.out.print("Digite o valor 3: ");
        double valor3 = terminal.nextDouble();
        
        System.out.print("Digite o valor 4: ");
        double valor4 = terminal.nextDouble();

        double mediaAritmetica = (valor1 + valor2 + valor3 + valor4) / 4.0;

        System.out.println("A media aritmetica dos valores sera: " + mediaAritmetica);
    }
}