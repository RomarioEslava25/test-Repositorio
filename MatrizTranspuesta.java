public class MatrizTranspuesta {

	public static void imprimir(int[][] matriz) {
		for (int i=0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j=0; j < matriz[i].length; j++) {
                    System.out.print (matriz[i][j]);
                    if (j!=matriz[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
		}
	}
	
	public static int[][] transponer(int[][] matriz) {
		
		int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
		
		for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
            		nuevaMatriz[j][i] = matriz[i][j];
            }
		}
		
		return nuevaMatriz;
		
	}
	
	
	public static void main(String[] args) {
	
		// Definimos una matriz de 3x3
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("Matriz Inicial");
		imprimir(matriz);
		
		System.out.println("Matriz Invertida");
		int [][] nMatriz = transponer(matriz);
		imprimir(nMatriz);

	}

}