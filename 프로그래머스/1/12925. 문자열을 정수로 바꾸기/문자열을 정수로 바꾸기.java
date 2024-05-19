class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='-'){
            for(int i=1; i<s.length(); i++){
                char c = s.charAt(i);
                answer = answer * 10 + (c - '0');
            }
            answer = answer * (-1);
        }
        else if(s.charAt(0)=='+'){
            for(int i=1; i<s.length(); i++){
                char c = s.charAt(i);
                answer = answer * 10 + (c - '0');
            }
        }
        else{
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                answer = answer * 10 + (c - '0');
            }
        }
        return answer;
    }
}