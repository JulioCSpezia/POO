public class Moto extends Veiculo{
    private int cilindradas;
    
    Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Cilindradas: "+getCilindradas());
    }
}