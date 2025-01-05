import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger num_a = new BigInteger(a);
        BigInteger num_b = new BigInteger(b);
        
        BigInteger num_answer = num_a.add(num_b);
        answer = num_answer+"";
        
        return answer;
    }
}