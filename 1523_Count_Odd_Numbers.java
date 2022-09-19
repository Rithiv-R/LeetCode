class 1523_Count_Odd_Numbers_in_an_Interval_Range {
    public int countOdds(int low, int high) {
        if(low%2==0)
        {
            low = low+1;
        }
        if(high%2==0){
            high = high-1;
        }
        return ((high-low+2)/2);
    }
}