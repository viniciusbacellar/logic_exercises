package logic;

public class Rotate {

	public static void main(String[] args) {

	}

	public void rotate(int[][] matrix) {
		int k = matrix.length;

		// Transpõe a matriz
		// As linhas viram colunas
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < i; j++) {
				int aux = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = aux;
			}
		}

		// Troca de colunas
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length / 2; col++) {
				int aux = matrix[row][col];
				matrix[row][col] = matrix[row][k - col - 1];
				matrix[row][k - col - 1] = aux;
			}
		}

		// 
		
		// for (int i = 0; i <= k / 2; i++) {
		//	for (int j = 0; j < k - 2 * i - 1; j++) {
		//		int tmp = matrix[i][i + j];
		//		matrix[i][i + j] = matrix[k - 1 - i - j][i];
		//		matrix[k - 1 - i - j][i] = matrix[k - 1 - i][k - 1 - i - j];
		//		matrix[k - 1 - i][k - 1 - i - j] = matrix[i + j][k - 1 - i];
		//		matrix[i + j][k - 1 - i] = tmp;

		//	}
		//}
	}

}
