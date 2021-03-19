package interviews.matrix;



public class MatrixClass {

	public static void main(String[] args) 
	{
	 
	int matrix[][] = getMatrix(3,4);
	
	print2D(matrix);
		
	}
	
	
	
	
	static int[][] getMatrix(int n, int m)
	{   int[][] matrix = new int[n][m];
		
	  int max = 1; 
      int min = 0; 
      int range = max - min + 1; 
      
	    for (int i=0;i<n;i++)
	    	{
	    	for (int j=0;j<m;j++)
	    		{
	    		  matrix[i][j] = (int)(Math.random() * range) + min;
	    		}
	    	}
		
		return matrix;
	}
	
	
	 public static void print2D(int mat[][])
	    {
	        // Loop through all rows
	        for (int i = 0; i < mat.length; i++)
	        {
	            // Loop through all elements of current row
	            for (int j = 0; j < mat[i].length; j++)
	            {  System.out.print(mat[i][j] + " ");}
	            System.out.println();
	        }
	       
	        }
	        
	

}
