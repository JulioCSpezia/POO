julio Cesar Spezia 3°INF
Nelson Bellincanta Filho

Apresente a soma de todos os argumentos inteiros ou reais recebidos

import java.util.Scanner; // importa a classe Scanner do pacote java.util

public class Soma { // declaração da classe Soma
    public static void main(String[] args) { // ponto de entrada do programa
        int num1, num2, resultado; // declaração das variáveis inteiras num1, num2 e resultado
        
        Scanner input = new Scanner(System.in); // cria um objeto da classe Scanner
        
        System.out.print("Digite o primeiro número: "); // imprime uma mensagem solicitando o primeiro número
        num1 = input.nextInt(); // lê o primeiro número digitado pelo usuário e armazena em num1
        
        System.out.print("Digite o segundo número: "); // imprime uma mensagem solicitando o segundo número
        num2 = input.nextInt(); // lê o segundo número digitado pelo usuário e armazena em num2
        
        resultado = num1 + num2; // soma os valores de num1 e num2 e armazena o resultado na variável resultado
        
        System.out.println("A soma dos números é: " + resultado); // imprime o resultado da soma na tela
    }
}
