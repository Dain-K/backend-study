import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[30][30];
		
		for(int i = 1; i <= 30; i++) {
			arr[i][i] = 1;
			arr[i][1] = 1;
		}
		
		for(int i = 1; i < 30; i++) {
			for(int j = 2; j < 30; j++) {
				// arr[i][j] = 
			}
		}
		
		int T = sc.nextInt();
		
		int[] N = new int[T];
		int[] M = new int[T];
		
		for(int i = 0; i < T; i++) {
			N[i] = sc.nextInt(); 
			M[i] = sc.nextInt();
		}
				
		sc.close();
	}

}