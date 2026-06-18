class Solution {

    long MOD = 1000000007;

    private long power(long x, long n) {

        long ans = 1;

        while (n > 0) {

            if ((n & 1) == 1) {
                ans = (ans * x) % MOD;
            }

            x = (x * x) % MOD;
            n /= 2;
        }

        return ans;
    }

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        return (int)((evenWays * oddWays) % MOD);
    }
}