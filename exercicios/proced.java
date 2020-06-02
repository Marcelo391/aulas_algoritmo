
public class proced {

	public static void main(String[] args) {
		
		exibeMensagem();
		exibeMensagem("Marcelo");
		
		exibeNomeCompleto("Marcelo", "de Oliveira");
		
		int resultado = soma(5,10);
		System.out.println(resultado);
		
		resultado = soma(15,12);
		System.out.println(resultado);
		
		resultado = soma(1,1);
		System.out.println(resultado);
		
		
	}
	
	public static void exibeMensagem(){
		System.out.println("Mensagem padrão");		
	}
	
	public static void exibeMensagem(String nome){
		System.out.println("Olá "+nome);
	}
	
	public static void exibeNomeCompleto(String nome, String sobrenome){
		System.out.println(nome+" "+sobrenome);
	}
	
	public static int soma(int a, int b){
		
		System.out.println("Método Soma");
		
		if( a + b > 3)		
			return 0;
		else
			return a + b; 
		
	}
	
	public static String meuMetodo(char a, char b, char c){
		
		return "";
	}
	

}
