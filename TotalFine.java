class TotalFine {

    public long totalFine(int date, int car[], int fine[]) {
        int sum=0;
        for(int i=0;i<car.length;i++)
        {
            if(car[i]%2!=date%2)
            {
                sum+=fine[i];
            }
        }
        return sum;
    }
}