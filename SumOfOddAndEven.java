class SumOfOddAndEven {
    public int[] findSum(int n) {
        int[] a=new int[2];
        if(n%2==0)
          a[0]=(n/2)*(n/2);
        else
          a[0]=((n+1)/2)*((n+1)/2);
        if(n>1)
          a[1]=(n*(n+1)/2)-a[0];
        else
          a[1]=0;
        return a;
        
    }
}