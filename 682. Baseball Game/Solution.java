
class Solution {
    public static int calPoints(String[] operations) {
        int score = 0;
        int[] scores = new int[operations.length];

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == "+") {
                score = scores[i - 2] + scores[i - 1];
                scores[i] = score;
            } else if (operations[i] == "D") {
                score = 2 * scores[i - 1];
            } else if (operations[i] == "C") {
                if (i >= 2) {
                    scores[i - 1] = 0;
                    score = scores[i - 2];
                    scores[i] = score;
                } else {
                    scores[i - 1] = 0;
                    score = 0;
                    scores[i] = score;
                }
            } else {
                if (i == 0) {
                    score = Integer.parseInt(operations[i]);
                } else {
                    score = scores[i - 1] + Integer.parseInt(operations[i]);
                    scores[i] = score;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String[] ops = { "1", "C" };
        System.out.println(calPoints(ops));
    }
}