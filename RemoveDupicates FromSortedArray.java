class Solution {
    public int removeDuplicates(int[] nums) {
 
     //If length of array is 1, return 1

       if(nums.length ==1){

            return 1;

        }

        // we will use two pointer technique

        //since we already ahndled when array length is 1

        //take pointer left at index 0

        //take pointer right at index 1

        int left = 0;

        int right=1;

        while(right<nums.length){

            if(nums[left] != nums[right]){

                left++;

                nums[left] = nums[right];

            }

            right++;

        }

        //we return left+1,because our in-place replaced array is at index=left and length of an array is always lastIndex + 1

return left+1;
}
        

    }
