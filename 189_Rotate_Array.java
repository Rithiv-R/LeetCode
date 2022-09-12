class 189_Rotate_Array{
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        int counter = k;
        if(k<=nums.length)
        {
            for(int i=nums.length-k;i<nums.length;i++)
            {
                s1.add(nums[i]);
            }
            for(int i=0;i<nums.length-k;i++)
            {
                s1.add(nums[i]);
            }
            for(int i=0;i<nums.length;i++)
            {
                nums[i] = s1.get(i);
            }
        }
        else
        {
            k = (k%nums.length);
            for(int i=nums.length-k;i<nums.length;i++)
            {
                s1.add(nums[i]);
            }
            for(int i=0;i<nums.length-k;i++)
            {
                s1.add(nums[i]);
            }
            for(int i=0;i<nums.length;i++)
            {
                nums[i] = s1.get(i);
            }
        }
    }
}