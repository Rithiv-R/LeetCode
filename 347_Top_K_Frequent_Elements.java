class 347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> hmap = new LinkedHashMap<Integer,Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> value = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!value.contains(nums[i]))
            {
                int count = 0;
                for(int j=i;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
                hmap.put(nums[i],count);
                value.add(nums[i]);
                set.add(count);
            }
        }
        value.removeAll(value);
        int counter1=0;
        for(Integer i:set.descendingSet())
        {
            if(hmap.size()>=k)
            {
                for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
                {
                    if(counter1<k)
                    {
                        if(entry.getValue()==i)
                        {
                            value.add(entry.getKey()); 
                            counter1++;
                        }
                    }
                }
            }
            else
            {
                for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
                {
                    value.add(entry.getKey());
                }
            }
        } 
        int[] arr = new int[value.size()];
        int counter = 0;
        for(Integer i :value)
        {
            arr[counter++] = i;
        }  
        return arr;
    }
}