/* 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos. */

import java.util.Locale;
import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor de um angulo em graus: ");
        double anguloEmGraus = terminal.nextDouble();

        double anguloEmRadianos = Math.toRadians(anguloEmGraus);
        System.out.println("Valor do seno em radianos: " + Math.sin(anguloEmRadianos));
        System.out.println("Valor do cosseno em radianos: " + Math.cos(anguloEmRadianos));
        System.out.println("Valor da tangente em radianos: " + Math.tan(anguloEmRadianos));
        System.out.println("Valor da secante em radianos: " + (1 / Math.cos(anguloEmRadianos)));
    }
}