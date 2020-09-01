class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int i,j,check=0,check1=0,check2=0;
        int tmp,num1,num2,length1,length2;

        //int[] numbers = {345,9,3454,3,0};
        int cnt = numbers.length-1;
        
        for(i=numbers.length-1;i>=0;i--){
            if(numbers[i] == 0){
                numbers[i] = numbers[cnt];
                numbers[cnt] = 0;
                cnt--;
            }
        }

       

        for(i=0;i<cnt;i++){
            for(j=i+1;j<=cnt;j++){
                num1 = numbers[i];
                length1 = (int)Math.pow(10,(int)(Math.log10(num1)));
                num2 = numbers[j];
                length2 = (int)Math.pow(10,(int)(Math.log10(num2)));
                while(check == 0){                   
                    if(num1/length1 < num2/length2){
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                        num1 = numbers[j];
                        num2 = numbers[i];
                        length1 = (int)Math.pow(10,(int)(Math.log10(numbers[j])));
                        length2 = (int)Math.pow(10,(int)(Math.log10(numbers[i])));
                        check = 1;
                    }else if(num1/length1 == num2/length2){
                        if(length1 == 1 && length2 == 1){
                            check = 1;
                         }else if(length1 != 1 && length2 != 1){
                                 num1 = num1 % length1;
                              num2 = num2 % length2;
                              length1 = length1 / 10;
                          length2 = length2 / 10;
                       }else if(length1 == 1 && length2 != 1){
                           length1 = (int)Math.pow(10,(int)(Math.log10(numbers[i])));
                           num1 = numbers[i];
                             num2 = num2 % length2;
                             length2 = length2 / 10;
                            check1 = 1;
                       }else if(length1 != 1 && length2 == 1){
                            
                            num1 = num1 % length1;
                            length1 = length1 / 10;
                           length2 = (int)Math.pow(10,(int)(Math.log10(numbers[j])));
                         num2 = numbers[j];
                         check2 = 1;
                        }   
                       
                    }else{
                        check=1;
                    }
                    if(check1 == 1 && check2 == 1){
                       if(num1 > num2){
                        tmp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                        num1 = numbers[j];
                        num2 = numbers[i];
                        length1 = (int)Math.pow(10,(int)(Math.log10(numbers[j])));
                        length2 = (int)Math.pow(10,(int)(Math.log10(numbers[i])));
                        }
                        num1 = numbers[i];
                        length1 = (int)Math.pow(10,(int)(Math.log10(numbers[i])));
                        break;
                    }
                }
                check = 0;
                check1 = 0;
                check2 = 0;
            }
        }
        for(i=0;i<numbers.length;i++){
            answer += Integer.toString(numbers[i]);
        }
        return answer;
    }
}