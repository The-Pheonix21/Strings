public class Multi {
	public static void main(String[] args) {
		int[][] a = snakeDraft(10,3);
		print(a);
		int [] r= {1,2,3,4,5,6};
		int[][] k = rectangularize(r,3,2);
		System.out.println("rectangularize ");
		print(k);
	// 	int[][] a = { {1,2,3,4,5},
	// 				  {6,7,8,9,10},
	// 			 	  {11,12,13,14,15} };
	// System.out.println("sum of the row 0 " + sumRow(a, 0));
	// System.out.println("sum of the collum 0 " + sumcol(a, 0));
	// System.out.println("the total of the matrix is " + sumTotal(a));
	// System.out.println("the reverce of line 0 is " + reverseMatrix(a, 0));
	// }

}
	public static int[][] snakeDraft(int players ,int rounds) {
		int[][] b = new int[rounds][players];
		int counter = 1;
		for (int irow=0; irow<b.length;irow++ ) {
			if (irow%2==0) {
			 	//even
			 for (int icol=0;icol<b[irow].length;icol++) {
				b[irow][icol]= counter;
				counter+=1;
			}
			 } else {
			 	//odd
			 	for (int icol=b[irow].length-1;icol>=0;icol--) {
			 		b[irow][icol]= counter;
				counter+=1;
			 	}
			 }	
		}
	return b;	
	}
public static int[][] rectangularize(int[] r,int rows,int col){
	int[][] t5 = new int[rows][col];
	int theCount=0;
	for (int i=0;i<t5.length;i++) {
		for (int j=0;j<t5[i].length;j++) {
			if (theCount<r.length) {
			t5[i][j] = r[theCount];
			theCount+=1;	
			} else {
				t5[i][j]=0;
			}
		}
	}
	return t5;
}
	 public static boolean print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	return true;
	}
	// public static int sumRow(int[][] a, int n){
	// 	int sumr = 0;
	// 	for (int c = 0; c < a[n].length; c++) {
	// 		sumr = sumr + a[n][c];
	// 		}
	// 	return sumr;
	// 	}
	// public static int sumcol(int[][] a, int n){
	// 	int sumc = 0;
	// 	for (int i = 0;i < a.length;i++) {
	// 	 	sumc = sumc + a[i][n];
	// 	 }  
	// 	return sumc;
	// }
	// public static int sumTotal(int[][] a){
	// 	int sum = 0;
	// 	for (int r=0; r<a.length; r++) {
	// 		for (int c=0; c<a.length;c++ ) {
	// 			sum = sum + a[r][c];
	// 		}
			
	// 		}
	// 	return sum;
	// 	}
	// public static int[] reverseMatrix(int[][] a, int n) {
	//  int[] reverced = new int[a[n].length];
	//  	for (int i = a[n].length - 1, r = 0; i >= 0 ;i--,r++ ) {
	//  		reverced[r] = a[i][n];
	// 	}
	// 	return reverced;
	// }	
}