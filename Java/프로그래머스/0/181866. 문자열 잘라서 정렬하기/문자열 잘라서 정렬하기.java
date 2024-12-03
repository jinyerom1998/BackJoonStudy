import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        
        List<String> filteredList = new ArrayList<>();
        for(String part : parts){
            if(!part.isEmpty()){
                filteredList.add(part);
            }
        }
        
        String[] answer = filteredList.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}