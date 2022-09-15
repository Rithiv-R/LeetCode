class 1480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j=0;j<=i;j++)
            {
                sum = sum+nums[j];
            }
            s1.add(sum);
        }
        int[] n = s1.stream().mapToInt(i->i).toArray();
        return n;
    }
}