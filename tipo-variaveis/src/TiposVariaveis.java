public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos inteiros
        byte idade = 30; // -128 a 127
        short numeroPequeno = 1000; // -32768 a 32767
        int numeroInteiro = 100000; // -2147483648 a 2147483647
        long numeroGrande = 10000000000L; // -9223372036854775808 a 9223372036854775807

        // Tipos primitivos decimais
        float preco = 29.99F; // 'F' para indicar float
        double salarioMinimo = 2500.33;

        // Tipo primitivo booleano
        boolean estaChovendo = false;

        // Tipo primitivo caractere
        String letras = "Caracteres";

        // Constante
        final double PI = 3.14159;

        // Imprimindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Número pequeno: " + numeroPequeno);
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número grande: " + numeroGrande);
        System.out.println("Preço: " + preco);
        System.out.println("Salário mínimo: " + salarioMinimo);
        System.out.println("Está chovendo? " + estaChovendo);
        System.out.println("String guarda: " + letras);
        System.out.println("PI: " + PI);
    }
}