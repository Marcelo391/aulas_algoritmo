package exercicios;

public class matriz_ex2 {

	public static void exibeMatriz(int[][] minhaMatriz, String nomeMatriz){
		
		System.out.println("-------------"+nomeMatriz+"------------");
		
		//Matriz 
		for(int x = 0; x < minhaMatriz.length; x++)
		{
			for(int y = 0; y < minhaMatriz[x].length; y++){
				
				System.out.print(minhaMatriz[x][y] + " | ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrizX = new int[5][5];
		
		matrizX[0][0] = 1;
		matrizX[0][1] = 2;
		matrizX[0][2] = 5;
		matrizX[0][3] = 1;
		matrizX[0][4] = 4;
		
		matrizX[1][0] = 3;
		matrizX[1][1] = 2;
		matrizX[1][2] = 4;
		matrizX[1][3] = 2;
		matrizX[1][4] = 3;
		
		matrizX[2][0] = 4;
		matrizX[2][1] = 1;
		matrizX[2][2] = 2;
		matrizX[2][3] = 3;
		matrizX[2][4] = 7;
		
		matrizX[3][0] = 5;
		matrizX[3][1] = 5;
		matrizX[3][2] = 2;
		matrizX[3][3] = 4;
		matrizX[3][4] = 9;
		
		matrizX[4][0] = 1;
		matrizX[4][1] = 2;
		matrizX[4][2] = 4;
		matrizX[4][3] = 5;
		matrizX[4][4] = 1;
		
		exibeMatriz(matrizX," MATRIZ X");
		
		int soma = 0;
		
		System.out.println(" ---------- ");
		System.out.println();
		for(int x=0; x < matrizX.length; x++){
			for(int y=0; y < matrizX[x].length; y++){
				if(x == y){
					soma += matrizX[x][y];
					System.out.println("Posição ["+x+"]["+y+"] = "+ matrizX[x][y]);
					System.out.println("Resultado Parcial: "+soma);
				}
			}
		}
		
		System.out.println("Resultado FINAL: "+soma);
		

	}

}
