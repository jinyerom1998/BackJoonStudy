class Solution {
    public int solution(int hp) {
        int answer = 0;
        int janggun = hp / 5; //장군개미 추가
        hp = hp - janggun*5;
        int byungjung = hp/3; //병정개미 추가
        hp = hp - byungjung*3;
        int ill = hp; //일개미 추가
        answer = janggun + byungjung + ill;
        return answer;
    }
}