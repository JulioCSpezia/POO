Julio Cesar Spezia 3° INF
Nelson Bellincanta Filho

import javax.swing.JOptionPane;

public class CalculaMedia {
  public static void main(String[] args) {
    // solicita a entrada das notas de cada prova e do trabalho
    String nota1Str = JOptionPane.showInputDialog(null, "Digite a nota da primeira prova:");
    double nota1 = Double.parseDouble(nota1Str);
    
    String nota2Str = JOptionPane.showInputDialog(null, "Digite a nota da segunda prova:");
    double nota2 = Double.parseDouble(nota2Str);
    
    String trabalhoStr = JOptionPane.showInputDialog(null, "Digite a nota do trabalho:");
    double trabalho = Double.parseDouble(trabalhoStr);
    
    // calcula a média
    double media = (nota1 + nota2 + trabalho) / 3;
    
    // exibe o resultado em uma janela de diálogo
    JOptionPane.showMessageDialog(null, "A média é: " + media);
  }
}
