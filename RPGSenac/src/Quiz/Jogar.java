package Quiz;

import java.util.Scanner;

public class Jogar {
	private int score = 0;
	Scanner scanner = new Scanner(System.in);

	public int jogar() {
		System.out.println(
				" Em que ano foi lançado o primeiro filme do Homem de Ferro, dando início ao Universo Cinematográfico da Marvel??");
		System.out.println("a) 2005");
		System.out.println("b) 2010");
		System.out.println("c) 2008");
		System.out.println("d) 2012");
		String pergunta1 = scanner.nextLine();
		if (pergunta1.equals("c")) {
			score++;
		}
		System.out.println("Do que é feito o escudo do Capitão América?");
		System.out.println("a) Adamantium");
		System.out.println("b) Vibranium");
		System.out.println("c) Promécio");
		System.out.println("d) Carbonádio");
		String pergunta2 = scanner.nextLine();
		if (pergunta2.equals("b")) {
			score++;
		}
		System.out.println("Quem disse a icônica frase “Avengers Assemble”/”Avante Vingadores” pela primeira vez?");
		System.out.println("a) Homem-Formiga");
		System.out.println("b) Thor");
		System.out.println("c) Capitão América");
		System.out.println("d) Hulk");
		String pergunta3 = scanner.nextLine();
		if (pergunta3.equals("b")) {
			score++;
		}
		System.out.println("Qual foi o primeiro Vingador a abandonar a equipe?");
		System.out.println("a) Vespa");
		System.out.println("b) Thor");
		System.out.println("c) Homem-Formiga");
		System.out.println("d) Hulk");
		String pergunta4 = scanner.nextLine();
		if (pergunta4.equals("d")) {
			score++;
		}
		System.out.println("Qual é o(a) herói(a) chamado(a) do(a) primeiro(a) vingador(a)?");
		System.out.println("a) Capitão America");
		System.out.println("b) Thor");
		System.out.println("c) Homem de Ferro");
		System.out.println("d) Viuva Negra");
		String pergunta5 = scanner.nextLine();
		if (pergunta5.equals("a")) {
			score++;
		}
		System.out.println("Qual é a cor da pedra do poder?");
		System.out.println("a) Azul");
		System.out.println("b) Verde");
		System.out.println("c) Roxa");
		System.out.println("d) Amarela");
		String pergunta6 = scanner.nextLine();
		if (pergunta6.equals("c")) {
			score++;
		}
		System.out.println("Quem criou o Ultron?");
		System.out.println("a) Capitão America");
		System.out.println("b) Bruce");
		System.out.println("c) Homem de ferro e Bruce");
		System.out.println("d) Dr octavios");
		String pergunta7 = scanner.nextLine();
		if (pergunta7.equals("c")) {
			score++;
		}
		System.out.println("Em vingadores guerra infinita o Thor tinha quantos anos?");
		System.out.println("a) 1500");
		System.out.println("b) 3000");
		System.out.println("c) 2000");
		System.out.println("d) 5080");
		String pergunta8 = scanner.nextLine();
		if (pergunta8.equals("a")) {
			score++;
		}
		System.out.println("Como o Groot morre?");
		System.out.println("a) Foi morto assasinado");
		System.out.println("b) Salvando o resto de equipe ao virar uma arvore de proteção");
		System.out.println("c) Lutando com Thanos");
		System.out.println("d) Virou pó com o estalo do Thanos");
		String pergunta9 = scanner.nextLine();
		if (pergunta9.equals("b")) {
			score++;
		}
		System.out.println("Quanto tempo a dizimação de thanos durou?");
		System.out.println("a) 5 anos");
		System.out.println("b) 3 anos");
		System.out.println("c) 6 anos");
		System.out.println("d) 4 anos");
		String pergunta10 = scanner.nextLine();
		if (pergunta10.equals("a")) {
			score++;
		}
		return this.score;
	}
}
