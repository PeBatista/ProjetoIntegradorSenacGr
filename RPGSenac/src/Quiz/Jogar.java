package Quiz;

import java.util.Scanner;

public class Jogar {
	private int score = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public int jogar() {
			
	        System.out.println("Qual habilidade você escolheu?");
	        System.out.println("a) 2");
	        System.out.println("b) 1");
	        System.out.println("c) 3");
	        System.out.println("d) 4");
	        String pergunta1 = scanner.nextLine();
	
	        if (pergunta1.equals("a")) {
	
	            score++;
	
	        } 
	
	        System.out.println("Qual e o valor de 5 + 2?");
	        System.out.println("a) 12");
	        System.out.println("b) 7");
	        System.out.println("c) 77");
	        System.out.println("d) 69");
	        String pergunta2 = scanner.nextLine();
	
	        if (pergunta2.equals("b")) {
	
	            score++;
	
	        } 
	
	
	
	        System.out.println("Qual e o valor de 100 + 50?");
	        System.out.println("a) 12");
	        System.out.println("b) 6969");
	        System.out.println("c) 150");
	        System.out.println("d) 0101");
	        String pergunta3 = scanner.nextLine();
	
	        if (pergunta3.equals("c")) {
	
	            score++;
	
	        }
	
	
	        System.out.println("Qual e o maior pais do mundo?");
	        System.out.println("a) Kilimanjaro");
	        System.out.println("b)  Russia");
	        System.out.println("c) Mount Fuji");
	        System.out.println("d) Table Mountain");
	
	        String pergunta4 = scanner.nextLine();
	
	        if (pergunta4.equals("b")) {
	
	            score++;
	
	        } 
	
	
	      
	        System.out.println("Qual seleção tem mais copas?");
	        System.out.println("a)  Brasil");
	        System.out.println("b) Argentina");
	        System.out.println("c) Colombia");
	        System.out.println("d) Argentinas");
	
	        String pergunta5 = scanner.nextLine();
	
	        if (pergunta5.equals("a")) {
	
	            score++;
	
	        } 
	        
        return this.score;
        
	}

}
