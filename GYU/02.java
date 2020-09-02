import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] array1 = new int[array.length];
        int i,j,k;
        for(i=0;i<commands.length;i++){
            for(j=0;j<array.length;j++)
                array1[j] = array[j];
            
            for(j=commands[i][0]-1;j<commands[i][1]-1;j++){
                
                for(k=j+1;k<=commands[i][1]-1;k++){
                    
                    if(array1[j] > array1[k]){
                        int tmp;
                        tmp = array1[j];
                        array1[j] = array1[k];
                        array1[k] = tmp;
                    }
                }
                
            }
            answer[i]=array1[commands[i][0]+commands[i][2]-2];
        }
        return answer;
    }
}