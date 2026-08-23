
   
        class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;   // Destination Pointer

        for (int j = 0; j < nums.length; j++) {   // Explorer Pointer

            if (nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }
}
 