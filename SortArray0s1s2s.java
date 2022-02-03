package leetcode_solutions;

class SortArray0s1s2s {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        
        for(int i : nums){
            if(i == 0) c0++;
            
            else if(i == 1){
                c1++;
            }
            
            else c2++;
        }
        
        int k = 0;
        
        while(c0 > 0){
            nums[k] = 0; k++; c0--;
        }
        
        while(c1 > 0){
            nums[k] = 1; k++; c1--;
        }
        
        while(c2 > 0){
            nums[k] = 2; k++; c2--;
        }
    }
}

// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0, mid = 0, high = nums.length -1;
        
//         while(mid <= high){
//             switch(nums[mid]){
//                 case 0:
//                     swap(nums, low, mid);
//                     low++; mid++;
//                     break;
//                 case 1:
//                     mid++;
//                     break;
//                 case 2:
//                     swap(nums, mid, high);
//                     high--;
//                     break;
//             }
//         }
//     }
    
//     public void swap(int A[], int i, int j){
//         int temp = A[i];
//         A[i] = A[j];
//         A[j] = temp;
//     }
// }