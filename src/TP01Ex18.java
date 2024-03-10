/* 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        double[] valoresProdutos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o valor do produto " + (i + 1) + ": ");
            valoresProdutos[i] = terminal.nextDouble();
        }

        double somatoriaProdutos = 0;
        for (double valor : valoresProdutos) {
            somatoriaProdutos += valor;
        }

        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = terminal.nextDouble();

        double troco = valorPagamento - somatoriaProdutos;

        System.out.println("Somatória dos produtos: R$ " + somatoriaProdutos);
        System.out.println("Valor do pagamento: R$ " + valorPagamento);
        System.out.println("Troco a ser devolvido: R$ " + troco);
    }
}