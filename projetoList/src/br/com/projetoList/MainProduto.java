package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("------------------- SISTEMA PRODUTOS -----------------------------------------");
		
		List<String> listaProdutos= new ArrayList<String>();

		Scanner scan = new Scanner (System.in); 
		
		int op=0; 
		
		System.out.println("** Menu ** ");
		System.out.println("Opção 1 - Adicionar");
		System.out.println("Opção 2 - Excluir");
		System.out.println("Opção 3 - Editar");
		System.out.println("Opção 4 - Ler/exibir");
		System.out.println("Opção 5 - Finalizar");
		
		while (op!=5) {
		
		System.out.println();
		
		
		System.out.print("Digite uma das opções acima: ");
		op=scan.nextInt();
		
		switch (op) {
		case 1: 
			//Adicionar 
			System.out.print("Escreva o nome do produto: ");
			String produto=scan.next();
			listaProdutos.add(produto);
			break; 
			
		case 2: 
			//Excluir 
			System.out.println("Excluir: ");
			String apagar= scan.next(); 
			
			int indexApagar=listaProdutos.indexOf(apagar);
			listaProdutos.remove(indexApagar);
			break; 
			
		case 3: 
			//Editar 
			System.out.println("Qual elemento você quer editar?");
			String editar= scan.next(); 
			int indexEditar=listaProdutos.indexOf(editar);

			System.out.println("Qual a informação você quer adicionar?");
			String novoElemento= scan.next(); 
			listaProdutos.set(indexEditar, novoElemento);
			break; 
			
		case 4: 
			//Ler 
			System.out.println();
			System.out.println(" - Lista de produtos - ");
			for (String nome : listaProdutos) {
			System.out.println(nome);
			}
			break;
			
		case 5: 
			System.out.println("Programa finalizado!");
			break; 
			
			default: 
				System.out.println("Essa opção não existe. Tente outra opção.");
				
		}
	
		}
		
	}

}
