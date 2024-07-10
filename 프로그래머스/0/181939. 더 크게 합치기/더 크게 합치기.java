class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer2 = Integer.parseInt(a+""+b);
        int answer3 = Integer.parseInt(b+""+a);
        if(answer2>=answer3){
            return answer2;
        }
        else{
            return answer3;
        }
    }
}