/* 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o valor do diametro de um circulo: ");
        double diametro = terminal.nextDouble();

        double raio = diametro / 2;
        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo sera de " + areaCirculo);
    }
}