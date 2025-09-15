package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int signo;
		
		System.out.println("------------------------");
		System.out.println("	Horóscopo do dia	");
		System.out.println("------------------------");
		System.out.println("						");
		System.out.println("	1-Capricórnio		");
		System.out.println("	2-Aquário			");
		System.out.println("	3-Peixes			");
		System.out.println("	4-Áries				");
		System.out.println("	5-Touro				");
		System.out.println("	6-Gêmeos			");
		System.out.println("	7-Câncer			");
		System.out.println("	8-Leão				");
		System.out.println("	9-Virgem			");
		System.out.println("	10-Libra			");
		System.out.println("	11-Escorpião		");
		System.out.println("	12-Sagitário		");
		System.out.println("------------------------");
		System.out.println("Digite: a opção desejada");
		signo = leia.nextInt(); //coloca aqui o TRY CATCH para tratar o erro, ex.: se usuário digitar letra ao invés de int

		switch(signo) {
		
		case 1: 
			 System.out.println("♑ Capricórnio: Concentre-se em metas profissionais. Seu esforço será notado se agir com responsabilidade."); 
		break; //finaliza esse comando, lembre de colocar para não executar continuamente os demais casos
		
		case 2: 
			 System.out.println("♒ Aquário: Inove e compartilhe suas ideias. O dia favorece pensamentos criativos e colaboração.");
		break;
		
		case 3: 
			  System.out.println("♓ Peixes: Sensibilidade à flor da pele. Cuide da sua energia e evite ambientes tóxicos.");
		break;
		
		case 4: 
			 System.out.println("♈ Áries: Hoje é um bom dia para tomar iniciativa. Confie na sua liderança e vá atrás dos seus objetivos.");   
		break;
		
		case 5: 
			System.out.println("♉ Touro: Foque em estabilidade e segurança. Evite gastos impulsivos e busque equilíbrio nas relações.");
		break;
		
		case 6: 
			 System.out.println("♊ Gêmeos: A comunicação estará em alta. Aproveite para esclarecer mal-entendidos e fazer novas conexões.");  
		break;
		
		case 7: 
			System.out.println("♋ Câncer: Um dia ideal para cuidar das emoções e se reconectar com o lar. Valorize o tempo com a família.");
		break;
		
		case 8: 
			 System.out.println("♌ Leão: Sua criatividade está em destaque. Mostre seus talentos e não tenha medo de brilhar.");
		break;
		
		case 9: 
			System.out.println("♍ Virgem: Organize sua rotina e elimine pendências. Pequenas atitudes hoje trarão grandes resultados amanhã.");  
		break;
		
		case 10: 
			System.out.println("♎ Libra: Harmonia é a chave. Busque o equilíbrio entre razão e emoção nas decisões que tomar.");
	       
		break;
		
		case 11: 
			 System.out.println("♏ Escorpião: Intuição aguçada. Confie nos seus instintos e mantenha a discrição ao lidar com questões sensíveis.");
		break;
		
		case 12: 
			 System.out.println("♐ Sagitário: O desejo de aventura estará forte. Planeje algo novo, mas evite decisões por impulso.");
		break;
		default:
			System.out.println("Opção inválida!");
		}
		
		leia.close();
	}

}
