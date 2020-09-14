class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        int i,j;
        for(i=3;i<=sum/3;i++){
            if(sum%i == 0){
                j = sum/i;
                if((i*2+j*2-4)==brown && (i-2)*(j-2)==yellow){
                    if(i >= j){
                        answer[0] = i;
                        answer[1] = j;
                    }else{
                        answer[0] = j;
                        answer[1] = i;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}