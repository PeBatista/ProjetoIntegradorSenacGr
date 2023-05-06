package Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Executavel {
	
	
	static int variavel;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao;
		/* COLOCAR LÓGICA DE TENTATIVAS MAIS TARDE!! */

		List<Integer> scores = new ArrayList<Integer>();
		List<String> nivel = new ArrayList<String>();
		ArrayList<String> users = new ArrayList<String>();

		System.out.println("1 ----------SENAQUIZ-------------");
		System.out.println("1 -- SELECIONE A QUANTIDADE DE JOGADORES");
		System.out.println("2 -- iNFORME O NOME DE CADA JOGADOR");
		System.out.println("+=+=+= E DESCUBRA SE VOCE E UM NOOB OU ESPECIALISTA NO UNIVERSO MARVEL +=+=+=");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		Load(2000);
		System.out.println("QUANTOS JOGADORES POR RODADA?");
		int quantidade = scanner.nextInt();
		scanner.nextLine(); // limpar o buffer do scanner

		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite o nome do usuário " + i + ":");
			String nome = scanner.nextLine();
			users.add(nome);
			System.out.println("Usuário: " + nome + " adicionado à lista!");
		}

		System.out.println("Lista de usuários: " + users);

		Load(3000);
		for (String people : users) {
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
					System.out.println("DESENVOLVIDO POR: [PEDRO BATISTA MENDONÇA] [JOÃO VICTOR TRINDADE VIEIRA]");
					System.out.println("[DAVI LOPES] [JULIA GOMES DE SOUZA] [BEATRIZ BEZERRA DE ALMEIDA]");
					System.out.println("/*/*/**/*/*/*/*/*/*/*");
					System.out.println("Todos os direitos reservados");
					Load(2000);
					break;
				}
				}
			} while (opcao != 4);
		}
		Load(2000);
		System.out.println("Poxa, você escolheu sair do jogo");
		Load(1200);

		for (int i = 0; i < users.size(); i++) {
			if (scores.get(i) > 10) {
				nivel.add("Eu diria que o Nick Fury te daria uma vaga na SHIELD!");
			}

			else if (scores.get(i) >= 8) {
				nivel.add("Pelo visto voce parou em 2018...");
			} else if (scores.get(i) >= 5) {
				nivel.add("E...ate que voce conhece!");
			} else if (scores.get(i) >= 3) {
				nivel.add("Geração Z sempre decepcionando!");
			} else {
				nivel.add("Manja nada, pessimo! KKK");
			}

			System.out.println(
					users.get(i) + ", você obteve: " + scores.get(i) + ", você é " + nivel.get(i) + ", quando o assunto é sobre Marvel");
		
		}
		
		List<String> ranking = new ArrayList<String>();
		List<Integer> sortedScores = new ArrayList<Integer>(scores); // criar uma cópia da lista de scores para ordenar
		Collections.sort(sortedScores, Collections.reverseOrder()); // ordenar a lista de scores em ordem decrescente

		for (int t = 0; t < users.size(); t++) {
		    int posicao = sortedScores.indexOf(scores.get(t)) + 1; // encontrar a posição do score na lista ordenada
		    String colocacao = posicao == 1 ? "Primeiro Lugar" : posicao + "º Lugar"; // verificar a colocação do usuário
		    ranking.add("Usuário: " + users.get(t) + ", " + colocacao + ", Pontuação: " + scores.get(t));
		}

		// exibir ranking
		for (String colocacao : ranking) {
		    System.out.println(colocacao);
		}

	}
	
	public long tempo;

	public static void Load(Integer tempo) {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}