class 645_Set_Mismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr = new int[2];
        for(int i:nums)
        {
            arr1[i-1]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr1[i]==0)
            {
                arr[1] = i+1;
            }
            if(arr1[i]==2)
            {
                arr[0] = i+1;
            }
        }
        return arr;
    }
}