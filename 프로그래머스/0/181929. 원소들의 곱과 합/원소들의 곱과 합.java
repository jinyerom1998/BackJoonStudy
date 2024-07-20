class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int multi = 1;
        int sum = 0;
        for(int i=0; i<len; i++){
            multi *= num_list[i];
            sum += num_list[i];
        }
        if(multi<sum*sum) answer =1;
        return answer;
    }
}