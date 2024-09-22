class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] aopb = binomial.split(" ");
        int a = Integer.parseInt(aopb[0]);
        String op = aopb[1];
        int b = Integer.parseInt(aopb[2]);
        switch(op){
            case "+": answer = a+b;break;
            case "-": answer = a-b;break;
            case "*": answer = a*b;break;
        }
        return answer;
    }
}