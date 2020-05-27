import java.util.Scanner;


public class tabuada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int num;
		char resposta = 's';
						
			do{
				
				try{
					
					
					System.out.println("=========TABUADA==========");
					System.out.println();
					
					System.out.print("Digite o número: ");
					num = leitor.nextInt();
					
					
					for(int x = 1; x <= 10; x++){
						System.out.println(num+" * "+x+" = "+ (num*x) );
					}
					
					System.out.println();
					System.out.println("=========================");					
					
				}
				catch(Exception ex){
					System.out.println("Deu erro: "+ex.getMessage());
				}
				
				do{
					System.out.println("Deseja continuar (s/n) ?");
					resposta = leitor.next().charAt(0);
				}while(resposta != 's' && resposta != 'n');
				
				
			}while(resposta == 's');
			
			System.out.println("Obrigado!");
		
		
		

	}

}
