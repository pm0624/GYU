import java.util.*;
class Solution {
    public int solution(int[] people1, int limit) {
        int answer = 0,count=0;
        int i,j,k=0,sum=0;
        Integer people[] = Arrays.stream(people1).boxed().toArray(Integer[]::new);
        
        Arrays.sort(people, Collections.reverseOrder());
        
        for(i=0;i<people.length;i++){
            sum = people[i];
            count++;
            answer++;
            for(j=people.length-1-k;j>i;j--){
                if(sum+people[j] <= limit && people[j] != 0){
                    sum+= people[j];
                    count++;
                    k++;
                }else{
                    break;
                }
            }
            
            if(count == people.length || people[i] == 0)break;
            sum=0;
        }
        return answer;
    }
}