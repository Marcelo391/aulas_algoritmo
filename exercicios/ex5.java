import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		
		int cont = 1, qtdM_ate1000 = 0;
		float altura, maiorAltura = 0, menorAltura = 0;
		char sexo;
		double salario, mediaSalario = 0;
		
		
		Scanner leitor = new Scanner(System.in);
		
		while(cont <= 20){
			
			// Leitura dos Dados
			System.out.println();
			System.out.println(cont+"º funcionário");
			System.out.println("Digite a altura ");
			altura = leitor.nextFloat();
			
			System.out.println("Digite o sexo ");
			sexo = leitor.next().charAt(0);
			
			System.out.println("Digite o salário ");
			salario = leitor.nextDouble();
			
			//Acumulado dos salários
			mediaSalario += salario;
			
			//Verificações
			if( altura > maiorAltura )
				maiorAltura = altura;
			if( altura < menorAltura || cont == 1 )
				menorAltura = altura;
			
			if( sexo == 'f' && salario < 1000 )
				qtdM_ate1000++;
			
						
			
			cont++;
		}
		//Média		
		mediaSalario /= (cont-1); 
		
		
		System.out.println("Média salarial: "+mediaSalario);
		System.out.println("Maior Altura: "+maiorAltura);
		System.out.println("Menor Altura: "+menorAltura);
		System.out.println("Mulheres c/ sala. até 1000: "+qtdM_ate1000);
	}

}
