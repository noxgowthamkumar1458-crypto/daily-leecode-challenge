class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        if(n == 1) return 0;

        int ans = 0;
        int cnt = 0;

        while(n > 0){
            if(n % 2 == 0 && n / 2 != 0){
                ans += Math.pow(2, cnt);
            }
            cnt++;
            n /= 2;
        }

        return ans;
    }
}