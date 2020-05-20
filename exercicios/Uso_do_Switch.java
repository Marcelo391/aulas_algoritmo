import java.util.Scanner;


public class Uso_do_Switch {

	public static void main(String[] args) {
		
		//Exerc�cio 6 - Switch
		// Leia um sal�rio e um c�digo do cargo.
		// Calcule e exiba: Cargo, Sal�rio Antigo, Sal�rio Novo e Diferen�a
		
		double salarioAntigo, salarioNovo, diferenca;
		float percentual;
		int cod;
		String cargo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("     CARGO   |  C�DIGO | PERCENTUAL");
		System.out.println("Diretor      |  001    | 10%");
		System.out.println("Engenheiro   |  002    | 20%");
		System.out.println("T�cnico      |  003    | 30%");
		System.out.println("Gerente      |  004    | 10%");
		System.out.println("Analista     |  005    | 30%");
		System.out.println("Coordenador  |  006    | 20%");
		System.out.println();
		
		System.out.println("Qual o c�digo referente ao cargo do funcion�rio:");
		cod = leitor.nextInt();
		
		System.out.println("Qual o sal�rio desse funcion�rio:");
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
				cargo = "T�cnico";
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
		System.out.printf("Diferen�a: %.2f \n",diferenca);						 			

	}

}
