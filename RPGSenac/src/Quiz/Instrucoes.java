package Quiz;



public class Instrucoes {
	public void instrucoes() {
		System.out.println("Instruções para jogar o Quiz corretamente");
		System.out.println("-----------------------------------------");
		
		System.out.println("Você testará suas habilidades sobre o universo marvel");
		Load(2000);
		System.out.println("EXEMPLO");
		Load(2000);
		
		
		System.out.println("QUANTOS JOGADORES POR RODADA?\r\n");
		Load(1000);
		System.out.printf(".");
		Load(1000);
		System.out.printf(".");
		Load(1000);
		System.out.println(".");
		Load(2000);
		System.out.println("2");
		
		Load(1000);
		System.out.println("Digite o nome do usuário 1:\r\n"
				+ "João");
		
		Load(1000);
		System.out.println("Digite o nome do usuário 2:\r\n"
				+ "Maria");
		
		Load(3000);
		
		System.out.println("Lista de usuários: [João, Maria]");
		Load(2500);
		System.out.println("+===================+\r\n"
				+ "| Menu do Jogo      |\r\n"
				+ "+===================+\r\n"
				+ "| 1. Instruções     |\r\n"
				+ "| 2. Jogar          |\r\n"
				+ "| 3. Créditos       |\r\n"
				+ "| 4. Sair           |\r\n"
				+ "+===================+");
		Load(1200);
		System.out.println("Selecione sua opção!");
		Load(1200);
		Load(1000);
		System.out.printf(".");
		Load(1000);
		System.out.printf(".");
		Load(1000);
		System.out.println(".");
		Load(2000);
		System.out.println("2");
		Load(3000);
		System.out.println("Rodada do Jogador: João\r\n"
				+ "Em que ano foi lançado o primeiro filme do Homem de Ferro, dando início ao Universo Cinematográfico da Marvel??\r\n"
				+ "a) 2005\r\n"
				+ "b) 2010\r\n"
				+ "c) 2008\r\n"
				+ "d) 2012");
		
		Load(2000);
		System.out.println("Basta Continuar o seu Quiz...");
		System.out.println("Clicando em Opção 2 - Jogar");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		
		
	}
	
	public static void Load(Integer tempo) {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


