import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        List<Integer> list1 = new ArrayList<>();
        list1.add(n);
        while(n!=1){
            if(n%2==0){
                n /= 2;
            }else{
                n = 3*n+1;
            }
            list1.add(n);
        }
        int cnt=0;
        answer = new int [list1.size()];
        for(int temp : list1){
            answer[cnt++] = temp;
        }
        return answer;
    }
}