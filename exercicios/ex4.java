import java.util.Scanner;


public class ex4 {

	public static void main(String[] args) {
		
		int num, maiorNumero = 0, cont = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		while(cont <= 5){
			System.out.println("Digite o "+cont+"º numero: ");
			num = leitor.nextInt();
			
			if( num > maiorNumero)
				maiorNumero = num;
			
			cont++;
		}
		
		System.out.println("O maior número é "+maiorNumero);
		
		

	}

}
