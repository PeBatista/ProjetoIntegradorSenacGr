package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
		int opcao;
		/*COLOCAR LÓGICA DE TENTATIVAS MAIS TARDE!!*/

		List<Integer> scores = new ArrayList<Integer>();
		List<String> nivel = new ArrayList<String>();
		ArrayList<String> users = new ArrayList<String>();

		
        System.out.println("Quantos usuários deseja adicionar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer do scanner

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o nome do usuário " + i + ":");
            String nome = scanner.nextLine();
            users.add(nome);
            System.out.println("Usuário " + nome + " adicionado à lista!");
        }

        System.out.println("Lista de usuários: " + users);
		
		
		
		
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
						System.out.println("Sua Rodada foi Finalizada ! ");
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
			System.out.println("Poxa, você escolheu sair do jogo");
			
			for(int i = 0; i < users.size(); i++) {
				if(scores.get(i) > 10) {
					nivel.add("Especialista");
				}
				
				else if(scores.get(i) >= 8) {
					nivel.add("Monstro Sagrado");
				}
				else if(scores.get(i) >= 5) {
					nivel.add("Regular");
				}
				else if(scores.get(i) >= 3 ){
					nivel.add("ruim");
				}
				else {
					nivel.add("péssimo slc");
				}
				
				System.out.println(users.get(i) + ", você obteve: " + scores.get(i) + ", você é " + nivel.get(i) + " em Marvel");
					
			}
    }
}