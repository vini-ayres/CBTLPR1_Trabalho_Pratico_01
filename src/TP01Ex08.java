/* 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um valor em milha maritima: ");
        double valorMilha = terminal.nextDouble();

        double coversaoKm = (valorMilha * 1000.0) / 1850.0;

        System.out.println("A coversao do valor " + valorMilha + " em km sera de: " + coversaoKm);
    }
}