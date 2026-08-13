class MoreFrequent {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        int c1=0,c2=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==x)
               c1++;
            if(arr.get(i)==y)
               c2++;
        }
        if(c1>c2) 
           return x;
        else if(c2>c1)
           return y;
        else 
           return Math.min(x,y);
    }
}