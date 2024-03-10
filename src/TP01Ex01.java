/* 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área. */

/* Dupla: Bianca Fonseca e Vinicius Ayres */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a base do retangulo: ");
        double baseRetangulo = terminal.nextDouble();
        
        System.out.print("Digite a altura do retangulo: ");
        double alturaRetangulo = terminal.nextDouble();

        double areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("A area do retangulo sera: " + areaRetangulo);
    }
}
