class 1281_Subtract_the_Product_and_Sum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = sum + rem;
            product = product*rem;
            n = n/10;
        }
        return product-sum;
    }
}