import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else{
                c2++;
            }

        }
       // Fill 0s
        int index = 0;
        while (c0 > 0) {
            nums[index++] = 0;
            c0--;
        }

        // Fill 1s
        while (c1 > 0) {
            nums[index++] = 1;
            c1--;
        }

        // Fill 2s
        while (c2 > 0) {
            nums[index++] = 2;
            c2--;
        }
    }
}