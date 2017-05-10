import java.util.*;
class matrix  {
	public static void main(String[] args) {
		int one [][] = new int[3][3];
		int two [][] = new int[3][3];
		int sum [][] = new int [3][3];
		Scanner sc = new Scanner(System.in);

	System.out.println("+++++======== matrix number one =========+++++");
		for(int i = 0; i<3;i++){
				for (int j = 0;j<3 ;j++) {
					System.out.printf("col :  %d row: %d number of you :  ",(i+1),(j+1));
					one[i][j] = sc.nextInt();
				}
		}	
		System.out.println("======== print matrix number one ===========");
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3 ; j++) {
			
				System.out.print("  "+one[i][j]);

			}
			System.out.println();
		}
		System.out.println("+++++======== matrix number two =========+++++");
		for(int i = 0; i<3;i++){
				for (int j = 0;j<3 ;j++) {
					System.out.printf("col :  %d row: %d number of you :  ",(i+1),(j+1));
					two[i][j] = sc.nextInt();
				}
		}	
		System.out.println("======== print matrix number two ===========");
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3 ; j++) {
			
				System.out.print("  "+two[i][j]);

			}
			System.out.println();
		}

		for (int i = 0; i<3; i++) {
			
			for (int j = 0; j<3; j++) {
				int temp = 0;
				int sumall =0;
				for (int k = 0 ; k<3 ; k++) {
					temp = one[i][k] * two[k][j];
					sumall+= temp;
					
				}
				sum[i][j] = sumall;
			}
		}
		System.out.println("======== print matrix sum ===========");
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3 ; j++) {
			
				System.out.print("  "+sum[i][j]);

			}
			System.out.println();
		}
	}
}