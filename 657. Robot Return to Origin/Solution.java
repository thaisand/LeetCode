class Solution {
    public boolean judgeCircle(String moves) {
        int moveX = 0, moveY = 0; 
        for(int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'R') {
                moveX -= 1; 
            } else if (moves.charAt(i) == 'L') {
                moveX += 1; 
            } else if (moves.charAt(i) == 'U') {
                moveY += 1; 
            } else if (moves.charAt(i) == 'D') {
                moveY -= 1; 
            }
        }
        if(moveX != 0 || moveY != 0) {
            return false;
        } else {
            return true;
        }
    }
}