class  260_Single_Number_III{
    public int[] singleNumber(int[] nums) {
        int[] final1 = new int[2];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i:nums)
        {
           if(arr1.contains(i))
           {
               continue;
           }
           else{
               if(arr.contains(i))
                {
                   arr1.add(i);
                    arr.remove(Integer.valueOf(i));
                }
                else
                  {
                      arr.add(i);               
                  }
           }
        }
        int counter=0;
        for(Integer i:arr)
        {
            final1[counter++] = i;   
        }
        return final1;
    }
}