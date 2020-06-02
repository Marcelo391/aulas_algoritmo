
public class prog_break {

	public static void main(String[] args) {

		//Ache o primeiro número, entre 1 e 1 milhão que é divisível por 11, 13 e 17. Use o comando BREAK.

		for(int c =1; c <= 1000000; c++){
			
			if( c%11 == 0 && c%13 == 0 && c%17 == 0){
				System.out.printf("O numero: %d \n", c);
				break;
			}						
		}	
		
	}

}
