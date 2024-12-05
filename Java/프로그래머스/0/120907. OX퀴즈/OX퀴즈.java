import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> results = new ArrayList<>();

        for (String equation : quiz) {
            String[] parts = equation.split(" ");
            int x = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);

            boolean isCorrect = false;

            if (operator.equals("+")) {
                isCorrect = (x + y == z);
            } else if (operator.equals("-")) {
                isCorrect = (x - y == z);
            }

            results.add(isCorrect ? "O" : "X");
        }

        return results.toArray(new String[0]);
    }
}