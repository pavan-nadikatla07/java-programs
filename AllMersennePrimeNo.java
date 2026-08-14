class AllMersennePrimeNo{
    public List<Integer> allMersennePrimeNo(int n) {
        int x = 2;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (x - 1 <= n) {
            int m = x - 1;
            boolean c = true;
            if (m < 2)
            c = false;
            if (m > 2 && m % 2 == 0)
                c = false;
            if (m > 3 && m % 3 == 0)
                c = false;
            for (int i = 5; i * i <= m; i = i + 6) {
                if (m % i == 0 || m % (i + 2) == 0) {
                    c = false;
                    break;
                }
            }
            if (c)
                a.add(m);
            x = x * 2;
        }

        return a;
    }
}