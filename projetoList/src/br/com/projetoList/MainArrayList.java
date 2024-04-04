package br.com.projetoList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listaNumeros= new ArrayList();
		
		
		for (int i=0; i<10; i++) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")); 
		
		listaNumeros.add(opcao); 
		
		JOptionPane.showMessageDialog(null, "Ok, vamos para o próximo!");

		} 
		
		JOptionPane.showMessageDialog(null, "Lista finalizada. Clique ok para ir para o resultado.");
		
		
		//Se o usuário tiver digitado os números 10, 100 ou 1000 mostre uma mensagem informando que ele ganhou um bônus de R$ 50,00 12
		// fazer um for of percorrer o array e ir fazendo a soma mas também mostrar quem sabe um extrato 
	
	//exemplo de for of for (let fruta of lista) {
	//  console.log(fruta);
	//}


}
} 