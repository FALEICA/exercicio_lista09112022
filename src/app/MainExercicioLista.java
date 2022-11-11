package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.Maquina;
import entidade.Pessoa;
import entidade.Produto;

public class MainExercicioLista {

	public static void main(String[] args) {
		
		Integer totFunc = 0;
		Integer idFunc;
		String	nomeFunc;
		double	salarioFunc = 0.00;
		double	percent;
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantos Funcionarios Deseja Registrar ?");
		totFunc = scan.nextInt();
		scan.nextLine();
		
		List<String> list = new ArrayList<>();
		
		Produto produto = new Produto("Note Book Samsung");
		produto.showMsgProd();
		
		
		System.out.println("-----------------------------------");
		System.out.println("\n\n");
		
		
		Maquina maq = new Maquina(1, "FILATORIO", false);
		maq.estadoDamaquina();
		
		
		for(int i=0;i<totFunc;i++) {
			System.out.println("DIGITE O ID: ");
			idFunc = scan.nextInt();
			scan.nextLine();
			
			System.out.println("DIGITE O NOME: ");
			nomeFunc = scan.nextLine();
			
			
			System.out.println("DIGITE O SALARIO: ");
			salarioFunc = scan.nextDouble();
			
			Pessoa pessoa = new Pessoa(idFunc, nomeFunc, salarioFunc);
			
			list.add(pessoa.getIdPessoa()+", "+pessoa.getNamePessoa()+", "+pessoa.getSalarioPessoa());
			
			
			System.out.println("-----LISTA RESULT------------------");	
			
			for(String x : list){
				System.out.println(x);	
			}
			
			System.out.println("-----------------------------------");
			System.out.println("\n\n");
			
			
		}
		
		
		System.out.println("Em qual ID deseja Aumentar o Salario?  ");
		idFunc = scan.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
