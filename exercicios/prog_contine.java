
public class prog_contine {

	public static void main(String[] args) {
		
		//Faça um programa em Java que some todos os números, de 1 até 100, exceto os múltiplos de 5.

		int soma = 0;
		
		for(int c = 1; c <=100; c++){
			
			if( c%5 == 0 )
				continue;
						
			soma += c;
		}
		
		System.out.println("Soma: "+ soma);		
		
	}

}
