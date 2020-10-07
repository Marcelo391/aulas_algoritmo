package exercicios;

import java.util.Scanner;

public class matriz_ex1 {
	
	
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
	
	public static int[][] inverterMatriz(int[][] matrizOriginal){
			
		int[][] matrizResultado = new int[matrizOriginal.length][matrizOriginal[0].length];
		
		//Criação da Matriz B ( invertida )
		for(int x = 0; x < matrizOriginal.length; x++)
		{
			for(int y = 0; y < matrizOriginal[x].length; y++){															
				
				matrizResultado[y][x] = matrizOriginal[x][y];			
			}
		}
		
		return matrizResultado;		
		
	}
	
	
	public static int[][] somaMatriz(int[][] primeiraMatriz, int[][] segundaMatriz){
		return null;
	}	
	

	public static void main(String[] args) {
		
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		int[][] matrizC = new int[3][3];
		
		Scanner leitor = new Scanner(System.in);
		
		//Leitura da Matriz A
		for(int x = 0; x < matrizA.length; x++)
		{
			for(int y = 0; y < matrizA[x].length; y++){
				
				System.out.print("Digite um número inteiro["+x+"]["+y+"]: ");
				matrizA[x][y] = leitor.nextInt();	
				
				exibeMatriz(matrizA, "MATRIZ A");
				matrizB = inverterMatriz(matrizA);
				exibeMatriz(matrizB, "MATRIZ B");
			}
		}					
		
		//Criação da Matriz C ( soma )
		for(int x = 0; x < matrizC.length; x++)
		{
			for(int y = 0; y < matrizC[x].length; y++){															
				
				matrizC[x][y] = matrizB[x][y] + matrizA[x][y];					
			}
		}
		
		exibeMatriz(matrizC, "MATRIZ C");
		
		

	}

}
