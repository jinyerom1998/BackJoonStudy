class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        do{
            answer++;
        }while(answer*slice / n < 1);
        return answer;
    }
}