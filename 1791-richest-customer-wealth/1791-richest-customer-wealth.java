import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int i = 0; i < account.length; i++){
                sum += account[i];
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}