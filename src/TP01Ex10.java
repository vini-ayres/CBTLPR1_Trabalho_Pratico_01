/* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o valor de uma temperatura em Celsius: ");
        double valorCelsius = terminal.nextDouble();

        double conversaoFahrenheit = (valorCelsius * 1.8) + 32;

        System.out.println("O valor de Celsius convertido em Fahrenheit sera de " + conversaoFahrenheit);
    }
}