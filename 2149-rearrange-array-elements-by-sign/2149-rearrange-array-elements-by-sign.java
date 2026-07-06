class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
          int[] neg=new int[nums.length/2];
          int p=0;
          int n=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]<0)
    neg[n++]=nums[i];
    else
    pos[p++]=nums[i];
}
int[]arr=new int[nums.length];
for(int i=0;i<pos.length;i++){
    arr[2*i]=pos[i];
    arr[2*i+1]=neg[i];
}

   return arr;
    }
}