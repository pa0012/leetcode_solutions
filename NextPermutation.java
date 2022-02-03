package leetcode_solutions;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        
        for(int i = n-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                idx = i;
                break;
            }
        }
        
        if(idx == -1){
            reverse(nums,0,n-1);
        }
        
        else{
            int prev = idx;
            for(int i = idx+1; i<n; i++){
                if(nums[i] > nums[idx-1] && nums[i] <= nums[prev]){
                    prev = i;
                }
            }
            
            swap(nums,idx-1,prev);
            reverse(nums,idx,n-1);
        }
    }
    
    public void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public void reverse(int A[], int i, int j){
       while(i < j) swap(A, i++, j--); 
    }
}