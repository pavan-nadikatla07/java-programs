class ClockSum {
    static int clockSum(int x, int y) {
        if((x+y)%12==0)
           return 12;
        return (x+y)%12;
        
    }
}