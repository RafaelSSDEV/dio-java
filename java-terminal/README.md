# Estudo de Argumentos e Terminal em Java

Este repositório contém exemplos de código Java que demonstram o uso de argumentos de linha de comando e a classe Scanner para entrada de dados.

## Compilação e Execução

### Utilizando IDE

Ao utilizar uma IDE (Ambiente de Desenvolvimento Integrado), os arquivos compilados (`.class`) são geralmente armazenados na pasta `/bin`.

### Terminal (Linha de Comando)

Para executar os exemplos pelo terminal, siga os passos abaixo:

1.  Navegue até o diretório `bin` do seu projeto.
2.  Execute o comando `java NomeDaClasse`.

    * Exemplo: `java AboutMe`

O processo de execução envolve:

1.  Compilação do arquivo `.java` (se necessário).
2.  Execução do arquivo `.class` gerado.

## Argumentos de Linha de Comando

A classe `main` em Java recebe um array de strings (`String[] args`) como argumento. Este array contém os argumentos passados na linha de comando durante a execução do programa.

* Exemplo: `java MinhaClasse argumentoUm argumentoDois`

No código `AboutMe.java`, os argumentos são acessados da seguinte forma:

```java
String nome = args[0];
String sobrenome = args[1];
int idade = Integer.valueOf(args[2]);
double altura = Double.valueOf(args[3]);