/* 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor de X: ");
        double x = terminal.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = terminal.nextDouble();

        double resultadoPotencia = Math.pow(x, y);
        double resultadoExp = Math.exp(x);
        double resultadoLn = Math.log(x);

        System.out.println(x + " elevado a " + y + " sera igual a " + resultadoPotencia);
        System.out.println("O valor de exp(" + x + ") sera " + resultadoExp);
        System.out.println("O valor de ln(" + y + ") sera " + resultadoLn);
    }
}