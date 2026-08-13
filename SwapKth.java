
class SwapKth{
    public void swapKth(List<Integer> arr, int k) {
        int l=arr.get(k-1);
        int r=arr.get(arr.size()-k);
        arr.set(k-1,r);
        arr.set(arr.size()-k,l);
        
    }
}
