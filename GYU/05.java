import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] x = new int[n];
        int i;
        Arrays.fill(x,1);
        for(i=0;i<lost.length;i++){
            x[lost[i]-1] -= 1;
        }
        for(i=0;i<reserve.length;i++){
            x[reserve[i]-1] += 1;
        }
        if(x[0] == 0 && x[1] == 2){
            x[0] = 1;
            x[1] = 1;
        }
        
        for(i=1;i<n;i++){
            if(x[i] == 0 && x[i-1] == 2){
                x[i] += 1;
                x[i-1] -= 1;
            }else if(x[i] == 0 && x[i+1] == 2){
                x[i] += 1;
                x[i+1] -= 1;
            }
        }
        for(i=0;i<n;i++){
            if(x[i] >= 1){
                answer++;
            }
        }
        return answer;
    }
}