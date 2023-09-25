public class Carro extends Veiculo{
    private int numero_Portas;
    
    Carro(String marca, String modelo, int ano, int numero_Portas){
        super(marca, modelo, ano);
        this.numero_Portas = numero_Portas;
    }
    
    public int getNumero_Portas(){
        return this.numero_Portas;
    }

    public void setNumero_Portas(int numero_Portas){
        this.numero_Portas = numero_Portas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Número de portas: "+getNumero_Portas());
    }
}