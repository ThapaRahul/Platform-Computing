
public class Array2DDemo {
	
	/**
	 * Prints a 2D array. Use for debugging
	 * @param a - 2D array
	 */
	
	static void printArray2D(int[][] a) {
		
		int row=0;
		int col=0;
		for(row=0;row<5;row++) {
			for(col=0;col<5;col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int[][] array2D = new int[5][5];
		int row, col;
		printArray2D(array2D);
		
		
		// change row 2 and col 3 to 1
		array2D[1][2] = 1;
		printArray2D(array2D);
		
		//fill third row with integer 2
		row = 2;
		col = 0;
		
		for (col=0; col<5; col++) {
			array2D[row][col] = 2;
		}
		
		printArray2D(array2D);
		
		
		
	}

}
