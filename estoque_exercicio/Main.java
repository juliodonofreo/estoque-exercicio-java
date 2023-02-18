package produtos_problema;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale ("pt", "BR"));
		Scanner input = new Scanner(System.in);
		int acrescimo, decrescimo;
		
		Produto produto = new Produto();
		
		System.out.println("Digite os dados do produto: ");
		
		System.out.println("Nome: ");
		produto.nome = input.next();
		System.out.println("Preço: ");
		produto.preco = input.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = input.nextInt();
		
		produto.toString();
		
		System.out.print(produto);
		
		System.out.println("Quantas unidades serão adicionadas ao estoque? ");
		acrescimo = input.nextInt();
		produto.adicionarQuantidade(acrescimo);
		
		System.out.println("\nDados atualizados do produto: ");
		System.out.println(produto);
		
		System.out.println("Quantas unidades serão retiradas de estoque? ");
		decrescimo = input.nextInt();
		produto.diminuirQuantidade(decrescimo);
		
		System.out.println("\nDados atualizados do produto: ");
		System.out.println(produto);
		
		input.close();
	}
}