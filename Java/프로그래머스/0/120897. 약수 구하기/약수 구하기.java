import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> an = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                an.add(i);
            }
        }
        int[] answer = new int[an.size()];
        for(int i=0; i<an.size(); i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}