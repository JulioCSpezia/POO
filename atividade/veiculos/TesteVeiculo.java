public class TesteVeiculo{
	public static void main(String[] args) {
		Carro carro = new Carro("Volkswagen", "Fusca", 1959, 2);
		Moto moto = new Moto("GPz900R", "Kawasaki ", 1984, 908);
		carro.exibirDetalhes();
		moto.exibirDetalhes();
	}
}