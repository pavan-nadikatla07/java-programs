class Multiply{
    public int multiply(int[] arr) {
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length/2;i++)
        {
            sum1+=arr[i];
            sum2+=arr[(arr.length/2)+i];
        }
        if(arr.length%2==1)
           sum2+=arr[arr.length-1];
        return sum1*sum2;
    }
}
