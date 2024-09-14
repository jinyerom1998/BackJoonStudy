import java.util.*;
import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start_num; i>=end_num; i--){
            arr.add(i);
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}