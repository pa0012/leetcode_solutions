package leetcode_solutions;

import java.util.*;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        int r = matrix.length, c = matrix[0].length;

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == 0){
                    l1.add(i);
                    l2.add(j);
                }
            }
        }

        
        for(int i = 0; i<l1.size(); i++){
            int x = l1.get(i);
            int y = l2.get(i);

             for(int k = 0; k<r; k++)
                    matrix[k][y] = 0;

            for(int l = 0; l<c; l++)
                    matrix[x][l] = 0;
        }
    }
}
