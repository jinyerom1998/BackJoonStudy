class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int num : num_list){
            if(num%2==0) even += Integer.toString(num);
            if(num%2!=0) odd += Integer.toString(num);
        }
        answer = Integer.parseInt(even)+Integer.parseInt(odd);
        return answer;
    }
}