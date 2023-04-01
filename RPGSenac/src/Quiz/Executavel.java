package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
		int opcao;
		/*COLOCAR LÓGICA DE TENTATIVAS MAIS TARDE!!*/
		List<String> users = new ArrayList<String>();
		List<Integer> scores = new ArrayList<Integer>();
		List<String> persons = new ArrayList<String>();
		
		users.add("Pedro");
		users.add("Joao");
	
		
		for(String people : users) {
			do {
				System.out.println("+===================+");
				System.out.println("|   Menu do Jogo    |");
				System.out.println("+===================+");
				System.out.println("|  1. Instruções    |");
				System.out.println("|  2. Jogar         |");
				System.out.println("|  3. Créditos      |");
				System.out.println("|  4. Sair          |");
				System.out.println("+===================+");
				System.out.println("Selecione sua opção !");
				opcao = scanner.nextInt();
				switch (opcao) {
					case 1: {
						Instrucoes instrucoes = new Instrucoes();
						instrucoes.instrucoes();
						break;
					}
					case 2: {
						System.out.println("Rodada do Jogador: " + people);
						Jogar jogar = new Jogar();
						scores.add(jogar.jogar());
						break;
					}
					case 3: {
						System.out.println("Opcao: Créditos");
						System.out.println("Leia os créditos");
						break;
					}
				}
			} while (opcao != 4);
		}
			System.out.println("Opcao: Sair");
			System.out.println("Poxa, voce escolheu sair do jogo");
			
			for(int i = 0; i < users.size(); i++) {
				if(scores.get(i) < 3) {
					persons.add("Capitão América");
				}else {
					persons.add("Home de Ferro");
				}
				
				System.out.println(users.get(i) + ", você obteve: " + scores.get(i) + ", Personagem: " + persons.get(i));
					
			}
		

    }

}