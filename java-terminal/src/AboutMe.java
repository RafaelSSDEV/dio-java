import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha após nextDouble()

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após nextInt()

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");

        scanner.close(); // Fechar o scanner para liberar recursos
    }
}