
public class prog_contine {

	public static void main(String[] args) {
		
		//Fa�a um programa em Java que some todos os n�meros, de 1 at� 100, exceto os m�ltiplos de 5.

		int soma = 0;
		
		for(int c = 1; c <=100; c++){
			
			if( c%5 == 0 )
				continue;
						
			soma += c;
		}
		
		System.out.println("Soma: "+ soma);		
		
	}

}
