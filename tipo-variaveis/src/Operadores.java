public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        double divisao = 15.0 / 3.0; // Usando double para resultado decimal
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20.0 / 4.0);

        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Subtração: %d%n", subtracao);
        System.out.printf("Multiplicação: %d%n", multiplicacao);
        System.out.printf("Divisão: %.2f%n", divisao);
        System.out.printf("Módulo: %d%n", modulo);
        System.out.printf("Resultado: %.2f%n", resultado);

        // Concatenação de strings
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println("Nome completo: " + nomeCompleto);

        // Condição ternária
        int a = 6;
        int b = 6;
        String resultadoTernario = a == b ? "verdadeiro" : "falso";
        System.out.println("Resultado ternário: " + resultadoTernario);

        // Operadores relacionais
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }
}