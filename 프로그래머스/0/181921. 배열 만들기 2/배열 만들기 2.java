import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> resultList = new ArrayList<>();
        int count=0;
        int alphaCnt=0;
        
        for(int i=l; i<=r; i++){
            String strI = Integer.toString(i);
            boolean zeroFiveOnly=true;
            for(char ch : strI.toCharArray()) {
                if(ch != '0' && ch != '5'){
                    zeroFiveOnly=false;
                    break;
                }
            }
            if(zeroFiveOnly){
                resultList.add(i);
            }
        }
        if(resultList.isEmpty()){
            answer = new int[]{-1};
            return answer;
        }
        int ansLen = resultList.size();
        answer = new int[ansLen];
        for(int i=0; i<ansLen; i++)
            answer[i] = resultList.get(i);            
        return answer;
    }
}