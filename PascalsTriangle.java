package leetcode_solutions;

import java.util.*;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> pre = null;
        
        for(int i = 0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i)
                    temp.add(1);

                else{
                    temp.add(pre.get(j) + pre.get(j-1));
                }
            }
            
            pre = temp;
            ans.add(temp);
        }
        
        return ans;
    }
}