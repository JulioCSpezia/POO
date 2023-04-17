Julio Cesar Spezia 3° INF
Nelson Bellincanta Filho

public class BalancoTrimestral {
  public static void main(String[] args) {
    // declara as variáveis de gastos mensais e inicializa com os valores informados
    double gastosJaneiro = 30000.0;
    double gastosFevereiro = 33030.77;
    double gastosMarco = 23899.01;
    
    // calcula o gasto total no trimestre
    double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    
    // exibe o gasto total no trimestre
    System.out.println("O gasto total no trimestre foi de R$ " + gastosTrimestre);
  }
}
