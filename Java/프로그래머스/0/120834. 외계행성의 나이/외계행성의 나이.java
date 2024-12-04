class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageString = String.valueOf(age);
        
        for (char digit:ageString.toCharArray()){
            result.append((char)('a'+(digit-'0')));
        }
        
        return result.toString();
    }
}