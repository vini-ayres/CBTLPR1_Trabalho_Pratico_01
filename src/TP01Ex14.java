/* 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o valor do raio da esfera: ");
        double raio = terminal.nextDouble();

        System.out.print("Digite o valor da aresta do cubo perfeito: ");
        double aresta = terminal.nextDouble();

        double volumeLivre = Math.pow(aresta, 3) - ((4.0 / 3.0) * Math.PI * Math.pow(raio, 3));

        System.out.println("O valor do calculo do volume livre sera de " + volumeLivre);
    }
}