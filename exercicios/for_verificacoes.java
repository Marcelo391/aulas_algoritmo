import java.util.Scanner;


public class for_verificacoes {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int num;
		int maiorQ5 = 0, par = 0, impar = 0;
				
		for(int x = 1; x <= 10; x++){
			
			System.out.printf("Digite o %dº numero: ", x);
			num = leitor.nextInt();
			
			if( num > 5 )
				maiorQ5++;
			
			if(num%2 == 0)
				par++;
			else
				impar++;			
		}		
		
		System.out.println("Números maiores que 5: "+maiorQ5);
		System.out.println("Números pares: "+par);
		System.out.println("Números impares: "+impar);					
	}

}
