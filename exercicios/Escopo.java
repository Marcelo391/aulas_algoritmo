
public class Escopo {

	public static void main(String[] args) {

		int a = 5;
		int x;
		
		for(x = 0; x < 10; x++){
			
			int c = 0 ;
			System.out.println(x);
			
			while( x < 5){
				int w = 1;
				System.out.println(c);
			}
						
		}
		
		System.out.println(a);				
		System.out.println(x);
		
	}


}
