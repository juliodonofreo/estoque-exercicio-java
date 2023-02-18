package produtos_problema;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public String toString() {
		return String.format("Nome do produto: %s \nPreço do produto: R$%.2f \nQuantidade em estoque: %d \nValor total: R$%.2f\n", nome, preco, quantidade, valorTotal());
	}
	public double valorTotal() {
		return preco * quantidade;
	}
	
	public void adicionarQuantidade(int acrescimo) {
		quantidade += acrescimo;
	}
	
	public void diminuirQuantidade(int decrescimo) {
		quantidade -= decrescimo;
	}
}
