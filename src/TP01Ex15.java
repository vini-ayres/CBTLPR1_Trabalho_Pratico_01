/* 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor da cotacao do dolar: ");
        double cotacao = terminal.nextDouble();

        System.out.print("Digite um valor em dolares: ");
        double valorDolar = terminal.nextDouble();

        double valorReal = cotacao * valorDolar;

        System.out.println("O valor correspondente em Reais será de " + valorReal);
    }
}