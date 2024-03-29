public class Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    
    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void exibirDetalhes(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
    }
}