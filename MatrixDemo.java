public class MatrixDemo{
	public static void main(String[] args) {
		int[][] m1 = new int[3][3];
        // populate the array
        for(int i=0; i<m1.length;i++){
        	for(int j=0;j<m1[i].length;j++){
        		m1[i][j] = 10 + (int) (Math.random()*100);
        	}
        }
        // printing the matrix
        int sum =0;
        for(int i=0; i<m1.length;i++){
        	System.out.println();
        	for(int j=0;j<m1[i].length;j++){
        		System.out.print(" "+m1[i][j]+" ");  
        		if(i == j)
                sum = sum + m1[i][j];
     	}
        }

       System.out.println("\nSum of diagonal elements of matrix: "+sum);
	}
}