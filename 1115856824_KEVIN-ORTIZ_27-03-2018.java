import java.util.Random;
import java.util.Scanner;

public class Matriz {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Cuantas fila tiene la matriz:");
		int n = teclado.nextInt();
		System.out.print("Cuantas columnas tiene la matriz:");
		int m = teclado.nextInt();

		int total = n * m;
		int[][] matriz = new int[n][m];
		int[] arreglo = new int[total];
		numerosUnicos(arreglo);
		llenarMatriz(n, m, arreglo, matriz);
		System.out.println("  Matriz ");
		mostrarMatriz(matriz);
		System.out.println("Suma de las Columnas ");
		sumaColumna(matriz);
		
	}

	public static void numerosUnicos(int[] arreglo) {
		Random random = new Random();
		int i = 0;

		arreglo[i] = random.nextInt(100);
		for (i = 1; i < arreglo.length; i++) {
			arreglo[i] = random.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (arreglo[i] == arreglo[j]) {
					i--;
				}
			}
		}
	}

	public static void llenarMatriz(int n, int m, int[] arreglo, int[][] matriz) {
		int h = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j] = arreglo[h];
				h++;
			}
		}
	}

	public static void sumaColumna(int[][] matriz) {
		 int promedio[] = new int[matriz.length];
		 int result=0;
		 int nf=0;
		 int prom = 0;
		int sumc = 0;
		for (int i = 0; i < matriz[0].length; i++) {	
			for (int j = 0; j < matriz.length; j++) {
				sumc = sumc + matriz[j][i];
				prom = sumc/matriz.length;					
			}
			promedio[i]=prom;
			System.out.print(" " + sumc);	
			}
		for (int r = 0; r < promedio.length; r++) {
            if (promedio[r]> result) {
                result = promedio[r];
              nf = r+1;
            }
            
		}
		System.out.println("");
		System.out.print("Promedio mayor " + result+ " Columna "+ nf);
	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print("  " + matriz[f][c]);
			}
			System.out.println("  ");
		}
	}
}
