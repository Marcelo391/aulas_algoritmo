import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		double saldo = 0;
		double valor = 0;
		char opcao;
		
		Scanner leitor = new Scanner(System.in);
		
		do{			
			System.out.println("Escolha a op��o: ");
			System.out.println("a - Consultar Saldo: ");
			System.out.println("b - Saque: ");
			System.out.println("c - Dep�sito: ");
			System.out.println("d - Sair: ");
			
			opcao = leitor.next().charAt(0);
			
			switch (opcao) {
				//Saldo
				case 'a': 
					System.out.println("Saldo: "+saldo);
					break;
				//Saque
				case 'b': 
					System.out.println("Qual valor deseja sacar ?");
					valor = leitor.nextDouble();
					
					if( valor <= saldo){					
						saldo -= valor;
						System.out.println("Saque realizado");
					}
					else{
						System.out.println("Saldo insuficiente");
					}						
					break;
				//Dep�sito
				case 'c':
					System.out.println("Qual valor deseja depositar ?");
					valor = leitor.nextDouble();
					
					saldo += valor;
					break;
				//Sair
				case 'd':
					System.out.println("Obrigado. Volte sempre !");
					break;
				default:
					System.out.println("Op��o inv�lida");
			}
			System.out.println();
			System.out.println();
						
		}while(opcao != 'd');

	}

}
