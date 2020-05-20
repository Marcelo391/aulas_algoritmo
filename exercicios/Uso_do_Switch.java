import java.util.Scanner;


public class Uso_do_Switch {

	public static void main(String[] args) {
		
		//Exercício 6 - Switch
		// Leia um salário e um código do cargo.
		// Calcule e exiba: Cargo, Salário Antigo, Salário Novo e Diferença
		
		double salarioAntigo, salarioNovo, diferenca;
		float percentual;
		int cod;
		String cargo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("     CARGO   |  CÓDIGO | PERCENTUAL");
		System.out.println("Diretor      |  001    | 10%");
		System.out.println("Engenheiro   |  002    | 20%");
		System.out.println("Técnico      |  003    | 30%");
		System.out.println("Gerente      |  004    | 10%");
		System.out.println("Analista     |  005    | 30%");
		System.out.println("Coordenador  |  006    | 20%");
		System.out.println();
		
		System.out.println("Qual o código referente ao cargo do funcionário:");
		cod = leitor.nextInt();
		
		System.out.println("Qual o salário desse funcionário:");
		salarioAntigo = leitor.nextDouble();
		
		switch(cod){
			case 001:
				percentual = 0.10f;
				cargo = "Diretor";
				break;
			case 002:
				percentual = 0.20f;
				cargo = "Engenheiro";
				break;
			case 003:
				percentual = 0.30f;
				cargo = "Técnico";
				break;
			case 004:
				percentual = 0.10f;
				cargo = "Gerente";
				break;
			case 005:
				percentual = 0.30f;
				cargo = "Analista";
				break;
			case 006:
				percentual = 0.20f;
				cargo = "Coordenador";
				break;
			default:
				percentual = 0.40f;
				cargo = "Cargo indefinido";
		}
				
		salarioNovo = salarioAntigo + (salarioAntigo*percentual);
		diferenca = salarioNovo - salarioAntigo;
		
		
		System.out.println("Cargo: "+ cargo);
		System.out.printf("Salario Antigo: %.2f \n",salarioAntigo);
		System.out.printf("Salario Novo: %.2f \n",salarioNovo);
		System.out.printf("Diferença: %.2f \n",diferenca);						 			

	}

}
