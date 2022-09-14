import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("------------------------------------");
        System.out.println("-----------------IMC----------------");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("------------------------------------");

        double imc = Math.round(peso / (altura * 2));
        System.out.println(nome.toUpperCase() + " seu IMC é de: " + imc);

        if (imc < 18.5) {
            System.out.println("Peso Baixo");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal 'Adequado'");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III 'Mórbida'");
        }
    }
}
