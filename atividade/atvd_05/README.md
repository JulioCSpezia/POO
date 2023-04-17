Julio Cesar Spezia 3° INF
Nelson Bellincanta Filho

public class BalancoTrimestral {
  public static void main(String[] args) {
    // declara as variáveis de gastos mensais e inicializa com os valores informados
    double gastosJaneiro = 30000.0;
    double gastosFevereiro = 33030.77;
    double gastosMarco = 23899.01;
    
    // calcula o gasto total no trimestre e a média mensal de gastos
    double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    double mediaMensal = gastosTrimestre / 3.0;
    
    // exibe o gasto total no trimestre e a média mensal de gastos
    System.out.println("O gasto total no trimestre foi de R$ " + gastosTrimestre);
    System.out.println("Valor da média mensal = R$ " + mediaMensal);
  }
}
