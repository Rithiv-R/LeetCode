class 724_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int j=0;j<nums.length;j++)
        {
            sum = sum+nums[j];
        }
        for(int i = 0;i<nums.length;i++)
        {
            int left;
            int right;
            if(i==0)
            {
                left = 0;
                right = sum-nums[0];
            }
            else if(i==nums.length-1)
            {
                left = sum - nums[nums.length-1];
                right = 0;
            }
            else{
                left = 0;
                for(int j=0;j<i;j++)
                {
                    left = left+nums[j];
                }
                right = sum - left - nums[i];
            }
            if(left==right)
            {
                return i;
            }
        }
        return -1;
    }
}