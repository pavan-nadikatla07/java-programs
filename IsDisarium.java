class IsDisarium {
    public boolean isDisarium(int n) {
        String str=String.valueOf(n);;
        int l=str.length();
        int sum=0;
        int pow=l;
        for(int i=0;i<l;i++)
        {
            int digit = str.charAt(i) - '0'; 
            sum += Math.pow(digit, i + 1);
        }
        if(sum==n)
           return true;
        return false;
    }
}