class 137_Single_Number_II {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i: nums)
        {
            if(!arr1.contains(i))
            {
                if(!arr.contains(i))
                {
                  arr.add(i);
                    
                }
                else
                {
                   arr.remove(Integer.valueOf(i));
                   arr1.add(i);
                }
            }
        }
        arr1.removeAll(arr1);
        return arr.get(0);
    }
}