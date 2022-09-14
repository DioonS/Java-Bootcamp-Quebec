import java.util.Scanner;

public class Taboada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe valor que deseja calcular: ");
        int calc = scanner.nextInt();

        System.out.println("--- TABOADA DO " + calc + " ---");

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + calc + " = " + i * calc);
        }
    }
}
