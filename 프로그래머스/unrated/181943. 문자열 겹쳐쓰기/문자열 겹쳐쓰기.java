class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string.substring(0);
        if(answer.length()<my_string.length()){
            int cha = my_string.length()-answer.length();
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}