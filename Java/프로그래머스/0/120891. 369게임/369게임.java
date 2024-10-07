class Solution {
    public int solution(int order) {
        String orderStr = String.valueOf(order);
        int count = 0;
        for (char ch : orderStr.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }

        return count;
    }
}