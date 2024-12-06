public class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();
        int rows = (my_string.length() + m - 1) / m;
        for (int i = 0; i < rows; i++) {
            int index = i * m + (c - 1); 
            if (index < my_string.length()) {
                result.append(my_string.charAt(index));
            }
        }
        return result.toString();
    }
}