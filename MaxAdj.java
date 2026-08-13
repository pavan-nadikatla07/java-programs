class MaxAdj {
    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
               a.add(arr[i]);
            else
               a.add(Math.max(arr[i],arr[i+1]));
        }
        return a;
        
    }
};