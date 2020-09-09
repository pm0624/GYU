class Solution {
    public int solution(String name) {
        int answer = 0;
        int st=0,ed=0,len = name.length();
        int i;
        
        for(i=1;i<len;i++){
            if(name.charAt(i) == 'A'){
                st++;
            }else{
                break;
            }
            
        }
        for(i=len-1;i>0;i--){
            if(name.charAt(i) == 'A'){
                ed++;
            }else{
                break;
            }
        }
        
        //if(st == len-1 && name.charAt(0) == 'A') return 0;
        if(st <= ed){
            for(i=0;i<len-ed;i++){
                if(name.charAt(i) >= 'A' && name.charAt(i) <= 'N'){
                    answer += name.charAt(i) - 'A';
                }else{
                    answer += 'Z' - name.charAt(i) + 1;
                }
                answer++;
            }
        }else{
            if(name.charAt(0) >= 'A' && name.charAt(0) <= 'N'){
                answer += name.charAt(0) - 'A';
            }else{
                answer += 'Z' - name.charAt(0) + 1;
            }
            answer++;
            for(i=len-1;i>st;i--){
                if(name.charAt(i) >= 'A' && name.charAt(i) <= 'N'){
                    answer += name.charAt(i) - 'A';
                }else{
                    answer += 'Z' - name.charAt(i) + 1;
                }
                answer++;
            }            
        }
        answer--;
        return answer;
    }
}