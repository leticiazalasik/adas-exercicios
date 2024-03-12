package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Criando list
		List<String> listaNomes= new ArrayList<String>();
		
		//Tamanho da lista
		System.out.println(listaNomes.size());
		
		//CREATE: Adicionando nomes 
		listaNomes.add("Harry"); 
		listaNomes.add("Rony"); 
		listaNomes.add("Hermione"); 
		listaNomes.add("Luna");
		
		//Mostrando os nomes da lista 
		System.out.println(listaNomes);
		
		//READ: Listar elementos 
		
		System.out.println(" - Lista de presença - ");
		for (String nome : listaNomes) {
		System.out.println(nome
				);
		
		}
		
		//Encontrar o index do elemento 
		int indexAlterar =listaNomes.indexOf("Rony");
		System.out.println(indexAlterar);
		
		//EDIT: editar elementos 
		listaNomes.set(indexAlterar, "Rony Weasley");
		
		
		//DELETE: Excluir
		int indexExcluir=listaNomes.indexOf("Luna");
		listaNomes.remove(indexExcluir);
		//ou 
		listaNomes.remove("Luna");

		
		System.out.println("-------------");
		for (String nome : listaNomes) {
			System.out.println(nome
					);
						}
		
		
		
		
		
		
		
		
		
		

	}

}
