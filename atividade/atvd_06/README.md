Julio Cesar Spezia 3° INF
Nelson Bellincanta Filho

import java.util.Scanner;

public class DepositoFixo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Solicita ao usuário o valor do depósito mensal e do montante desejado
        System.out.print("Informe o valor do depósito mensal: ");
        double depositoMensal = input.nextDouble();
        System.out.print("Informe o montante desejado: ");
        double montanteDesejado = input.nextDouble();
        
        // Inicializa as variáveis do cálculo
        double montanteAtual = 0;
        int numMeses = 0;
        
        // Realiza o cálculo enquanto o montante atual não atingir o montante desejado
        while (montanteAtual < montanteDesejado) {
            montanteAtual += depositoMensal;
            montanteAtual *= 1.005; // considerando juros mensais de 0,5%
            numMeses++;
        }
        
        // Exibe o resultado ao usuário
        System.out.println("Serão necessários " + numMeses + " meses para acumular o montante desejado.");
        
        // Fecha o Scanner
        input.close();
    }
}
