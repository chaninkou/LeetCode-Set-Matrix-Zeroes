package leetcode73;

public class SetMatrixToZerosFunction {
	public void setZeroes(int[][] matrix) {
		// error checking
        if(matrix.length == 0 || matrix == null || matrix[0].length == 0){
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // If we need to flip the first row or first column to zero
        boolean firstRow = false;
        boolean firstColumn = false;
        
        // Check if any zero in first row, break right away and make it true
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        
        // Check if any zero in first column, break right away and make it true
        for(int j = 0; j < m; j++){
            if(matrix[j][0] == 0){
                firstColumn = true;
                break;
            }
        }
        
        // Use the first row and column to know which row or column to turn to zero
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
            	// Check the middle part if its zero, mark the first row and column to zero
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // Finally use the first row and column that we marked to change the inside to zero also
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
            	// If the column or row is zero, make the inside element zero
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Then flip the first row to zero if there was zero in the first row on the original 2D array 
        if(firstRow){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        
        // Then flip the first column to zero if there was zero in the first row on the original 2D array 
        if(firstColumn){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}
