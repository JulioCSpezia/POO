Julio Cesar Spezia 3° INF
Nelson Bellincanta Filho

Atv02
Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha

Atribuir o produto das variáveis b e c para a variável a

Demonstrar a execução do cálculo e utilizar um comentário para afirmar que é um programa de exemplo de folha de pagamento.

//importação da classe Scanner do pacote java.util
import java.util.Scanner; 
// importação da classe IOException para tratar exceções
import java.io.IOException;


public class Main {// Declaração da classe Main
    // Início da classe Main 
    // Declaracao do método main que inicia a execução do programa  
	public static void main(String[] args) throws IOException {
		// Cláusula throws permite que um erro seja descartado, mesmo que ele ocorra
		
        Scanner leitor = new Scanner(System.in); //prepara a entrada de dados
        
        System.out.println("Digite um numero inteiro"); //Mensagem de orientação
        int b = leitor.nextInt(); //declaraçao e inicialização da variavel
        
        leitor.close(); // fecha o objeto leitor
        
        double c = 5.5; //variavel c
        
        //declaraçao da variavel a (salario) e inicialização com o produto de b e c
        double a = b * c; // executa um cálculo de exemplo de folha de pagamento.
        
        // Exibe o valor do produto
        System.out.println("O produto do argumento b (" + b + ") e c (5.5) é: a ( " + a + " )" );
	}// fim do método main
}//fim da classe Main
