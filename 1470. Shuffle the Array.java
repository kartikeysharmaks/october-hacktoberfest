class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[2*n];
        for(int i=0, j=0; i<2*n; i=i+2, j++){   
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
        }
        return arr;
    }
}
