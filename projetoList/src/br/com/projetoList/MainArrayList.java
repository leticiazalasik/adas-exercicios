package br.com.projetoList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listaNumeros= new ArrayList();
		ArrayList<String> relatorio= new ArrayList();

		String relatorioFinal="Resultados: \n"; 
		
		int valorTotal=0; 
		int acertos =0; 
		
		for (int i=0; i<5; i++) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")); 
		
		listaNumeros.add(opcao); 
		acertos=acertos+1; 
		
		if (opcao==10 || opcao==100 || opcao==1000) {
			JOptionPane.showMessageDialog(null, "Você ganhou R$ 50,00!");
			valorTotal=valorTotal+50; 

		}
		
		JOptionPane.showMessageDialog(null, "Clique OK para prosseguir.");

		} 
		
		JOptionPane.showMessageDialog(null, "Lista finalizada. Clique ok para ir para o resultado.");
		
		for (int numero : listaNumeros) {
			if (numero==10 || numero==100 || numero==1000) {
				
				relatorio.add(numero + " - R$ 50,00"); 

			}
		}
		
		int tamanho = relatorio.size(); 
				
		for (int i=0; i <tamanho; i++) {
			relatorioFinal+=relatorio.get(i)+ "\n"; 		
		
		}

		
		relatorioFinal+="Valor total: R$" + valorTotal; 
		
		
		//.concat(null, "O valor total que você vai receber é de R$ " + valorTotal);

		JOptionPane.showMessageDialog(null, relatorioFinal);

}
} 