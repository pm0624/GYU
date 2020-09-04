import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuffer number1 = new StringBuffer(number);
        String answer = "";
        int i,j,check,length = number.length(),n=0;
        if(number.charAt(0) == '0') return "0";
        for(i=0;i<k;i++){
            check = 0;
            if(number1.charAt(n) == '9')n++;
            for(j=n;j<length-1-i;j++){
                
                if(number1.charAt(j) < number1.charAt(j+1)){
                    number1.deleteCharAt(j);
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                number1.deleteCharAt(length-i-1);
            }
        }
        answer += number1;

        return answer;
    }
}