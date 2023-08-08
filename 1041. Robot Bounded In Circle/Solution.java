class Solution {
    public boolean isRobotBounded(String instructions) {
        int moveX = 0, moveY = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'R') {
                moveX -= 1;
            } else if (instructions.charAt(i) == 'L') {
                moveX += 1;
            } else if (instructions.charAt(i) == 'U') {
                moveY += 1;
            } else if (instructions.charAt(i) == 'D') {
                moveY -= 1;
            }
        }
        if (moveX != 0 || moveY != 0) {
            return false;
        } else {
            return true;
        }
    }
}